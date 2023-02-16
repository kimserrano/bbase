/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import dominio.Cliente;
import excepciones.PersistenciaException;
import implementaciones.ClientesDAO;
import interfaces.IClientesDAO;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eruma
 */
public class Register2 extends javax.swing.JFrame {

    private Cliente cliente;
    private final IClientesDAO clientesDao;

    /**
     * Creates new form Login
     */
    public Register2(Cliente cliente, IClientesDAO clientesDao) {
        initComponents();
        this.cliente = cliente;
        this.clientesDao = clientesDao;
        this.pswFieldPassword.setEchoChar((char) 0);
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
        pswFieldPassword = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnRetiroSinCuenta = new javax.swing.JButton();
        txtFieldUsuario = new javax.swing.JTextField();
        txtFieldCp = new javax.swing.JTextField();
        txtFieldNoCasa = new javax.swing.JTextField();
        txtFieldCalle = new javax.swing.JTextField();
        lblIconos = new javax.swing.JLabel();
        lblRecuadro = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        pnlFondo.setFocusable(false);
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswFieldPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        pswFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        pswFieldPassword.setText("Clave");
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
        pswFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswFieldPasswordActionPerformed(evt);
            }
        });
        pswFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswFieldPasswordKeyTyped(evt);
            }
        });
        pnlFondo.add(pswFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 468, 310, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnAceptar.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atrasRegister.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasMouseEntered(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        btnRetiroSinCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnRetiro.png"))); // NOI18N
        btnRetiroSinCuenta.setBorder(null);
        btnRetiroSinCuenta.setBorderPainted(false);
        btnRetiroSinCuenta.setContentAreaFilled(false);
        btnRetiroSinCuenta.setFocusable(false);
        btnRetiroSinCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroSinCuentaActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRetiroSinCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 423, -1, -1));

        txtFieldUsuario.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldUsuario.setText("Usuario");
        txtFieldUsuario.setBorder(null);
        txtFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldUsuarioFocusLost(evt);
            }
        });
        txtFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFieldUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFieldUsuarioMouseExited(evt);
            }
        });
        txtFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUsuarioActionPerformed(evt);
            }
        });
        txtFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldUsuarioKeyTyped(evt);
            }
        });
        pnlFondo.add(txtFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 424, 100, -1));

        txtFieldCp.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldCp.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCp.setText("Codigo Postal");
        txtFieldCp.setBorder(null);
        txtFieldCp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCpFocusLost(evt);
            }
        });
        txtFieldCp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFieldCpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFieldCpMouseExited(evt);
            }
        });
        txtFieldCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCpActionPerformed(evt);
            }
        });
        txtFieldCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldCpKeyTyped(evt);
            }
        });
        pnlFondo.add(txtFieldCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 378, 310, -1));

        txtFieldNoCasa.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldNoCasa.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldNoCasa.setText("No. Casa");
        txtFieldNoCasa.setBorder(null);
        txtFieldNoCasa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNoCasaFocusLost(evt);
            }
        });
        txtFieldNoCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFieldNoCasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFieldNoCasaMouseExited(evt);
            }
        });
        txtFieldNoCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNoCasaActionPerformed(evt);
            }
        });
        txtFieldNoCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldNoCasaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldNoCasaKeyTyped(evt);
            }
        });
        pnlFondo.add(txtFieldNoCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 334, 310, -1));

        txtFieldCalle.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFieldCalle.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCalle.setText("Calle");
        txtFieldCalle.setBorder(null);
        txtFieldCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCalleFocusLost(evt);
            }
        });
        txtFieldCalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFieldCalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFieldCalleMouseExited(evt);
            }
        });
        txtFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCalleActionPerformed(evt);
            }
        });
        txtFieldCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldCalleKeyTyped(evt);
            }
        });
        pnlFondo.add(txtFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 310, -1));

        lblIconos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIconos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lineaCredencialesDomicilio.png"))); // NOI18N
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

    private void txtFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCalleActionPerformed

    }//GEN-LAST:event_txtFieldCalleActionPerformed

    private void txtFieldCalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldCalleMouseEntered
        if (txtFieldCalle.getText().equals("Calle"))
            txtFieldCalle.setText("");
    }//GEN-LAST:event_txtFieldCalleMouseEntered

    private void txtFieldCalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldCalleMouseExited
        if (txtFieldCalle.getText().equals("")) {
            txtFieldCalle.setText("Calle");
        } else if (!txtFieldCalle.getText().equals("Calle")) {
            evt.consume();
        }

    }//GEN-LAST:event_txtFieldCalleMouseExited

    private void txtFieldCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCalleFocusLost
        if (txtFieldCalle.getText().equals("")) {
            txtFieldCalle.setText("Calle");
        }
    }//GEN-LAST:event_txtFieldCalleFocusLost

    private void txtFieldCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCalleKeyTyped
        if (txtFieldCalle.getText().length() >= 100) {
            evt.consume();
        }
        if (txtFieldCalle.getText().equals("Calle")) {
            txtFieldCalle.setText("");
        }
    }//GEN-LAST:event_txtFieldCalleKeyTyped

    private void btnRetiroSinCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroSinCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetiroSinCuentaActionPerformed

    private void txtFieldNoCasaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNoCasaFocusLost
        if (txtFieldNoCasa.getText().equals("")) {
            txtFieldNoCasa.setText("No. Casa");
        }
    }//GEN-LAST:event_txtFieldNoCasaFocusLost

    private void txtFieldNoCasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNoCasaMouseEntered
        if (txtFieldNoCasa.getText().equals("No. Casa"))
            txtFieldNoCasa.setText("");
    }//GEN-LAST:event_txtFieldNoCasaMouseEntered

    private void txtFieldNoCasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNoCasaMouseExited

        if (txtFieldNoCasa.getText().equals("")) {
            txtFieldNoCasa.setText("No. Casa");
        } else if (!txtFieldNoCasa.getText().equals("No. Casa")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldNoCasaMouseExited

    private void txtFieldNoCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNoCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNoCasaActionPerformed

    private void txtFieldNoCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNoCasaKeyTyped
        if (txtFieldNoCasa.getText().length() >= 5) {
            evt.consume();
        }
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if (txtFieldNoCasa.getText().equals("No. Casa")) {
            txtFieldNoCasa.setText("");
        }

    }//GEN-LAST:event_txtFieldNoCasaKeyTyped

    private void txtFieldCpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpFocusLost
        if (txtFieldCp.getText().equals("")) {
            txtFieldCp.setText("Codigo Postal");
        }
    }//GEN-LAST:event_txtFieldCpFocusLost

    private void txtFieldCpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldCpMouseEntered
        if (txtFieldCp.getText().equals("Codigo Postal"))
            txtFieldCp.setText("");
    }//GEN-LAST:event_txtFieldCpMouseEntered

    private void txtFieldCpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldCpMouseExited
        if (txtFieldCp.getText().equals("")) {
            txtFieldCp.setText("Codigo Postal");
        } else if (!txtFieldCp.getText().equals("Codigo Postal")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldCpMouseExited

    private void txtFieldCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCpActionPerformed

    private void txtFieldCpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCpKeyTyped
        if (txtFieldCp.getText().length() >= 7) {
            evt.consume();
        }
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtFieldCp.getText().equals("Codigo Postal")) {
            txtFieldCp.setText("");
        }
    }//GEN-LAST:event_txtFieldCpKeyTyped

    private void txtFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldUsuarioFocusLost
        if (txtFieldUsuario.getText().equals("")) {
            txtFieldUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txtFieldUsuarioFocusLost

    private void txtFieldUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldUsuarioMouseEntered
        if (txtFieldUsuario.getText().equals("Usuario"))
            txtFieldUsuario.setText("");
    }//GEN-LAST:event_txtFieldUsuarioMouseEntered

    private void txtFieldUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldUsuarioMouseExited
        if (txtFieldUsuario.getText().equals("")) {
            txtFieldUsuario.setText("Usuario");
        } else if (!txtFieldUsuario.getText().equals("Usuario")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldUsuarioMouseExited

    private void txtFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUsuarioActionPerformed

    private void txtFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldUsuarioKeyTyped
        if (txtFieldUsuario.getText().length() >= 10) {
            evt.consume();
        }
        if (txtFieldUsuario.getText().equals("Usuario")) {
            txtFieldUsuario.setText("");
        }
    }//GEN-LAST:event_txtFieldUsuarioKeyTyped

    private void btnAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseEntered

    }//GEN-LAST:event_btnAtrasMouseEntered

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        new Register(this.clientesDao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            this.cliente.setCalle(this.txtFieldCalle.getText());
            this.cliente.setCp(Integer.parseInt(this.txtFieldCp.getText()));
            this.cliente.setNumDomicilio(Integer.parseInt(this.txtFieldNoCasa.getText()));

            System.out.println(this.clientesDao.insertar(cliente, txtFieldUsuario.getText(), pswFieldPassword.getText()).getId());
            new JOptionPane().showMessageDialog(this, "Usuario agregado exitosamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            new Login(this.clientesDao).setVisible(true);
            this.dispose();
        } catch (PersistenciaException ex) {
            Logger.getLogger(Register2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Login(this.clientesDao).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFieldNoCasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNoCasaKeyPressed

    }//GEN-LAST:event_txtFieldNoCasaKeyPressed

    private void pswFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswFieldPasswordFocusLost
        if (pswFieldPassword.getText().equals("")) {
            pswFieldPassword.setText("Clave");
            this.pswFieldPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_pswFieldPasswordFocusLost

    private void pswFieldPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswFieldPasswordMouseEntered
        if (pswFieldPassword.getText().equals("Clave")) {
            pswFieldPassword.setText("");
            this.pswFieldPassword.setEchoChar('*');
        }

    }//GEN-LAST:event_pswFieldPasswordMouseEntered

    private void pswFieldPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswFieldPasswordMouseExited
        if (pswFieldPassword.getText().equals("")) {
            pswFieldPassword.setText("Clave");
            this.pswFieldPassword.setEchoChar((char) 0);
        } else if (!pswFieldPassword.getText().equals("Clave")) {
            evt.consume();
        }
    }//GEN-LAST:event_pswFieldPasswordMouseExited

    private void pswFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswFieldPasswordKeyTyped
        if (pswFieldPassword.getText().equals("Clave")) {
            pswFieldPassword.setEchoChar('*');
            pswFieldPassword.setText("");

        }
    }//GEN-LAST:event_pswFieldPasswordKeyTyped

    private void pswFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswFieldPasswordActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRetiroSinCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconos;
    private javax.swing.JLabel lblRecuadro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPasswordField pswFieldPassword;
    private javax.swing.JTextField txtFieldCalle;
    private javax.swing.JTextField txtFieldCp;
    private javax.swing.JTextField txtFieldNoCasa;
    private javax.swing.JTextField txtFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
