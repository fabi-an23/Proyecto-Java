package interfaz;

import datos.Conexion;
import datos.ConsultasUsuario;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @fabian
 */
public class JIFrame_Registro extends javax.swing.JInternalFrame {

    ConsultasUsuario conUsuario = new ConsultasUsuario();

    /**
     * Creates new form JIFrame_Registro
     */
    public JIFrame_Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbl_run = new javax.swing.JLabel();
        jlbl_sNombre = new javax.swing.JLabel();
        jlbl_telefono = new javax.swing.JLabel();
        jlbl_correo = new javax.swing.JLabel();
        jlbl_direccion = new javax.swing.JLabel();
        jtxt_run = new javax.swing.JTextField();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_correo = new javax.swing.JTextField();
        jtxt_telefono = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jl_h2 = new javax.swing.JLabel();
        jb_volver = new javax.swing.JButton();
        jlbl_contrasena = new javax.swing.JLabel();
        jptxt_password = new javax.swing.JPasswordField();
        jb_registrar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar nuevo usuario");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbl_run.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_run.setText("RUN:");

        jlbl_sNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_sNombre.setText("Nombre");

        jlbl_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_telefono.setText("Teléfono:");

        jlbl_correo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_correo.setText("Correo:");

        jlbl_direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_direccion.setText("Dirección:");

        jtxt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_telefonoActionPerformed(evt);
            }
        });

        jl_h2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jl_h2.setText("Formulario de Registro");

        jb_volver.setBackground(new java.awt.Color(51, 51, 51));
        jb_volver.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jb_volver.setForeground(new java.awt.Color(255, 255, 255));
        jb_volver.setText("Volver");
        jb_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_volverActionPerformed(evt);
            }
        });

        jlbl_contrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbl_contrasena.setText("Contraseña:");

        jb_registrar.setBackground(new java.awt.Color(51, 51, 51));
        jb_registrar.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jb_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jb_registrar.setText("Registrar");
        jb_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jb_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_h2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_run)
                            .addComponent(jtxt_run, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxt_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jlbl_correo)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_sNombre)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_direccion)
                            .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_telefono)
                    .addComponent(jtxt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbl_contrasena)
                        .addComponent(jptxt_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jl_h2)
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbl_telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbl_sNombre))
                    .addComponent(jlbl_run))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtxt_nombre)
                    .addComponent(jtxt_run))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlbl_correo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlbl_direccion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxt_direccion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbl_contrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jptxt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_telefonoActionPerformed

    private void jb_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_volverActionPerformed
        volverInicio();
    }//GEN-LAST:event_jb_volverActionPerformed

    private void jb_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarActionPerformed
        String user = this.jtxt_run.getText();
        String pass = String.valueOf(this.jptxt_password.getPassword());
        try {

            Usuario usuario = new Usuario(user, this.jtxt_nombre.getText(), pass, this.jtxt_correo.getText(), Integer.parseInt(this.jtxt_telefono.getText()), this.jtxt_direccion.getText());

            System.out.println(usuario.toString());
            boolean flag = conUsuario.buscarRut(user);
            if (flag) {
                System.out.println("El usuario ya existe");
                JOptionPane.showMessageDialog(null, "Usuario ya existe!", "Guardar", 0);
            } else {
                conUsuario.registrar(usuario);
                JOptionPane.showMessageDialog(null, "Datos almacenados", "Guardar", 1);
                Conexion.desconectar();
                volverInicio();

            }
            Conexion.desconectar();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jb_registrarActionPerformed

    public void volverInicio() {
        dispose();
        new VentanaPrincipal().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JButton jb_volver;
    private javax.swing.JLabel jl_h2;
    private javax.swing.JLabel jlbl_contrasena;
    private javax.swing.JLabel jlbl_correo;
    private javax.swing.JLabel jlbl_direccion;
    private javax.swing.JLabel jlbl_run;
    private javax.swing.JLabel jlbl_sNombre;
    private javax.swing.JLabel jlbl_telefono;
    private javax.swing.JPasswordField jptxt_password;
    private javax.swing.JTextField jtxt_correo;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_run;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables
}
