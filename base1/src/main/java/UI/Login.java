/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import implementaciones.ClientesDAO;
import interfaces.IClientesDAO;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Label;

/**
 *
 * @author eruma
 */
public class Login extends javax.swing.JFrame {
    private final IClientesDAO clientesDao;
    /**
     * Creates new form Login
     */
    
    public Login(IClientesDAO clientesDao) {
        initComponents();
        this.clientesDao=clientesDao;
        this.pswFieldPassword.setEchoChar((char) 0); //Descifrar password field
    }

    public Login() {
        this.clientesDao = null;
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        btnRetiroSinCuenta = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        pswFieldPassword = new javax.swing.JPasswordField();
        txtFieldUser = new javax.swing.JTextField();
        lblIconos = new javax.swing.JLabel();
        lblRecuadro = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BancoElmerKim");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);

        pnlFondo.setFocusable(false);
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetiroSinCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRetiro.png"))); // NOI18N
        btnRetiroSinCuenta.setBorder(null);
        btnRetiroSinCuenta.setBorderPainted(false);
        btnRetiroSinCuenta.setContentAreaFilled(false);
        btnRetiroSinCuenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRetiroSelected.png"))); // NOI18N
        btnRetiroSinCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRetiro.png"))); // NOI18N
        btnRetiroSinCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroSinCuentaActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRetiroSinCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 423, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRegistrarse.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRegistrarseSelected.png"))); // NOI18N
        btnRegistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRegistrarse.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnIniciarSesion.png"))); // NOI18N
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnIniciarSesionSelected.png"))); // NOI18N
        btnIniciarSesion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnIniciarSesion.png"))); // NOI18N
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlFondo.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        pswFieldPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        pswFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        pswFieldPassword.setText("Ingrese su contraseña");
        pswFieldPassword.setBorder(null);
        pswFieldPassword.setPreferredSize(new java.awt.Dimension(96, 16));
        pswFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswFieldPasswordFocusLost(evt);
            }
        });
        pswFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pswFieldPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pswFieldPasswordMouseExited(evt);
            }
        });
        pswFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswFieldPasswordKeyTyped(evt);
            }
        });
        pnlFondo.add(pswFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 337, 310, -1));

        txtFieldUser.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldUser.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldUser.setText("Ingrese su usuario");
        txtFieldUser.setBorder(null);
        txtFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldUserFocusLost(evt);
            }
        });
        txtFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFieldUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFieldUserMouseExited(evt);
            }
        });
        txtFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUserActionPerformed(evt);
            }
        });
        txtFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldUserKeyTyped(evt);
            }
        });
        pnlFondo.add(txtFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 291, 310, -1));

        lblIconos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIconos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconos.png"))); // NOI18N
        pnlFondo.add(lblIconos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblRecuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recuadroWeb.png"))); // NOI18N
        lblRecuadro.setAlignmentY(0.0F);
        pnlFondo.add(lblRecuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.png"))); // NOI18N
        lblFondo.setAlignmentY(0.0F);
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUserActionPerformed

    }//GEN-LAST:event_txtFieldUserActionPerformed

    private void txtFieldUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldUserMouseEntered
        if (txtFieldUser.getText().equals("Ingrese su usuario"))
            txtFieldUser.setText("");
    }//GEN-LAST:event_txtFieldUserMouseEntered

    private void txtFieldUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldUserMouseExited
        if (txtFieldUser.getText().equals("")) {
            txtFieldUser.setText("Ingrese su usuario");
        } else if (!txtFieldUser.getText().equals("Ingrese su usuario")) {
            evt.consume();
        }

    }//GEN-LAST:event_txtFieldUserMouseExited

    private void txtFieldUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldUserFocusLost
        if (txtFieldUser.getText().equals("")) {
            txtFieldUser.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_txtFieldUserFocusLost

    private void txtFieldUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldUserKeyTyped
        if (txtFieldUser.getText().equals("Ingrese su usuario")) {
            txtFieldUser.setText("");
        }
    }//GEN-LAST:event_txtFieldUserKeyTyped

    private void pswFieldPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswFieldPasswordMouseEntered
        if (pswFieldPassword.getText().equals("Ingrese su contraseña")) {
            pswFieldPassword.setText("");
            this.pswFieldPassword.setEchoChar('*');
        }


    }//GEN-LAST:event_pswFieldPasswordMouseEntered

    private void pswFieldPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswFieldPasswordMouseExited
        if (pswFieldPassword.getText().equals("")) {
            pswFieldPassword.setText("Ingrese su contraseña");
            this.pswFieldPassword.setEchoChar((char) 0);
        } else if (!pswFieldPassword.getText().equals("Ingrese su contraseña")) {
            evt.consume();
        }
    }//GEN-LAST:event_pswFieldPasswordMouseExited

    private void pswFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswFieldPasswordKeyTyped
if (pswFieldPassword.getText().equals("Ingrese su contraseña")) {
            pswFieldPassword.setEchoChar('*');
            pswFieldPassword.setText("");
            
        }
    }//GEN-LAST:event_pswFieldPasswordKeyTyped

    private void pswFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswFieldPasswordFocusLost
        if (pswFieldPassword.getText().equals("")) {
            pswFieldPassword.setText("Ingrese su contraseña");
            this.pswFieldPassword.setEchoChar((char)0);
        }
    }//GEN-LAST:event_pswFieldPasswordFocusLost

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new Register(this.clientesDao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRetiroSinCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroSinCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetiroSinCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetiroSinCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconos;
    private javax.swing.JLabel lblRecuadro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPasswordField pswFieldPassword;
    private javax.swing.JTextField txtFieldUser;
    // End of variables declaration//GEN-END:variables
}
