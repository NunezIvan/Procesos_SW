
package com.vistas;

import com.conexion.conexion;
import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;

public class Inicio_Menu extends javax.swing.JFrame {
    
    int xMouse,yMouse;
    private final Timer timer;
    private JPanel botonSeleccionado;
    encargado Encargado;
    Periodo periodo;
    
    public Inicio_Menu(encargado encargadoingresado, Periodo periodoingresado) {
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        panel_botones.setBorder(new MatteBorder(0, 0, 2, 0, Color.BLACK));
        timer = new Timer(10000, e->conexion.getConexion());
        timer.start();  
        setBotonSeleccionado(panel_inicio);
        
        //Iniciar en el panel de inicio
        Panel_Inicio inicio = new Panel_Inicio();
        inicio.setSize(967, 512);
        inicio.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(inicio,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_botones = new javax.swing.JPanel();
        panel_salir = new com.vistas.PanelRound1();
        jLabel1 = new javax.swing.JLabel();
        panel_minimizar = new com.vistas.PanelRound1();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panel_inicio = new com.vistas.PanelRound1();
        jLabel3 = new javax.swing.JLabel();
        panel_caja = new com.vistas.PanelRound1();
        jLabel4 = new javax.swing.JLabel();
        panel_pagos = new com.vistas.PanelRound1();
        jLabel6 = new javax.swing.JLabel();
        panel_consumo = new com.vistas.PanelRound1();
        jLabel5 = new javax.swing.JLabel();
        panel_perfil = new com.vistas.PanelRound1();
        jLabel7 = new javax.swing.JLabel();
        panel_opciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(983, 634));
        jPanel1.setMinimumSize(new java.awt.Dimension(983, 634));

        panel_botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_botones.setMaximumSize(new java.awt.Dimension(58, 34));
        panel_botones.setMinimumSize(new java.awt.Dimension(58, 34));
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

        javax.swing.GroupLayout panel_minimizarLayout = new javax.swing.GroupLayout(panel_minimizar);
        panel_minimizar.setLayout(panel_minimizarLayout);
        panel_minimizarLayout.setHorizontalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_botonesLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(211, 211, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(979, 59));
        jPanel2.setMinimumSize(new java.awt.Dimension(979, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(979, 59));

        panel_inicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_inicio.setMaximumSize(new java.awt.Dimension(108, 36));
        panel_inicio.setMinimumSize(new java.awt.Dimension(108, 36));
        panel_inicio.setPreferredSize(new java.awt.Dimension(108, 36));
        panel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_inicioMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicio");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_caja.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_cajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_cajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_cajaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Control de Caja");

        javax.swing.GroupLayout panel_cajaLayout = new javax.swing.GroupLayout(panel_caja);
        panel_caja.setLayout(panel_cajaLayout);
        panel_cajaLayout.setHorizontalGroup(
            panel_cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        panel_cajaLayout.setVerticalGroup(
            panel_cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_pagos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_pagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_pagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_pagosMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cuotas Mensuales");

        javax.swing.GroupLayout panel_pagosLayout = new javax.swing.GroupLayout(panel_pagos);
        panel_pagos.setLayout(panel_pagosLayout);
        panel_pagosLayout.setHorizontalGroup(
            panel_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        panel_pagosLayout.setVerticalGroup(
            panel_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_consumo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_consumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_consumoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_consumoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_consumoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gestión de Consumo");

        javax.swing.GroupLayout panel_consumoLayout = new javax.swing.GroupLayout(panel_consumo);
        panel_consumo.setLayout(panel_consumoLayout);
        panel_consumoLayout.setHorizontalGroup(
            panel_consumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        panel_consumoLayout.setVerticalGroup(
            panel_consumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_perfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel_perfil.setMaximumSize(new java.awt.Dimension(108, 36));
        panel_perfil.setMinimumSize(new java.awt.Dimension(108, 36));
        panel_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_perfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_perfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_perfilMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mi Perfil");

        javax.swing.GroupLayout panel_perfilLayout = new javax.swing.GroupLayout(panel_perfil);
        panel_perfil.setLayout(panel_perfilLayout);
        panel_perfilLayout.setHorizontalGroup(
            panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        panel_perfilLayout.setVerticalGroup(
            panel_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panel_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(panel_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panel_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(panel_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(panel_consumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_opciones.setBackground(new java.awt.Color(255, 255, 255));
        panel_opciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_opciones.setMaximumSize(new java.awt.Dimension(967, 512));
        panel_opciones.setMinimumSize(new java.awt.Dimension(959, 511));
        panel_opciones.setPreferredSize(new java.awt.Dimension(967, 512));

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_botones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void panel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_salirMouseClicked
        timer.stop();
        System.exit(0);
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

    private void panel_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseClicked
        setBotonSeleccionado(panel_inicio);
        
        Panel_Inicio inicio = new Panel_Inicio();
        inicio.setSize(967, 512);
        inicio.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(inicio,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
    }//GEN-LAST:event_panel_inicioMouseClicked

    private void panel_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseEntered
        if (botonSeleccionado != panel_inicio) {
            panel_inicio.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panel_inicioMouseEntered

    private void panel_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseExited
        if (botonSeleccionado != panel_inicio) {
            panel_inicio.setBackground(new Color(242, 242, 242));
        }
    }//GEN-LAST:event_panel_inicioMouseExited

    private void panel_cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cajaMouseClicked
        setBotonSeleccionado(panel_caja);
        control_caja_panel caja = new control_caja_panel(Encargado,periodo);
        caja.setSize(967, 512);
        caja.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(caja,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
    }//GEN-LAST:event_panel_cajaMouseClicked

    private void panel_cajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cajaMouseEntered
        if (botonSeleccionado != panel_caja) {
            panel_caja.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panel_cajaMouseEntered

    private void panel_cajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_cajaMouseExited
        if (botonSeleccionado != panel_caja) {
            panel_caja.setBackground(new Color(242, 242, 242));
        }
    }//GEN-LAST:event_panel_cajaMouseExited

    private void panel_consumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_consumoMouseClicked
        setBotonSeleccionado(panel_consumo);
        
        Consumo_panel consumo = new Consumo_panel(Encargado,periodo);
        consumo.setSize(959, 511);
        consumo.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(consumo,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
        
        
    }//GEN-LAST:event_panel_consumoMouseClicked

    private void panel_consumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_consumoMouseEntered
        if (botonSeleccionado != panel_consumo) {
            panel_consumo.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panel_consumoMouseEntered

    private void panel_consumoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_consumoMouseExited
        if (botonSeleccionado != panel_consumo) {
            panel_consumo.setBackground(new Color(242, 242, 242));
        }
    }//GEN-LAST:event_panel_consumoMouseExited

    private void panel_pagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_pagosMouseEntered
        if (botonSeleccionado != panel_pagos) {
            panel_pagos.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panel_pagosMouseEntered

    private void panel_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_pagosMouseClicked
        setBotonSeleccionado(panel_pagos);
        
        Cuotas_Panel cuotas = new Cuotas_Panel(Encargado,periodo);
        cuotas.setSize(967, 512);
        cuotas.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(cuotas,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
    }//GEN-LAST:event_panel_pagosMouseClicked

    private void panel_pagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_pagosMouseExited
        if (botonSeleccionado != panel_pagos) {
            panel_pagos.setBackground(new Color(242, 242, 242));
        }
    }//GEN-LAST:event_panel_pagosMouseExited

    private void panel_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_perfilMouseClicked
        setBotonSeleccionado(panel_perfil);
        
        perfil_Panel perfil = new perfil_Panel(Encargado,periodo);
        perfil.setSize(967, 512);
        perfil.setLocation(0,0);
        panel_opciones.removeAll();
        panel_opciones.add(perfil,BorderLayout.CENTER);
        panel_opciones.revalidate();
        panel_opciones.repaint();
        
        
    }//GEN-LAST:event_panel_perfilMouseClicked

    private void panel_perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_perfilMouseEntered
        if (botonSeleccionado != panel_perfil) {
            panel_perfil.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_panel_perfilMouseEntered

    private void panel_perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_perfilMouseExited
        if (botonSeleccionado != panel_perfil) {
            panel_perfil.setBackground(new Color(242, 242, 242));
        }
    }//GEN-LAST:event_panel_perfilMouseExited
    
    public void resetear_botones(){
        if (botonSeleccionado != panel_inicio) {
            panel_inicio.setBackground(new Color(242, 242, 242));
        }
        if (botonSeleccionado != panel_caja) {
            panel_caja.setBackground(new Color(242, 242, 242));
        }
        if (botonSeleccionado != panel_consumo) {
            panel_consumo.setBackground(new Color(242, 242, 242));
        }
        if (botonSeleccionado != panel_pagos) {
            panel_pagos.setBackground(new Color(242, 242, 242));
        }
        if (botonSeleccionado != panel_perfil) {
            panel_perfil.setBackground(new Color(242, 242, 242));
        }
    }
    
    private void setBotonSeleccionado(JPanel boton) {
        botonSeleccionado = boton;
        resetear_botones();
        boton.setBackground(new Color(153, 255, 153)); // Mantiene el botón en verde
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_botones;
    private com.vistas.PanelRound1 panel_caja;
    private com.vistas.PanelRound1 panel_consumo;
    private com.vistas.PanelRound1 panel_inicio;
    private com.vistas.PanelRound1 panel_minimizar;
    private javax.swing.JPanel panel_opciones;
    private com.vistas.PanelRound1 panel_pagos;
    private com.vistas.PanelRound1 panel_perfil;
    private com.vistas.PanelRound1 panel_salir;
    // End of variables declaration//GEN-END:variables
}
