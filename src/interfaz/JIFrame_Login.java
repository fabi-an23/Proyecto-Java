/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.ConsultasUsuario;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class JIFrame_Login extends javax.swing.JInternalFrame {

    JIFrame_Registro registro = new JIFrame_Registro();
    JIFrame_Compra compra = new JIFrame_Compra();
    ConsultasUsuario conUsuario = new ConsultasUsuario();

    public JIFrame_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Login = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxt_Run = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jptxt_Pass = new javax.swing.JPasswordField();
        JB_Ingresar = new javax.swing.JButton();
        JB_Registro = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JP_bgLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbl_version = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Login.setBackground(new java.awt.Color(255, 255, 255));
        JP_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Usuario (RUN)");

        jtxt_Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_RunActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Contraseña");

        JB_Ingresar.setBackground(new java.awt.Color(51, 51, 51));
        JB_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        JB_Ingresar.setText("Ingresar");
        JB_Ingresar.setMaximumSize(new java.awt.Dimension(120, 60));
        JB_Ingresar.setMinimumSize(new java.awt.Dimension(120, 60));
        JB_Ingresar.setPreferredSize(new java.awt.Dimension(120, 60));
        JB_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IngresarActionPerformed(evt);
            }
        });

        JB_Registro.setBackground(new java.awt.Color(51, 51, 51));
        JB_Registro.setForeground(new java.awt.Color(255, 255, 255));
        JB_Registro.setText("Registrarse");
        JB_Registro.setPreferredSize(new java.awt.Dimension(120, 60));
        JB_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistroActionPerformed(evt);
            }
        });

        jB_salir.setBackground(new java.awt.Color(51, 51, 51));
        jB_salir.setForeground(new java.awt.Color(255, 255, 255));
        jB_salir.setText("Salir");
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido");

        javax.swing.GroupLayout JP_LoginLayout = new javax.swing.GroupLayout(JP_Login);
        JP_Login.setLayout(JP_LoginLayout);
        JP_LoginLayout.setHorizontalGroup(
            JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LoginLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_LoginLayout.createSequentialGroup()
                        .addGroup(JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jptxt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_Run, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_LoginLayout.createSequentialGroup()
                        .addComponent(JB_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_LoginLayout.createSequentialGroup()
                        .addComponent(jB_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_LoginLayout.createSequentialGroup()
                        .addGroup(JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(148, 148, 148))))
        );
        JP_LoginLayout.setVerticalGroup(
            JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_LoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_Run, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jptxt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(JB_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(JP_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        getContentPane().add(JP_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 400, 500));

        JP_bgLogin.setBackground(new java.awt.Color(0, 0, 0));
        JP_bgLogin.setMaximumSize(new java.awt.Dimension(1080, 720));
        JP_bgLogin.setPreferredSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quilter1.png"))); // NOI18N
        jLabel1.setText("Cervezas Quilter");

        jlbl_version.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_version.setText("Versión 20.0.1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/quilter1.png"))); // NOI18N

        javax.swing.GroupLayout JP_bgLoginLayout = new javax.swing.GroupLayout(JP_bgLogin);
        JP_bgLogin.setLayout(JP_bgLoginLayout);
        JP_bgLoginLayout.setHorizontalGroup(
            JP_bgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_bgLoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlbl_version, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP_bgLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        JP_bgLoginLayout.setVerticalGroup(
            JP_bgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_bgLoginLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(JP_bgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addComponent(jlbl_version, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        getContentPane().add(JP_bgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IngresarActionPerformed
        boolean flag = false;
        String user = this.jtxt_Run.getText();
        String pass = String.valueOf(this.jptxt_Pass.getPassword());
        flag = conUsuario.validarLogin(user, pass);
        if (!flag) {
            JOptionPane.showMessageDialog(null, "rut o contraseña incorrectos!", "Error al ingresar", 0);
        } else {
            pantallaCompra(user);
            JOptionPane.showMessageDialog(null, "Bienvenido", "Bienvenido a AquaExpress", 1);
        }

    }//GEN-LAST:event_JB_IngresarActionPerformed
    public void pantallaCompra(String user) {
        VentanaPrincipal.JDPane_Escritorio.add(compra);
        compra.toFront();
        compra.setVisible(true);
        compra.jtxt_currentRut.setText(user);
        dispose();
        System.out.println(user);
    }
    private void JB_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistroActionPerformed
        dispose();
        pantallaRegistro();
    }//GEN-LAST:event_JB_RegistroActionPerformed

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jtxt_RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_RunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_RunActionPerformed
    public void pantallaRegistro() {
        VentanaPrincipal.JDPane_Escritorio.add(registro);
        registro.toFront();
        registro.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Ingresar;
    private javax.swing.JButton JB_Registro;
    private javax.swing.JPanel JP_Login;
    private javax.swing.JPanel JP_bgLogin;
    private javax.swing.JButton jB_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbl_version;
    private javax.swing.JPasswordField jptxt_Pass;
    private javax.swing.JTextField jtxt_Run;
    // End of variables declaration//GEN-END:variables
}
