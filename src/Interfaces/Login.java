/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexiones.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author jonhe
 */
public class Login extends javax.swing.JFrame {

      Conexion conec;
    
    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.conec= new Conexion();
    }

    
     public void iniciar(){
        Connection  cn =  conec.getConexion( Usuario.getText(), Pass.getText());
        if(cn!=null){
            this.dispose();
            new Modulo().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, " usuario o contraseña incorrectos "," Sistema ", JOptionPane.ERROR_MESSAGE);
            Usuario.setText("");
            Pass.setText("");
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

        Usuario = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MIlkSoft ingreso al sistema");
        setMaximumSize(new java.awt.Dimension(465, 735));
        setMinimumSize(new java.awt.Dimension(465, 735));
        setPreferredSize(new java.awt.Dimension(465, 735));
        setSize(new java.awt.Dimension(465, 735));
        getContentPane().setLayout(null);

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario);
        Usuario.setBounds(220, 350, 150, 30);

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        getContentPane().add(Pass);
        Pass.setBounds(220, 410, 150, 30);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 550, 120, 30);

        jButton2.setText("ENTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 550, 100, 30);

        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(465, 710));
        jLabel5.setMinimumSize(new java.awt.Dimension(465, 710));
        jLabel5.setPreferredSize(new java.awt.Dimension(465, 710));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 450, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        iniciar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
