/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelompok3.app.pasien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fauza
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        clean();
    }
    
    private void clean(){
        userInput.setText("");
        passInput.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        labelNama = new javax.swing.JLabel();
        labelNama1 = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        labelNama2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();
        passInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(35, 40, 44));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNama.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNama.setText("Nama Dokter");
        background.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        labelNama1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelNama1.setForeground(new java.awt.Color(255, 255, 255));
        labelNama1.setText("Password");
        background.add(labelNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        userInput.setBackground(new java.awt.Color(255, 255, 255));
        background.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 39));

        labelNama2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelNama2.setForeground(new java.awt.Color(255, 255, 255));
        labelNama2.setText("Username");
        background.add(labelNama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        btnClear.setBackground(new java.awt.Color(21, 25, 28));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 25, 28), 1, true));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        background.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 109, 49));

        btnLogin1.setBackground(new java.awt.Color(21, 25, 28));
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Login");
        btnLogin1.setBorder(null);
        btnLogin1.setOpaque(true);
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        background.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 109, 49));

        passInput.setBackground(new java.awt.Color(255, 255, 255));
        background.add(passInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clean();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        try {
            String user = userInput.getText();
            String pass = passInput.getText();
            
            String sql = "SELECT * FROM admin WHERE username = '" + user + "' AND password = '" + pass + "'";
            Connection Vconn = (Connection)DBconnection.configDB();
            Statement s = Vconn.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            if(r.next()){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                new kamar().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel labelNama2;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
