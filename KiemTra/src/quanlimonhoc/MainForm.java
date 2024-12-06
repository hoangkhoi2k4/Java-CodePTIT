package quanlimonhoc;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;

public class MainForm extends javax.swing.JFrame {

    private DefaultTableModel tm;
    private List<MonHoc> list;
    private static int sMa = 1;

    private MonHoc mhSua;
    private int rowSua;

    public MonHoc getMhSua() {
        return mhSua;
    }

    public void setMhSua(MonHoc mhSua) {
        this.mhSua = mhSua;
    }

    public int getRowSua() {
        return rowSua;
    }

    public void setRowSua(int rowSua) {
        this.rowSua = rowSua;
    }

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setTitle("Chuong trinh quan li mon hoc");
        setLocationRelativeTo(this);
        initTable();
        btnThem.addActionListener(e -> {
            FormThem f = new FormThem(this, true);
            f.setVisible(true);
        });
        btnLuu.addActionListener(e -> {
            IOFile.ghi("MONHOC.DAT", list);
        });
        btnSua.addActionListener(e -> {
            int row = tbMonHoc.getSelectedRow();
            if (row >= 0 && row < tbMonHoc.getRowCount()) {
                setRowSua(row);//dong sua
                setMhSua(list.get(row));//doi tuong sua
                FormSua f = new FormSua(this, true);
                f.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Chon dong de sua");
            }

        });
        cbSapXep.addItemListener(e -> {
            int index = cbSapXep.getSelectedIndex();
            if (index == 0) {
                list.sort((MonHoc m1, MonHoc m2) -> m1.getTenMon().compareToIgnoreCase(m2.getTenMon()));
                tm.setRowCount(0);//xoa sach bang roi ghi lai
                for (MonHoc i : list) {
                    tm.addRow(i.toObject());
                }
            }
            if (index == 1) {
                list.sort((MonHoc m1, MonHoc m2) -> m1.getSoTin() - m2.getSoTin());
                tm.setRowCount(0);//xoa sach bang roi ghi lai
                for (MonHoc i : list) {
                    tm.addRow(i.toObject());
                }
            }
            tm.setRowCount(0);//xoa sach bang roi ghi lai
            for (MonHoc i : list) {
                tm.addRow(i.toObject());
            }
        });
        btnThongKe.addActionListener(e -> {
            Map<String, Integer> m = list.stream().collect(
                    Collectors.groupingBy(MonHoc::getLoaiMon,
                            Collectors.summingInt(MonHoc::getSoTin)));
            txtThongKe.setText("Tong so tin chi theo loai mon:\n");
            m.forEach((k, v) -> {
                txtThongKe.append(k + ": " + v + "\n");
            });
        });
        btnTimKiem.addActionListener(e -> {
            String key = txtTim.getText();
            List<MonHoc> l = new ArrayList<>();
            if (key != null) {
                list.forEach(t -> {
                    if (t.getTenMon().toLowerCase().contains(key) || t.getLoaiMon().toLowerCase().contains(key)) {
                        l.add(t);
                    }
                });
            }
            tm.setRowCount(0);//xoa sach bang roi ghi lai
            for (MonHoc i : l) {
                tm.addRow(i.toObject());
            }
        });
        btnXoa.addActionListener(e -> {
            int selectedRow = tbMonHoc.getSelectedRow();
            if (selectedRow != -1) {
                list.remove(selectedRow);
                tm.removeRow(selectedRow);
            }
        });
        btnHienThi.addActionListener(e -> {
            tm.setRowCount(0);//xoa sach bang roi ghi lai
            for (MonHoc i : list) {
                tm.addRow(i.toObject());
            }
        });
    }

    public void themMoi(String tenMon, int soTin, String loaiMon) {
        MonHoc mh = new MonHoc("INT" + String.format("%03d", sMa++), tenMon, soTin, loaiMon);
        tm.addRow(mh.toObject());
        list.add(mh);
    }

    public void sua(String tenMon, int soTin, String loaiMon) {
        MonHoc mh = new MonHoc(getMhSua().getMa(), tenMon, soTin, loaiMon);
        list.set(getRowSua(), mh);
        tm.setRowCount(0);//xoa sach bang roi ghi lai
        for (MonHoc i : list) {
            tm.addRow(i.toObject());
        }
    }

    private void initTable() {
        String[] header = {"Ma", "Ten Mon", "So tin chi", "Loai mon"};
        tm = new DefaultTableModel(header, 0);
        tbMonHoc.setModel(tm);
        list = IOFile.doc("MONHOC.DAT");
        if (list == null) {
            list = new ArrayList<>();
        } else {
            for (MonHoc i : list) {
                tm.addRow(i.toObject());
            }
            list.sort((MonHoc m1, MonHoc m2) -> m1.getMa().compareToIgnoreCase(m2.getMa()));
            sMa = Integer.parseInt(list.get(list.size() - 1).getMa().substring(3)) + 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMonHoc = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtThongKe = new javax.swing.JTextArea();
        btnThongKe = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMonHoc);

        btnThem.setText("Them moi");

        btnXoa.setText("Xoa");

        btnSua.setText("Sua");

        btnLuu.setText("Luu");

        jLabel1.setText("Sap xep theo");

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ten mon", "So tin chi" }));

        jLabel2.setText("Tim kiem");

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tim kiem");

        txtThongKe.setEditable(false);
        txtThongKe.setColumns(20);
        txtThongKe.setRows(5);
        jScrollPane2.setViewportView(txtThongKe);

        btnThongKe.setText("Thong ke");

        btnHienThi.setText("Hien Thi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnThongKe))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnTimKiem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(60, 60, 60)
                        .addComponent(btnHienThi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnHienThi))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

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
    private javax.swing.JTable tbMonHoc;
    private javax.swing.JTextArea txtThongKe;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
