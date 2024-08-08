/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.MonAnDao;
import POJO.MonAn;
import javax.swing.JOptionPane;

/**
 *
 * @author AVITA
 */
public class MonAnLayout extends javax.swing.JFrame {

    /**
     * Creates new form MonAnLayout
     */
    public MonAnLayout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenMonAn = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        btnThemMonAn = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(229, 221, 197));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setText("THÊM MÓN ĂN");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/images (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel9)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(190, 215, 220));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("   TÊN MÓN");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("   ĐƠN GIÁ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("LOẠI MÓN ĂN");

        btnThemMonAn.setBackground(java.awt.SystemColor.activeCaption);
        btnThemMonAn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnThemMonAn.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/plus(1).png"))); // NOI18N
        btnThemMonAn.setText("THÊM");
        btnThemMonAn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnThemMonAn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnThemMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonAnActionPerformed(evt);
            }
        });

        btnThoat.setBackground(java.awt.SystemColor.activeCaption);
        btnThoat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/back(1).png"))); // NOI18N
        btnThoat.setText("TRỞ VỀ");
        btnThoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThemMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnThemMonAn))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonAnActionPerformed
//        String tenMon = txtTenMonAn.getText(); // Lấy tên tài khoản từ trường nhập liệu
//        Double donGia = Double.parseDouble(txtDonGia.getText());
//        String loai = txtLoai.getText();
//        //     Double donGia = Integer.parseDu(txtB.getText());
//        

         // Lấy dữ liệu từ các trường nhập liệu
    String tenMon = txtTenMonAn.getText().trim();
    String donGiaText = txtDonGia.getText().trim();
    String loai = txtLoai.getText().trim();
    
    // Kiểm tra xem các trường có rỗng không
    if (tenMon.isEmpty() || donGiaText.isEmpty() || loai.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    double donGia;
    try {
        donGia = Double.parseDouble(donGiaText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Đơn giá không hợp lệ!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        return;
    }
        // Tạo đối tượng NguoiDung
        MonAn monAn = new MonAn();
        monAn.setTenMonAn(tenMon);
        monAn.setGia(donGia);
        monAn.setLoaiMonAn(loai);

        Boolean thanhCong = MonAnDao.ThemMonAN(monAn);

        // Hiển thị thông báo kết quả
        if (thanhCong) {
            JOptionPane.showMessageDialog(this, "Thêm món thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm món thất bại!");
        }
    }//GEN-LAST:event_btnThemMonAnActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        TrangChuQL trangChuQL = new TrangChuQL();
        trangChuQL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(MonAnLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonAnLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonAnLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonAnLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonAnLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemMonAn;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtTenMonAn;
    // End of variables declaration//GEN-END:variables
}
