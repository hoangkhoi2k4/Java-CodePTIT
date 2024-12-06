/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyPhongThucHanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.Normalizer;
import java.util.Comparator;
import java.util.Optional;


/**
 *
 * @author Hoang Van Khoi
 */
public class MainForm extends javax.swing.JFrame {
 private DefaultTableModel tm;
    private List<Phong> list;
    private static int sMa = 1;
    private Phong phSua;
    private int rowSua;

    public Phong getPhSua() {
        return phSua;
    }

    public void setPhSua(Phong phSua) {
        this.phSua = phSua;
    }

    public int getRowSua() {
        return rowSua;
    }

    public void setRowSua(int rowSua) {
        this.rowSua = rowSua;
    }
    public MainForm() {
        initComponents();
        setTitle("Danh sach phong thuc hanh: ");
        setLocationRelativeTo(this);
        initTable();
        btnThem.addActionListener(e->{
            FormThem f = new FormThem(this, true);
            f.setVisible(true);
        });
        btnLuu.addActionListener(e->{
            IOFile.ghi("PHONG.DAT", list);
        });
        btnXoa.addActionListener(e->{
            int r = tbThucHanh.getSelectedRow();
            if(r >= 0 && r < tbThucHanh.getRowCount()){
                list.remove(r);
                tm.removeRow(r);
            } else {
                JOptionPane.showMessageDialog(this, "Vui long chon dung phong can xoa");
            }
            
        });
        
        btnSua.addActionListener(e->{
            int row = tbThucHanh.getSelectedRow();
            if(row >= 0 && row < tbThucHanh.getRowCount()){
                setRowSua(row);
                setPhSua(list.get(row));
                FormSua f = new FormSua(this, true);
                f.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Vui long chon dung phong can sua");
            }
            
        });
        cbSapXep.addItemListener(e -> {
            int index = cbSapXep.getSelectedIndex();
            if (index == 0) {
                list.sort((Phong m1, Phong m2) -> m1.getTenPhong().compareToIgnoreCase(m2.getTenPhong()));
                tm.setRowCount(0);
                for (Phong i : list) {
                    tm.addRow(i.toObject());
                }
            }
            if (index == 1) {
                list.sort((Phong m1, Phong m2) -> m1.getSoLuong()- m2.getSoLuong());
                tm.setRowCount(0);
                for (Phong i : list) {
                    tm.addRow(i.toObject());
                }
            }
            tm.setRowCount(0);
            for (Phong i : list) {
                tm.addRow(i.toObject());
            }
        });
        btnThongKe.addActionListener(e -> {
            Map<String, Optional<Phong>> m = list.stream().collect(
                    Collectors.groupingBy(
                            Phong::getKieuPhong,
                            Collectors.maxBy(Comparator.comparingInt(Phong::getSoLuong))
                    )
            );

            txtThongKe.setText("Thong ke phong co so may tinh max:\n");
            m.forEach((k, v) -> {
                if (v.isPresent()) {
                    txtThongKe.append(k + ": " + v.get().getSoLuong() + "\n");
                }
            });
        });

        btnTimKiem.addActionListener(e -> {
            String key = txtTimKiem.getText().toLowerCase();
            List<Phong> l = new ArrayList<>();
            if (key != null) {
                list.forEach(t -> {
                    // Chuyen ve dang khong co dau
                    String nor = Normalizer.normalize(t.getKieuPhong(), Normalizer.Form.NFD);
                    String s = nor.replaceAll("\\p{M}", "");
                    if (t.getTenPhong().toLowerCase().contains(key) || s.toLowerCase().contains(key)) {
                        l.add(t);
                    }
                });
            }
            tm.setRowCount(0);
            for (Phong i : l) {
                tm.addRow(i.toObject());
            }
        });
        btnHienThi.addActionListener(e -> {
            tm.setRowCount(0);
            for (Phong i : list) {
                tm.addRow(i.toObject());
            }
        });
    }
    
    public void initTable(){
        String[] header = {
            "Ma phong", 
            "Ten phong", 
            "So luong may",
            "Kieu phong"
        };
        tm = new DefaultTableModel(header, 0);
        tbThucHanh.setModel(tm);
        
        list =  IOFile.doc("PHONG.DAT");
        if(list == null){
            list = new ArrayList<>();
        } else {
            for(Phong x : list){
                tm.addRow(x.toObject());
            }
            list.sort((Phong p1, Phong p2)-> p1.getMa().compareToIgnoreCase(p2.getMa()));
            sMa = Integer.parseInt(list.get(list.size() - 1).getMa()) + 1;
        }
    }
    
    public void themMoi(String tenPhong, int soLuong, String kieuPhong){
        Phong p = new Phong(String.format("%05d", sMa++), tenPhong, soLuong, kieuPhong);
        tm.addRow(p.toObject());
        list.add(p);
    }
    
    public void sua(String tenPhong, int soLuong, String kieuPhong){
        Phong p = new Phong(getPhSua().getMa(), tenPhong, soLuong, kieuPhong);
        list.set(rowSua, p);
        tm.setRowCount(0);
        for(Phong x : list){
            tm.addRow(x.toObject());
        }
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
        tbThucHanh = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtThongKe = new javax.swing.JTextArea();
        btnThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbThucHanh.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbThucHanh);

        btnThem.setText("Them moi");

        btnXoa.setText("Xoa");

        btnSua.setText("Sua");

        btnHienThi.setText("Hien Thi");

        btnLuu.setText("Luu");

        jLabel1.setText("Sap xep theo:");

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ten phong", "So luong phong", " " }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        jLabel2.setText("Tim kiem");

        btnTimKiem.setText("Tim kiem");

        txtThongKe.setColumns(20);
        txtThongKe.setRows(5);
        jScrollPane2.setViewportView(txtThongKe);

        btnThongKe.setText("Thong ke");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cbSapXep, 0, 161, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnTimKiem)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(45, 45, 45)
                                .addComponent(btnXoa)
                                .addGap(41, 41, 41)
                                .addComponent(btnSua)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLuu)
                                .addGap(50, 50, 50)
                                .addComponent(btnHienThi)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnThongKe)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnHienThi)
                    .addComponent(btnLuu))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnThongKe)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbThucHanh;
    private javax.swing.JTextArea txtThongKe;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
