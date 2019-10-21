/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author thaotruogg
 */
public class Input_Product_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Input_Product_GUI
     */
    public Input_Product_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCloseWindows = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenSp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtDonGia = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTenSp1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtTenSp2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(401, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCloseWindows.setBackground(new java.awt.Color(52, 152, 219));
        btnCloseWindows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWindowsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseWindowsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseWindowsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseWindowsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCloseWindowsMouseReleased(evt);
            }
        });
        btnCloseWindows.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/close_16px.png"))); // NOI18N
        btnCloseWindows.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jPanel1.add(btnCloseWindows, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 0, 40, 40));

        jLabel4.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SẢN PHẨM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 39));

        jPanel2.setBackground(new java.awt.Color(117, 117, 117));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(117, 117, 117));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhua", "Gach", "Thuy tinh", "Xi mang" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 130, 30));

        jLabel1.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VNĐ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tên sản phẩm");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        txtTenSp.setBackground(new java.awt.Color(117, 117, 117));
        txtTenSp.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txtTenSp.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSp.setText("Nhập tên sản phẩm");
        txtTenSp.setBorder(null);
        txtTenSp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenSpMouseClicked(evt);
            }
        });
        txtTenSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSpActionPerformed(evt);
            }
        });
        jPanel2.add(txtTenSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 260, 30));

        jLabel7.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Loại");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 30));

        jLabel8.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Số lượng");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 10));

        txtDonGia.setBackground(new java.awt.Color(117, 117, 117));
        txtDonGia.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txtDonGia.setForeground(new java.awt.Color(255, 255, 255));
        txtDonGia.setText("1000000");
        txtDonGia.setBorder(null);
        txtDonGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDonGiaMouseClicked(evt);
            }
        });
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });
        jPanel2.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 210, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 210, 10));

        jLabel9.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nhà sản xuất");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(52, 152, 219));
        jButton1.setText("LƯU");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 80, 40));

        jLabel10.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Đơn giá");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtTenSp1.setBackground(new java.awt.Color(117, 117, 117));
        txtTenSp1.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txtTenSp1.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSp1.setText("Nhập tên nhà sản xuất");
        txtTenSp1.setBorder(null);
        txtTenSp1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenSp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenSp1MouseClicked(evt);
            }
        });
        txtTenSp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSp1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtTenSp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 260, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 260, 10));

        jLabel11.setFont(new java.awt.Font("Nunito ExtraBold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mã sản phẩm");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        txtTenSp2.setBackground(new java.awt.Color(117, 117, 117));
        txtTenSp2.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txtTenSp2.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSp2.setText("Nhập mã sản phẩm");
        txtTenSp2.setBorder(null);
        txtTenSp2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTenSp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenSp2MouseClicked(evt);
            }
        });
        txtTenSp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSp2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtTenSp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 260, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 399, 459));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseWindowsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowsMouseEntered
        btnCloseWindows.setBackground(new Color(244, 67, 54));
    }//GEN-LAST:event_btnCloseWindowsMouseEntered

    private void btnCloseWindowsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowsMouseExited
        btnCloseWindows.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnCloseWindowsMouseExited

    private void btnCloseWindowsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowsMousePressed
        btnCloseWindows.setBackground(new Color(129, 212, 250));
    }//GEN-LAST:event_btnCloseWindowsMousePressed

    private void btnCloseWindowsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowsMouseReleased
        btnCloseWindows.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnCloseWindowsMouseReleased

    private void btnCloseWindowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowsMouseClicked
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCloseWindowsMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void txtTenSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSpActionPerformed
        
    }//GEN-LAST:event_txtTenSpActionPerformed

    private void txtTenSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenSpMouseClicked
        txtTenSp.setText("");
    }//GEN-LAST:event_txtTenSpMouseClicked

    private void txtDonGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDonGiaMouseClicked
        txtDonGia.setText("");
    }//GEN-LAST:event_txtDonGiaMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtTenSp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenSp1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSp1MouseClicked

    private void txtTenSp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSp1ActionPerformed

    private void txtTenSp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenSp2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSp2MouseClicked

    private void txtTenSp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSp2ActionPerformed

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
            java.util.logging.Logger.getLogger(Input_Product_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Product_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Product_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Product_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Product_GUI().setVisible(true);
            }
        });
    }

    int xx, xy;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCloseWindows;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtTenSp;
    private javax.swing.JTextField txtTenSp1;
    private javax.swing.JTextField txtTenSp2;
    // End of variables declaration//GEN-END:variables
}
