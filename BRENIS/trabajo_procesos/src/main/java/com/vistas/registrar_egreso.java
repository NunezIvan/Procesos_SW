package com.vistas;

import com.conexion.conexion;
import static com.datos.egresos.agregarEgreso;
import com.dominio.Periodo;
import com.dominio.egreso;
import com.dominio.encargado;
import java.awt.Color;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

public class registrar_egreso extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    private JDateChooser dateChooser;
    encargado Encargado;
    Periodo periodo;
    
    public registrar_egreso(encargado encargadoingresado, Periodo periodoingresado) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_botones = new javax.swing.JPanel();
        panel_salir = new com.vistas.PanelRound1();
        jLabel1 = new javax.swing.JLabel();
        panel_minimizar = new com.vistas.PanelRound1();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        confirmar_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cancelar_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setMaximumSize(new java.awt.Dimension(309, 386));
        jPanel2.setMinimumSize(new java.awt.Dimension(309, 386));

        panel_botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_botones.setMaximumSize(new java.awt.Dimension(305, 36));
        panel_botones.setMinimumSize(new java.awt.Dimension(305, 36));
        panel_botones.setPreferredSize(new java.awt.Dimension(305, 36));
        panel_botones.setVerifyInputWhenFocusTarget(false);
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

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Token", " Comisiones", " Impuestos", " Mantenimiento" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        jComboBox1.setMaximumSize(new java.awt.Dimension(76, 29));
        jComboBox1.setMinimumSize(new java.awt.Dimension(76, 29));
        jComboBox1.setPreferredSize(new java.awt.Dimension(76, 29));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Modo de pago:");

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

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jTextField1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTextField1.setText(" ");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Monto:");

        jTextField3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTextField3.setText("  ");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.setSelectionColor(new java.awt.Color(204, 204, 204));

        confirmar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        confirmar_panel.setMaximumSize(new java.awt.Dimension(113, 30));
        confirmar_panel.setMinimumSize(new java.awt.Dimension(113, 30));
        confirmar_panel.setPreferredSize(new java.awt.Dimension(113, 30));
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

        cancelar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelar_panel.setMaximumSize(new java.awt.Dimension(113, 30));
        cancelar_panel.setMinimumSize(new java.awt.Dimension(113, 30));
        cancelar_panel.setPreferredSize(new java.awt.Dimension(113, 30));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void panel_botonesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_botonesMouseDragged

    private void panel_botonesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_botonesMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_botonesMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dateChooser.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void confirmar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseClicked

        String tipoEgreso = jComboBox1.getSelectedItem().toString();
        String modoPago = jComboBox2.getSelectedItem().toString();
        String nombre = jTextField1.getText().trim();
        String fecha = jTextField2.getText().trim();
        String montoStr = jTextField3.getText().trim();


        if (nombre.isEmpty() || fecha.isEmpty() || montoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        float monto;
        try {
            monto = Float.parseFloat(montoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Monto debe ser un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] fechaParts = fecha.split("-");
        int diaEgreso, mesEgreso, anoEgreso;
        try {
            diaEgreso = Integer.parseInt(fechaParts[0]);
            mesEgreso = Integer.parseInt(fechaParts[1]);
            anoEgreso = Integer.parseInt(fechaParts[2]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La fecha debe estar en formato dd-MM-yyyy.", "Error de formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el objeto egreso
        int idPeriodo = periodo.getIdPeriodo();
        String encargadoDNI = Encargado.getDni_encargado();
        egreso nuevoEgreso = new egreso("No_Fijo", tipoEgreso, modoPago, nombre, diaEgreso, mesEgreso, anoEgreso, monto, idPeriodo, encargadoDNI);
        agregarEgreso(nuevoEgreso);
        JOptionPane.showMessageDialog(this, "Egreso registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_confirmar_panelMouseClicked

    private void confirmar_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseEntered
        confirmar_panel.setBackground(new Color(153, 255, 153));
    }//GEN-LAST:event_confirmar_panelMouseEntered

    private void confirmar_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseExited
        confirmar_panel.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_confirmar_panelMouseExited

    private void cancelar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelar_panelMouseClicked

    private void cancelar_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseEntered
        cancelar_panel.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_cancelar_panelMouseEntered

    private void cancelar_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar_panelMouseExited
        cancelar_panel.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_cancelar_panelMouseExited
    
    private void agregarJCalendar() {
        // Crear y configurar el JDateChooser
        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MM-yyyy"); // Define el formato directo en el campo de texto
        dateChooser.setBounds(jTextField2.getX(), jTextField2.getY() + jTextField2.getHeight(), 150, 30); // Posición debajo de jTextField2
        dateChooser.setVisible(false); // Oculto inicialmente
        jPanel2.add(dateChooser); // Agregar al panel principal

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Configuración de colores y eliminación de bordes en los componentes
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setBorder(null); // Eliminar borde
        jComboBox1.setRenderer(new CustomComboBoxRenderer()); // Aplicar renderer personalizado

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panel_botones;
    private com.vistas.PanelRound1 panel_minimizar;
    private com.vistas.PanelRound1 panel_salir;
    // End of variables declaration//GEN-END:variables
}