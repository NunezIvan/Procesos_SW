package com.vistas;

import com.conexion.conexion;
import static com.datos.Ingresos.actualizarIngreso;
import static com.datos.Ingresos.obtenerIngresoPorFiltros;
import static com.datos.Ingresos.verificarIngresoPagado;
import com.dominio.Ingreso;
import com.dominio.Periodo;
import com.dominio.encargado;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;

public class Registrar_Ingreso extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    private JDateChooser dateChooser;
    encargado Encargado;
    Periodo periodo;
    
    
    public Registrar_Ingreso(encargado encargadoingresado, Periodo periodoingresado) {
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        panel_botones.setBorder(new MatteBorder(0, 0, 2, 2, Color.BLACK));
        timer = new Timer(10000, e->conexion.getConexion());
        timer.start(); 
        agregarJCalendar();
        configurarEstiloSinBordes();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_botones = new javax.swing.JPanel();
        panel_minimizar = new com.vistas.PanelRound1();
        jLabel2 = new javax.swing.JLabel();
        panel_salir = new com.vistas.PanelRound1();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        cancelar_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        confirmar_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(309, 249));
        setMinimumSize(new java.awt.Dimension(309, 249));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(309, 249));
        jPanel1.setMinimumSize(new java.awt.Dimension(309, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(309, 249));

        panel_botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_botones.setMaximumSize(new java.awt.Dimension(305, 36));
        panel_botones.setMinimumSize(new java.awt.Dimension(305, 36));
        panel_botones.setPreferredSize(new java.awt.Dimension(305, 36));
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

        panel_minimizar.setBackground(new java.awt.Color(0, 0, 0));
        panel_minimizar.setMaximumSize(new java.awt.Dimension(19, 19));
        panel_minimizar.setMinimumSize(new java.awt.Dimension(19, 19));
        panel_minimizar.setRoundBottomLeft(20);
        panel_minimizar.setRoundBottomRight(20);
        panel_minimizar.setRoundTopLeft(20);
        panel_minimizar.setRoundTopRight(20);
        panel_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_minimizarMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("–");
        jLabel2.setMaximumSize(new java.awt.Dimension(19, 19));
        jLabel2.setMinimumSize(new java.awt.Dimension(19, 19));
        jLabel2.setPreferredSize(new java.awt.Dimension(19, 19));

        javax.swing.GroupLayout panel_minimizarLayout = new javax.swing.GroupLayout(panel_minimizar);
        panel_minimizar.setLayout(panel_minimizarLayout);
        panel_minimizarLayout.setHorizontalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_salir.setBackground(new java.awt.Color(0, 0, 0));
        panel_salir.setMaximumSize(new java.awt.Dimension(19, 19));
        panel_salir.setMinimumSize(new java.awt.Dimension(19, 19));
        panel_salir.setRoundBottomLeft(20);
        panel_salir.setRoundBottomRight(20);
        panel_salir.setRoundTopLeft(20);
        panel_salir.setRoundTopRight(20);
        panel_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_salirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout panel_salirLayout = new javax.swing.GroupLayout(panel_salir);
        panel_salir.setLayout(panel_salirLayout);
        panel_salirLayout.setHorizontalGroup(
            panel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );
        panel_salirLayout.setVerticalGroup(
            panel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jComboBox2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Transferencia", " Yape", " Efectivo", " BCP", " Vía Web" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox2.setLightWeightPopupEnabled(false);
        jComboBox2.setMaximumSize(new java.awt.Dimension(76, 29));
        jComboBox2.setMinimumSize(new java.awt.Dimension(76, 29));
        jComboBox2.setOpaque(true);
        jComboBox2.setPreferredSize(new java.awt.Dimension(76, 29));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Modo de pago:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("Fecha: ");

        jTextField2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTextField2.setText("  ");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setSelectionColor(new java.awt.Color(204, 204, 204));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/calendario.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 26));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 26));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 26));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Apartamento:");

        jComboBox3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 201", " 202", " 301", " 302", " 401", " 402", " 501", " 502", " 601", " 602" }));

        cancelar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelar_panel.setMaximumSize(new java.awt.Dimension(113, 30));
        cancelar_panel.setMinimumSize(new java.awt.Dimension(113, 30));
        cancelar_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelar_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelar_panelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar");

        javax.swing.GroupLayout cancelar_panelLayout = new javax.swing.GroupLayout(cancelar_panel);
        cancelar_panel.setLayout(cancelar_panelLayout);
        cancelar_panelLayout.setHorizontalGroup(
            cancelar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        cancelar_panelLayout.setVerticalGroup(
            cancelar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        confirmar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        confirmar_panel.setMaximumSize(new java.awt.Dimension(113, 30));
        confirmar_panel.setMinimumSize(new java.awt.Dimension(113, 30));
        confirmar_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmar_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmar_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmar_panelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirmar");

        javax.swing.GroupLayout confirmar_panelLayout = new javax.swing.GroupLayout(confirmar_panel);
        confirmar_panel.setLayout(confirmar_panelLayout);
        confirmar_panelLayout.setHorizontalGroup(
            confirmar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        confirmar_panelLayout.setVerticalGroup(
            confirmar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_panel_salirMouseClicked

    private void panel_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseEntered
        jLabel1.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_panel_salirMouseEntered

    private void panel_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseExited
        jLabel1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_panel_salirMouseExited

    private void panel_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseClicked
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(panel_minimizar);
        if (window instanceof java.awt.Frame frame){
            frame.setState(java.awt.Frame.ICONIFIED);
        }
    }//GEN-LAST:event_panel_minimizarMouseClicked

    private void panel_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseEntered
        jLabel2.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_panel_minimizarMouseEntered

    private void panel_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_minimizarMouseExited
        jLabel2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_panel_minimizarMouseExited

    private void panel_botonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_botonesMousePressed

    private void panel_botonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_botonesMouseDragged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dateChooser.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void cancelar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelar_panelMouseClicked

    private void cancelar_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseEntered
        cancelar_panel.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_cancelar_panelMouseEntered

    private void cancelar_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseExited
        cancelar_panel.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_cancelar_panelMouseExited

    private void confirmar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseClicked
        String modoPago = jComboBox2.getSelectedItem().toString();
        String apart = jComboBox3.getSelectedItem().toString().trim();
        String fecha = jTextField2.getText().trim();
        int idPeriodo = periodo.getIdPeriodo();
        String encargadoDNI = Encargado.getDni_encargado();

        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!fecha.matches("\\d{2}-\\d{2}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "La fecha debe estar en formato dd-MM-yyyy.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] fechaParts = fecha.split("-");
        int diaIngreso = 0, mesIngreso = 0, anoIngreso = 0;
        try {
            diaIngreso = Integer.parseInt(fechaParts[0]);
            mesIngreso = Integer.parseInt(fechaParts[1]);
            anoIngreso = Integer.parseInt(fechaParts[2]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La fecha debe estar en formato dd-MM-yyyy.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el ingreso ya está pagado
        boolean yaPagado = verificarIngresoPagado(idPeriodo, encargadoDNI, mesIngreso, apart);
        if (yaPagado) {
            JOptionPane.showMessageDialog(this, "El ingreso para este apartamento ya está registrado como pagado.", "Ingreso duplicado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener ingreso existente
        Ingreso ingreso_actualizado = obtenerIngresoPorFiltros(idPeriodo, encargadoDNI, mesIngreso, apart);
        if (ingreso_actualizado == null) {
            JOptionPane.showMessageDialog(this, "No existe un ingreso registrado para los parámetros proporcionados.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar ingreso
        ingreso_actualizado.setTipoPago(modoPago);
        ingreso_actualizado.setDiaIngreso(diaIngreso);
        ingreso_actualizado.setMesIngreso(mesIngreso);
        ingreso_actualizado.setAnoIngreso(anoIngreso);
        ingreso_actualizado.setPagado(true);

        boolean actualizado = actualizarIngreso(ingreso_actualizado);
        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Ingreso registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el ingreso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmar_panelMouseClicked

    private void confirmar_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseEntered
        confirmar_panel.setBackground(new Color(153, 255, 153));
    }//GEN-LAST:event_confirmar_panelMouseEntered

    private void confirmar_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseExited
        confirmar_panel.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_confirmar_panelMouseExited
    
    private void agregarJCalendar() {
        // Crear y configurar el JDateChooser
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MM-yyyy"); // Define el formato directo en el campo de texto
        dateChooser.setBounds(jTextField2.getX(), jTextField2.getY() + jTextField2.getHeight(), 150, 30); // Posición debajo de jTextField2
        dateChooser.setVisible(false); // Oculto inicialmente
        jPanel1.add(dateChooser); // Agregar al panel principal

        // Listener para actualizar el campo de texto con la fecha seleccionada
        dateChooser.addPropertyChangeListener("date", evt -> {
            if (dateChooser.getDate() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                jTextField2.setText(sdf.format(dateChooser.getDate())); // Colocar fecha en el campo de texto
                dateChooser.setVisible(false); // Ocultar el JDateChooser después de seleccionar la fecha
            }
        });
    }
    
    private void configurarEstiloSinBordes() {
        try {
            // Establecer el LookAndFeel predeterminado de Java para evitar Nimbus o Metal
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }

        // Configuración de colores y eliminación de bordes en los componentes
        jComboBox3.setBackground(Color.WHITE);
        jComboBox3.setBorder(null); // Eliminar borde
        jComboBox3.setRenderer(new CustomComboBoxRenderer()); // Aplicar renderer personalizado

        jComboBox2.setBackground(Color.WHITE);
        jComboBox2.setBorder(null); // Eliminar borde
        jComboBox2.setRenderer(new CustomComboBoxRenderer()); // Aplicar renderer personalizado

}
    
    class CustomComboBoxRenderer extends JLabel implements ListCellRenderer<Object> {
        public CustomComboBoxRenderer() {
            setOpaque(true); // Necesario para mostrar el color de fondo
        }

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            setText(value == null ? "" : value.toString());

            if (isSelected) {
                setBackground(new Color(204, 204, 204)); // Color cuando el mouse está encima
            } else {
                setBackground(Color.WHITE); // Color normal de fondo
            }

            setForeground(Color.BLACK); // Color de texto
            return this;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelar_panel;
    private javax.swing.JPanel confirmar_panel;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel_botones;
    private com.vistas.PanelRound1 panel_minimizar;
    private com.vistas.PanelRound1 panel_salir;
    // End of variables declaration//GEN-END:variables
}
