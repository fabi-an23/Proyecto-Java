/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import datos.Conexion;
import datos.ConsultasCompra;
import datos.ConsultasUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleProducto;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author Fabian
 */
public class JIFrame_Compra extends javax.swing.JInternalFrame {

    ConsultasCompra conCompra = new ConsultasCompra();
    ConsultasUsuario conUsuario = new ConsultasUsuario();
    Producto producto = new Producto();
    DetalleProducto dp = new DetalleProducto();

    public JIFrame_Compra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtp_menu = new javax.swing.JTabbedPane();
        jtp_nuevoCarrito = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_codSelected = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxt_cantSelected = new javax.swing.JTextField();
        jbtn_pagar = new javax.swing.JButton();
        jbtn_vaciarCarro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_Producto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbl_orden = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbtn_selecProducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxt_totalPagar = new javax.swing.JTextField();
        jbtn_mostrarProductos = new javax.swing.JButton();
        jtp_datosCliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_currentRut = new javax.swing.JTextField();
        jtxt_currentName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtxt_newDireccion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxt_newMail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxt_currentDireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxt_currentMail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxt_newTelefono = new javax.swing.JTextField();
        jbtn_guardarCambios = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtxt_currentTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jptxt_currentPassword = new javax.swing.JPasswordField();
        jptxt_newPassword = new javax.swing.JPasswordField();
        jp_menu = new javax.swing.JPanel();
        jbtn_nuevoCarrito = new javax.swing.JButton();
        jbtn_cliente = new javax.swing.JButton();
        jbtn_cerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlbl_banner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 720));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtp_menu.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setText("Código Producto");

        jLabel4.setText("Cantidad");

        jbtn_pagar.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_pagar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jbtn_pagar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        jbtn_pagar.setText("Pagar");
        jbtn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pagarActionPerformed(evt);
            }
        });

        jbtn_vaciarCarro.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_vaciarCarro.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jbtn_vaciarCarro.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_vaciarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jbtn_vaciarCarro.setText("Limpiar");
        jbtn_vaciarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_vaciarCarroActionPerformed(evt);
            }
        });

        jtbl_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Tamaño", "Descripción", "Precio", "Stock"
            }
        ));
        jScrollPane2.setViewportView(jtbl_Producto);

        jLabel6.setText("Listado de Productos");

        jtbl_orden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Detalle", "Precio", "Cantidad", "Sub total", "ID Producto", "Rut Usuario"
            }
        ));
        jScrollPane3.setViewportView(jtbl_orden);

        jLabel7.setText("Productos Seleccionados");

        jbtn_selecProducto.setBackground(new java.awt.Color(0, 0, 204));
        jbtn_selecProducto.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jbtn_selecProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_selecProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jbtn_selecProducto.setText("Agregar");
        jbtn_selecProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_selecProductoActionPerformed(evt);
            }
        });

        jLabel8.setText("Agregar Productos");

        jLabel9.setText("Total:");

        jtxt_totalPagar.setEditable(false);

        jbtn_mostrarProductos.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_mostrarProductos.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        jbtn_mostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_mostrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bote.png"))); // NOI18N
        jbtn_mostrarProductos.setText("Mostrar Productos");
        jbtn_mostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_mostrarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtp_nuevoCarritoLayout = new javax.swing.GroupLayout(jtp_nuevoCarrito);
        jtp_nuevoCarrito.setLayout(jtp_nuevoCarritoLayout);
        jtp_nuevoCarritoLayout.setHorizontalGroup(
            jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtp_nuevoCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtp_nuevoCarritoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_codSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_cantSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_selecProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jtp_nuevoCarritoLayout.createSequentialGroup()
                        .addGroup(jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(37, Short.MAX_VALUE))))
            .addGroup(jtp_nuevoCarritoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jbtn_mostrarProductos)
                .addGap(104, 104, 104)
                .addComponent(jbtn_vaciarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jbtn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jtp_nuevoCarritoLayout.setVerticalGroup(
            jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtp_nuevoCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_cantSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_codSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_selecProducto)
                    .addComponent(jLabel9)
                    .addComponent(jtxt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jtp_nuevoCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_pagar)
                    .addComponent(jbtn_vaciarCarro)
                    .addComponent(jbtn_mostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jtp_menu.addTab("Nuevo Carrito", jtp_nuevoCarrito);

        jLabel5.setText("Rut:");

        jLabel10.setText("Nombre:");

        jtxt_currentRut.setEditable(false);

        jtxt_currentName.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Consultar/Modificar Datos de Usuario");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("Contraseña Actual:");

        jLabel19.setText("Nueva Contraseña:");

        jLabel18.setText("Nueva Direccion:");

        jLabel17.setText("Nuevo Email:");

        jtxt_currentDireccion.setEditable(false);

        jLabel13.setText("Dirección:");

        jtxt_currentMail.setEditable(false);

        jLabel12.setText("E-mail:");

        jbtn_guardarCambios.setBackground(new java.awt.Color(0, 102, 153));
        jbtn_guardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_guardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jbtn_guardarCambios.setText("Guardar Cambios");
        jbtn_guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarCambiosActionPerformed(evt);
            }
        });

        jLabel11.setText("Teléfono:");

        jtxt_currentTelefono.setEditable(false);

        jLabel16.setText("Nuevo Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxt_currentMail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_currentTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_currentDireccion)
                    .addComponent(jptxt_currentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_newMail)
                    .addComponent(jtxt_newTelefono)
                    .addComponent(jtxt_newDireccion)
                    .addComponent(jptxt_newPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jbtn_guardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_newTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jtxt_currentTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_newMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jtxt_currentMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_newDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jtxt_currentDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(jptxt_currentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jptxt_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jbtn_guardarCambios)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jtp_datosClienteLayout = new javax.swing.GroupLayout(jtp_datosCliente);
        jtp_datosCliente.setLayout(jtp_datosClienteLayout);
        jtp_datosClienteLayout.setHorizontalGroup(
            jtp_datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtp_datosClienteLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jtp_datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtp_datosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtp_datosClienteLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(jtp_datosClienteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jtxt_currentRut, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jtxt_currentName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jtp_datosClienteLayout.setVerticalGroup(
            jtp_datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtp_datosClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addGap(57, 57, 57)
                .addGroup(jtp_datosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_currentRut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtxt_currentName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jtp_menu.addTab("Datos Cliente", jtp_datosCliente);

        getContentPane().add(jtp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 880, 540));

        jp_menu.setBackground(new java.awt.Color(0, 0, 0));

        jbtn_nuevoCarrito.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_nuevoCarrito.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jbtn_nuevoCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_nuevoCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.png"))); // NOI18N
        jbtn_nuevoCarrito.setText("Carrito");
        jbtn_nuevoCarrito.setMaximumSize(new java.awt.Dimension(100, 40));
        jbtn_nuevoCarrito.setMinimumSize(new java.awt.Dimension(100, 40));
        jbtn_nuevoCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nuevoCarritoActionPerformed(evt);
            }
        });

        jbtn_cliente.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_cliente.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jbtn_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        jbtn_cliente.setText("Datos Cliente");
        jbtn_cliente.setMaximumSize(new java.awt.Dimension(100, 40));
        jbtn_cliente.setMinimumSize(new java.awt.Dimension(100, 40));
        jbtn_cliente.setPreferredSize(new java.awt.Dimension(100, 40));
        jbtn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_clienteActionPerformed(evt);
            }
        });

        jbtn_cerrarSesion.setBackground(new java.awt.Color(255, 0, 51));
        jbtn_cerrarSesion.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jbtn_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/power.png"))); // NOI18N
        jbtn_cerrarSesion.setText("Cerrar Sesión");
        jbtn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cerveza Quilter");

        jlbl_banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/encabezado.png"))); // NOI18N
        jlbl_banner.setMaximumSize(new java.awt.Dimension(685, 176));
        jlbl_banner.setMinimumSize(new java.awt.Dimension(685, 176));
        jlbl_banner.setPreferredSize(new java.awt.Dimension(685, 176));

        javax.swing.GroupLayout jp_menuLayout = new javax.swing.GroupLayout(jp_menu);
        jp_menu.setLayout(jp_menuLayout);
        jp_menuLayout.setHorizontalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtn_nuevoCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_menuLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jbtn_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jlbl_banner, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_menuLayout.setVerticalGroup(
            jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_menuLayout.createSequentialGroup()
                .addGroup(jp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_menuLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbl_banner, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(jbtn_nuevoCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbtn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jbtn_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_selecProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_selecProductoActionPerformed
        int codSelected = Integer.parseInt(jtxt_codSelected.getText());
        int cantSelected = Integer.parseInt(jtxt_cantSelected.getText());
        String rut = this.jtxt_currentRut.getText();
        boolean flag = conCompra.dispProducto(codSelected, cantSelected);
        if (flag) {
            try {
                String strSQL = "select * from producto where idProducto = '" + codSelected + "'";
                Conexion.getConexion();
                Conexion.sentencia = Conexion.con.prepareStatement(strSQL);
                ResultSet rs = Conexion.sentencia.executeQuery(strSQL);
                System.out.println("Se está creando el objeto producto");
                while (rs.next()) {
                    this.producto.setIdProducto(Integer.parseInt(rs.getString("idProducto")));
                    this.producto.setTamano(Integer.parseInt(rs.getString("tamano")));
                    this.producto.setDescripcion(rs.getString("descripcion"));
                    this.producto.setPrecio(Integer.parseInt(rs.getString("precio")));
                    this.producto.setInventario(Integer.parseInt(rs.getString("inventario")));
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println(e);
                flag = false;
            }
            if (flag) {
                int total = cantSelected * this.producto.getPrecio();
                this.dp = new DetalleProducto(this.producto.getPrecio(), cantSelected, total, rut, this.producto.getIdProducto());
                int maxId = conCompra.obtenerId();
                System.out.println("Este es el ide máximo " + maxId);
                if (conCompra.ingresarOrden(dp, maxId)) {
                    listarOrdenes(rut);
                    int totalPagar = conCompra.totalOrden(rut);
                    System.out.println(totalPagar);
                    this.jtxt_totalPagar.setText(String.valueOf(totalPagar));
                } else {
                    System.out.println("Ingreso de Orden fallido");
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al ingresar su Orden!", "Error", 1);
                };
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay stock para el producto seleccionado, intente nuevamente!", "Error", 0);
        }
        this.jtxt_cantSelected.setText("");
        this.jtxt_codSelected.setText("");
    }//GEN-LAST:event_jbtn_selecProductoActionPerformed

    private void listarOrdenes(String rut) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "select * from detallecompra where rutUsuario = ?";
        Conexion.getConexion();
        ResultSet rs = null;
        try {
            ps = Conexion.con.prepareStatement(sql);
            ps.setString(1, rut);
            rs = ps.executeQuery();
            System.out.println("Seleccionando ordenes de usuario " + rut);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID Detalle");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Sub total");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Rut Usuario");
            Object[] fila = new Object[6];
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                this.jtbl_orden.setModel(modelo);
            }

            Conexion.desconectar();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void jbtn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pagarActionPerformed
        String rut = this.jtxt_currentRut.getText();
        conCompra.pagarOrden(rut);
        String totalPagar = this.jtxt_totalPagar.getText();
        JOptionPane.showMessageDialog(null, "El total a pagar es: $ " + totalPagar, "Pagar Orden", 1);
        limpiarOrden();
        this.jtxt_totalPagar.setText("");
        System.out.println("Intentando pagar orden de usuario " + rut);
    }//GEN-LAST:event_jbtn_pagarActionPerformed

    private void jbtn_mostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mostrarProductosActionPerformed
        //conCompra.listarProductos();
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        String sql = "select * from producto";
        con.getConexion();
        ResultSet rs = null;
        try {
            ps = Conexion.con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Se ejecuto consulta");
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cod Producto");
            modelo.addColumn("Tamaño");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
            Object[] fila = new Object[5];
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                modelo.addRow(fila);
                this.jtbl_Producto.setModel(modelo);

            }
            Conexion.desconectar();
        } catch (Exception e) {
        }

        //DefaultTableModel modelo = (DefaultTableModel) this.Jtable_alumnos.getModel();

    }//GEN-LAST:event_jbtn_mostrarProductosActionPerformed

    private void jbtn_guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarCambiosActionPerformed
        String rut, nombre, password, email, direccion;
        int telefono;

        if (this.jptxt_currentPassword == null) {
            JOptionPane.showMessageDialog(null, "Para confirmar los cambios debe ingresar su contraseña!", "Guardar", 0);
        } else {
            try {
                rut = this.jtxt_currentRut.getText();
                nombre = this.jtxt_currentName.getText();
                password = String.valueOf(this.jptxt_currentPassword.getPassword());
                boolean flag = conUsuario.validarLogin(rut, password);
                if (flag) {
                    if (!"".equals(String.valueOf(this.jptxt_newPassword.getPassword()))) {
                        password = String.valueOf(this.jptxt_newPassword.getPassword());
                    } else {
                        password = String.valueOf(this.jptxt_currentPassword.getPassword());
                        System.out.println("Aqui");
                    }
                    if (!"".equals(this.jtxt_newTelefono.getText())) {
                        telefono = Integer.parseInt(this.jtxt_newTelefono.getText());
                    } else {
                        telefono = Integer.parseInt(this.jtxt_currentTelefono.getText());
                    }
                    if (!"".equals(this.jtxt_newMail.getText())) {
                        email = this.jtxt_newMail.getText();
                    } else {
                        email = this.jtxt_currentMail.getText();
                    }
                    if (!"".equals(this.jtxt_newDireccion.getText())) {
                        direccion = this.jtxt_newDireccion.getText();
                    } else {
                        direccion = this.jtxt_currentDireccion.getText();
                    }
                    Usuario us = new Usuario(rut, nombre, password, email, telefono, direccion);
                    flag = conUsuario.modificar(us);
                    if (flag) {
                        JOptionPane.showMessageDialog(null, "Los Datos fueron modificados correctamente", "Actualización de Datos Correcta", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocurrió un error al modificar los datos, porfavor intentelos de nuevo!", "Error en la Actualización de Datos", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña ingresada es incorrecta!", "Error de Contraseña", 0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos!", "Error en la Actualización de Datos", 0);
            }

        }
        this.jptxt_currentPassword.setText("");
        this.jptxt_newPassword.setText("");
    }//GEN-LAST:event_jbtn_guardarCambiosActionPerformed

    private void jbtn_vaciarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_vaciarCarroActionPerformed
        limpiarOrden();
    }//GEN-LAST:event_jbtn_vaciarCarroActionPerformed

    private void jbtn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cerrarSesionActionPerformed
        VentanaPrincipal.JDPane_Escritorio.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_jbtn_cerrarSesionActionPerformed

    private void jbtn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_clienteActionPerformed
        jtp_menu.setSelectedIndex(1);
        String run = this.jtxt_currentRut.getText();
        Usuario us = conUsuario.buscarDatos(run);
        this.jtxt_currentName.setText(us.getNombre());
        this.jtxt_currentTelefono.setText(String.valueOf(us.getTelefono()));
        this.jtxt_currentMail.setText(us.getEmail());
        this.jtxt_currentDireccion.setText(us.getDireccion());
    }//GEN-LAST:event_jbtn_clienteActionPerformed

    private void jbtn_nuevoCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nuevoCarritoActionPerformed
        jtp_menu.setSelectedIndex(0);
    }//GEN-LAST:event_jbtn_nuevoCarritoActionPerformed
    public void limpiarOrden(){
        DefaultTableModel dtm = new DefaultTableModel();
        this.jtbl_orden.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtn_cerrarSesion;
    private javax.swing.JButton jbtn_cliente;
    private javax.swing.JButton jbtn_guardarCambios;
    private javax.swing.JButton jbtn_mostrarProductos;
    private javax.swing.JButton jbtn_nuevoCarrito;
    private javax.swing.JButton jbtn_pagar;
    private javax.swing.JButton jbtn_selecProducto;
    private javax.swing.JButton jbtn_vaciarCarro;
    private javax.swing.JLabel jlbl_banner;
    private javax.swing.JPanel jp_menu;
    public javax.swing.JPasswordField jptxt_currentPassword;
    private javax.swing.JPasswordField jptxt_newPassword;
    public javax.swing.JTable jtbl_Producto;
    public javax.swing.JTable jtbl_orden;
    private javax.swing.JPanel jtp_datosCliente;
    private javax.swing.JTabbedPane jtp_menu;
    private javax.swing.JPanel jtp_nuevoCarrito;
    private javax.swing.JTextField jtxt_cantSelected;
    private javax.swing.JTextField jtxt_codSelected;
    public javax.swing.JTextField jtxt_currentDireccion;
    public javax.swing.JTextField jtxt_currentMail;
    public javax.swing.JTextField jtxt_currentName;
    public javax.swing.JTextField jtxt_currentRut;
    public javax.swing.JTextField jtxt_currentTelefono;
    private javax.swing.JTextField jtxt_newDireccion;
    private javax.swing.JTextField jtxt_newMail;
    private javax.swing.JTextField jtxt_newTelefono;
    public javax.swing.JTextField jtxt_totalPagar;
    // End of variables declaration//GEN-END:variables
}
