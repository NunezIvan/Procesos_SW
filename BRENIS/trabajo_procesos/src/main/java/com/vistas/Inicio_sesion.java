
package com.vistas;

import com.conexion.conexion;
import static com.datos.encargados.buscarPeriodoPorAño;
import static com.datos.encargados.verificarCredenciales;
import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;

/**
 *
 * @author USER
 */
public class Inicio_sesion extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    public static String nombreDeUsuario = "";
    encargado Encargadoingresado;
    Periodo periodoingresado;
    
    public Inicio_sesion() {
        initComponents();
        panel_botones.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
        timer = new Timer(10000, e->conexion.getConexion());
        timer.start();  
        
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual
        int año = fechaActual.getYear(); // Extrae el año de la fecha actual
        String año_string = String.valueOf(año);
        this.periodoingresado = buscarPeriodoPorAño(año_string);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_botones = new javax.swing.JPanel();
        boton_salir = new com.vistas.PanelRound1();
        jLabel1 = new javax.swing.JLabel();
        boton_minimizar = new com.vistas.PanelRound1();
        jLabel2 = new javax.swing.JLabel();
        label_titulo = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();
        label_nombre1 = new javax.swing.JLabel();
        label_nombre2 = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        separator_usuario = new javax.swing.JSeparator();
        tField_usuario = new javax.swing.JTextField();
        label_contraseña = new javax.swing.JLabel();
        separator_contraseña = new javax.swing.JSeparator();
        tField_contraseña = new javax.swing.JPasswordField();
        ingresar_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        panel_botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_botones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_botonesMouseDragged(evt);
            }
        });
        panel_botones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_botonesMousePressed(evt);
            }
        });

        boton_salir.setBackground(new java.awt.Color(0, 0, 0));
        boton_salir.setMaximumSize(new java.awt.Dimension(19, 19));
        boton_salir.setRoundBottomLeft(20);
        boton_salir.setRoundBottomRight(20);
        boton_salir.setRoundTopLeft(20);
        boton_salir.setRoundTopRight(20);
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_salirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout boton_salirLayout = new javax.swing.GroupLayout(boton_salir);
        boton_salir.setLayout(boton_salirLayout);
        boton_salirLayout.setHorizontalGroup(
            boton_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_salirLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        boton_salirLayout.setVerticalGroup(
            boton_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        boton_minimizar.setBackground(new java.awt.Color(0, 0, 0));
        boton_minimizar.setPreferredSize(new java.awt.Dimension(19, 19));
        boton_minimizar.setRoundBottomLeft(20);
        boton_minimizar.setRoundBottomRight(20);
        boton_minimizar.setRoundTopLeft(20);
        boton_minimizar.setRoundTopRight(20);
        boton_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_minimizarMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("–");
        jLabel2.setMaximumSize(new java.awt.Dimension(19, 19));
        jLabel2.setMinimumSize(new java.awt.Dimension(19, 19));
        jLabel2.setNextFocusableComponent(boton_minimizar);
        jLabel2.setPreferredSize(new java.awt.Dimension(19, 19));

        javax.swing.GroupLayout boton_minimizarLayout = new javax.swing.GroupLayout(boton_minimizar);
        boton_minimizar.setLayout(boton_minimizarLayout);
        boton_minimizarLayout.setHorizontalGroup(
            boton_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        boton_minimizarLayout.setVerticalGroup(
            boton_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_minimizarLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        label_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/SMART.png"))); // NOI18N

        label_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/edificio (3).png"))); // NOI18N

        label_nombre1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        label_nombre1.setText("Av. Angamos Este 1450 Surquillo - Lima");

        label_nombre2.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        label_nombre2.setText("Santiago Apóstol");

        label_usuario.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        label_usuario.setText("Usuario: ");

        tField_usuario.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        tField_usuario.setForeground(new java.awt.Color(204, 204, 204));
        tField_usuario.setText("Ingrese su Usuario");
        tField_usuario.setBorder(null);
        tField_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tField_usuarioMousePressed(evt);
            }
        });
        tField_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField_usuarioActionPerformed(evt);
            }
        });

        label_contraseña.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        label_contraseña.setText("Contraseña:");

        tField_contraseña.setForeground(new java.awt.Color(204, 204, 204));
        tField_contraseña.setText("ola");
        tField_contraseña.setBorder(null);
        tField_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tField_contraseñaMousePressed(evt);
            }
        });
        tField_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tField_contraseñaActionPerformed(evt);
            }
        });

        ingresar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingresar_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresar_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresar_panelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 3, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresar");

        javax.swing.GroupLayout ingresar_panelLayout = new javax.swing.GroupLayout(ingresar_panel);
        ingresar_panel.setLayout(ingresar_panelLayout);
        ingresar_panelLayout.setHorizontalGroup(
            ingresar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        ingresar_panelLayout.setVerticalGroup(
            ingresar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_botones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_contraseña)
                                    .addComponent(label_usuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separator_usuario)
                                    .addComponent(tField_usuario)
                                    .addComponent(tField_contraseña)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator_contraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresar_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_nombre1)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_imagen)
                        .addGap(55, 55, 55))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(625, Short.MAX_VALUE)
                    .addComponent(label_nombre2)
                    .addGap(147, 147, 147)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_nombre1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_contraseña)
                            .addComponent(tField_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(ingresar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(label_nombre2)
                    .addContainerGap(382, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_botonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_botonesMouseDragged

    private void panel_botonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_botonesMousePressed

    private void panel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseClicked
        timer.stop();
        System.exit(0);
    }//GEN-LAST:event_boton_salirMouseClicked

    private void panel_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseEntered
        jLabel1.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_boton_salirMouseEntered

    private void panel_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseExited
        jLabel1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_boton_salirMouseExited

    private void panel_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_minimizarMouseClicked
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(boton_minimizar);
        if (window instanceof java.awt.Frame frame) {
            frame.setState(java.awt.Frame.ICONIFIED);
        }
    }//GEN-LAST:event_boton_minimizarMouseClicked

    private void panel_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_minimizarMouseEntered
        jLabel2.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_boton_minimizarMouseEntered

    private void panel_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_minimizarMouseExited
        jLabel2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_boton_minimizarMouseExited

    private void tField_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField_usuarioActionPerformed

    private void tField_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tField_usuarioMousePressed
        if(tField_usuario.getText().equals("Ingrese su Usuario")){
            tField_usuario.setText("");
            tField_usuario.setForeground(Color.black);
        }
        if(String.valueOf(tField_contraseña.getPassword()).isEmpty()){
            tField_contraseña.setText("ola");
            tField_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tField_usuarioMousePressed

    private void tField_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tField_contraseñaMousePressed
        if(tField_usuario.getText().equals("")){
            tField_usuario.setText("Ingrese su Usuario");
            tField_usuario.setForeground(Color.gray);
        }
        if(String.valueOf(tField_contraseña.getPassword()).equals("ola")){
            tField_contraseña.setText("");
            tField_contraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_tField_contraseñaMousePressed

    private void tField_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tField_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tField_contraseñaActionPerformed

    private void ingresar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_panelMouseClicked
        nombreDeUsuario = tField_usuario.getText();
        String password = new String(tField_contraseña.getPassword());
        
        this.Encargadoingresado = verificarCredenciales(nombreDeUsuario,password);
        
        try{
            if(Encargadoingresado!=null){
                
            }else{
                JOptionPane.showMessageDialog(this, "Error, usuario o contraseña incorrectos.");
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());
        }
        
        if((Encargadoingresado!=null)&&(periodoingresado!=null)){
            Inicio_Menu inicio = new Inicio_Menu(Encargadoingresado,periodoingresado);
            this.setVisible(false);
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null); 
            
        }
    }//GEN-LAST:event_ingresar_panelMouseClicked

    private void ingresar_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_panelMouseEntered
        ingresar_panel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ingresar_panelMouseEntered

    private void ingresar_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_panelMouseExited
        ingresar_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_ingresar_panelMouseExited

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseClicked
        timer.stop();
        System.exit(0);
    }//GEN-LAST:event_panel_salirMouseClicked

    private void boton_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseEntered
        jLabel1.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_panel_salirMouseEntered

    private void boton_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseExited
        jLabel1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_panel_salirMouseExited

    private void boton_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseClicked
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(boton_minimizar);
        if (window instanceof java.awt.Frame frame){
            frame.setState(java.awt.Frame.ICONIFIED);
        }
    }//GEN-LAST:event_panel_minimizarMouseClicked

    private void boton_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseEntered
        jLabel2.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_panel_minimizarMouseEntered

    private void boton_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseExited
        jLabel2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_panel_minimizarMouseExited

    
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
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.vistas.PanelRound1 boton_minimizar;
    private com.vistas.PanelRound1 boton_salir;
    private javax.swing.JPanel ingresar_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_contraseña;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel label_nombre2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JPanel panel_botones;
    private javax.swing.JSeparator separator_contraseña;
    private javax.swing.JSeparator separator_usuario;
    private javax.swing.JPasswordField tField_contraseña;
    private javax.swing.JTextField tField_usuario;
    // End of variables declaration//GEN-END:variables
}
