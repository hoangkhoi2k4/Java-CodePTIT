package BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.stream.Collectors;

public class Main extends javax.swing.JFrame {
    private List<Oto> list;
    private DefaultTableModel tmOto;
    private static int sMa=1;
    private boolean them=false;
    private boolean sua=false;
    public Main() {
        initComponents();
        setTitle("Quan ly o to");
        setLocationRelativeTo(this);
        txtMa.setEditable(false);
        initTable();
    }
    private void setButton(boolean s){
        btnBoQua.setEnabled(!s);
        btnCapNhat.setEnabled(!s);
        btnHienThi.setEnabled(s);
        btnLuuFile.setEnabled(s);
        btnSua.setEnabled(s);
        btnThemMoi.setEnabled(s);
        btnThongKe.setEnabled(s);
        btnTimKiem.setEnabled(s);
        btnXoa.setEnabled(s);
    }
    
    
    private void initTable(){
        String[] header={"Ma","Loai","Tien","So Xe"};
        tmOto=new DefaultTableModel(header,0);
        tbOto.setModel(tmOto);
        cbLoaiXe.removeAllItems();
        String[] x={"Xe 4 cho","Xe 4 cho cao cap","Xe 7 cho","Xe tai"};
        for(String i:x){
            cbLoaiXe.addItem(i);
        }
        
        list=IOFile.doc("OTO.dat");
        
        
        if(list==null){
            list=new ArrayList<>();
        }
        else{
            tmOto.setRowCount(0);
           
        }
        for(Oto i:list){
            tmOto.addRow(i.toObject());
        }
        list.sort((Oto o1,Oto o2)->o1.getMa().compareToIgnoreCase(o2.getMa()));
        sMa=Integer.parseInt(list.get(list.size()-1).getMa())+1;
 
        
        
        
        setButton(true);
        btnThemMoi.addActionListener(e->{
            txtMa.setText(String.format("%04d", sMa));
            setButton(false);
            them=true;
            cbLoaiXe.requestFocus();
            
        });
        
        btnBoQua.addActionListener(e->{
            setButton(true);
            txtMa.setText("");
            them=false;            
        });
        
        btnCapNhat.addActionListener(e->{
            if(them){
                Oto t=new Oto(txtMa.getText(),cbLoaiXe.getSelectedItem().toString(),
                                Double.parseDouble(txtTien.getText()),
                                txtSoXe.getText());
                tmOto.addRow(t.toObject());
                list.add(t);
                setButton(true);
                txtMa.setText("");
                txtTien.setText("");
                txtSoXe.setText("");
                them=false;  
                sMa++;
            }
            if(sua){
                int row=tbOto.getSelectedRow();
                if(row>0 &&row <tbOto.getRowCount()){
                    Oto t=new Oto(txtMa.getText(),cbLoaiXe.getSelectedItem().toString(),
                                Double.parseDouble(txtTien.getText()),
                                txtSoXe.getText());
                    list.set(row, t);
                    sua=false;
                    tmOto.setValueAt(t.getLoaiXe(),row,1);
                    tmOto.setValueAt(t.getTienThue(),row,2);
                    tmOto.setValueAt(t.getSoXe(),row,3);
                    setButton(true);
                }
            }
         
        });
        
        btnLuuFile.addActionListener(e->{
            IOFile.ghi("OTO.dat",list);
         
        });
        
//        btnBoQua.addActionListener(e->{
//            int row=tbOto.getSelectedRow();
//            if(them){
//                them=false;
//            }
//            if(sua){
//                sua=false;
//            }
//            if(row>0 && row<tbOto.getRowCount()){
//                list.remove(row);
//                tmOto.removeRow(row);
//            }else{
//                JOptionPane.showMessageDialog(this, "Chon dong de xoa");
//            }         
//        });
        
        cbSapXep.addItemListener(e->{
            int index=cbSapXep.getSelectedIndex();
            if(index==0){
                list.sort((Oto o1,Oto o2)->
                        Double.compare(o1.getTienThue(), o2.getTienThue()));
            }
            tmOto.setRowCount(0);
            for(Oto i:list){
                tmOto.addRow(i.toObject());
            }
            if(index==1){
                list.sort((Oto o1,Oto o2)->
                        o1.getSoXe().compareToIgnoreCase(o1.getSoXe()));
            }
            tmOto.setRowCount(0);
            for(Oto i:list){
                tmOto.addRow(i.toObject());
            }
        });
        
        btnThongKe.addActionListener(e->{
            Map<String,Double> m=list.stream().collect(
                                                Collectors.groupingBy(Oto::getLoaiXe,
                                                        Collectors.summingDouble(Oto::getTienThue)));
            txtThongKe.setText("Thong ke theo loai xe");
            for(String k:m.keySet()){
                txtThongKe.append("\n"+k+": "+m.get(k));
            }
        });
        
        btnTimKiem.addActionListener(e -> {
        try {
            double tienThueTimKiem = Double.parseDouble(txtTimKiem.getText());

            List<Oto> ketQuaTimKiem = list.stream()
                    .filter(oto -> oto.getTienThue() == tienThueTimKiem)
                    .collect(Collectors.toList());

            txtThongKe.setText("Kết quả tìm kiếm các xe có tiền thuê là " + tienThueTimKiem + ":");

            if (ketQuaTimKiem.isEmpty()) {
                txtThongKe.append("\nKhông tìm thấy xe nào có tiền thuê là " + tienThueTimKiem);
            } else {
                for (Oto oto : ketQuaTimKiem) {
                    txtThongKe.append("\nLoại xe: " + oto.getLoaiXe() + ", Tiền thuê: " + oto.getTienThue());
                }
            }
        } catch (NumberFormatException ex) {
            txtThongKe.setText("Giá trị tiền thuê nhập vào không hợp lệ. Vui lòng nhập một số.");
        }
    });

        
        btnSua.addActionListener(e->{
            int row=tbOto.getSelectedRow();
            sua=true;
            if(row>0 &&row <tbOto.getRowCount()){
                Oto t=new Oto(txtMa.getText(),cbLoaiXe.getSelectedItem().toString(),
                            Double.parseDouble(txtTien.getText()),
                            txtSoXe.getText());
                list.set(row, t);
                sua=false;
                tmOto.setValueAt(t.getLoaiXe(),row,1);
                tmOto.setValueAt(t.getTienThue(),row,2);
                tmOto.setValueAt(t.getSoXe(),row,3);
                setButton(true);
            }
        });
        btnXoa.addActionListener(e->{
            int row=tbOto.getSelectedRow();
            if(them){
                them=false;
            }
            if(sua){
                sua=false;
            }
            if(row>0 && row<tbOto.getRowCount()){
                list.remove(row);
                tmOto.removeRow(row);
            }else{
                JOptionPane.showMessageDialog(this, "Chon dong de xoa");
            }         
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbOto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTien = new javax.swing.JTextField();
        txtSoXe = new javax.swing.JTextField();
        cbLoaiXe = new javax.swing.JComboBox<>();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnBoQua = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuuFile = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        cbSapXep = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtThongKe = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbOto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbOto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOto);

        jLabel1.setText("Ma");

        jLabel2.setText("Loai");

        jLabel3.setText("Tien");

        jLabel4.setText("So xe");

        txtMa.setEditable(false);
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        txtTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienActionPerformed(evt);
            }
        });

        cbLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThemMoi.setText("Them moi");

        btnCapNhat.setText("Cap nhat");

        btnBoQua.setText("Bo qua");

        btnSua.setText("Sua");

        btnXoa.setText("Xoa");

        btnLuuFile.setText("Luu file");
        btnLuuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuFileActionPerformed(evt);
            }
        });

        btnHienThi.setText("Hien thi");

        btnTimKiem.setText("Tim");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tien thue", "So xe", " " }));

        txtThongKe.setColumns(20);
        txtThongKe.setRows(5);
        jScrollPane2.setViewportView(txtThongKe);

        jLabel5.setText("Sx Theo");

        jLabel6.setText("Tim Kiem");

        btnThongKe.setText("Thong ke");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMa)
                            .addComponent(txtTien)
                            .addComponent(txtSoXe)
                            .addComponent(cbLoaiXe, 0, 155, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLuuFile)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoQua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHienThi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTimKiem)
                                    .addComponent(btnThongKe))
                                .addGap(58, 58, 58)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi)
                    .addComponent(btnLuuFile)
                    .addComponent(btnCapNhat)
                    .addComponent(btnBoQua)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnHienThi))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void txtTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienActionPerformed

    private void btnLuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuFileActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void tbOtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOtoMouseClicked
        int row=tbOto.getSelectedRow();
        if(row>0 && row<tbOto.getRowCount()){
            txtMa.setText(tmOto.getValueAt(row, 0).toString());
            txtTien.setText(tmOto.getValueAt(row, 2).toString());
            String loai=tmOto.getValueAt(row, 2).toString();
            for(int i=0;i<cbLoaiXe.getItemCount();i++){
                if(cbLoaiXe.getItemAt(i).toString().equalsIgnoreCase((loai))){
                    cbLoaiXe.setSelectedIndex((i));
                }
            }
            txtSoXe.setText(tmOto.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_tbOtoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoQua;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnLuuFile;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiXe;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbOto;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoXe;
    private javax.swing.JTextArea txtThongKe;
    private javax.swing.JTextField txtTien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

