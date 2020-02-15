package Interfaces;

import Conexiones.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Conexion conec;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.conec = new Conexion();
    }

    public void iniciar() {
        String val = conec.ingLogin(Usuario.getText(), Pass.getText());
        System.out.print("\nVAL ES: " + val);
        if (val.matches("1")) {
            System.out.print("XDDD1");
        }
        if (val.matches("2")) {
            System.out.print("XDDD2");
        }
        if (val.matches("3")) {
            System.out.print("XDDD3");
        } else {
            System.out.print("NO COMPARISON");
        }
        if (val != "") {
            this.dispose();
            new Modulo().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Te la creiste WE\n", "Error  de conexion", JOptionPane.ERROR_MESSAGE);
        }
        Usuario.setText("");
        Pass.setText("");

    }

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
        getContentPane().add(Usuario);
        Usuario.setBounds(220, 350, 150, 30);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        this.dispose();
        new Modulo().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        iniciar();


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
