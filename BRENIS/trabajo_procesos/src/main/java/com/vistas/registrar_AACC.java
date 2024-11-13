package com.vistas;

import com.conexion.conexion;
import static com.datos.consumos.actualizarConsumoAACC;
import static com.datos.consumos.agregarConsumo;
import static com.datos.consumos.obtenerConsumoExteriorPorMesYPeriodo;
import static com.datos.consumos.obtenerConsumoPorPeriodoMesApartamento;
import com.dominio.Periodo;
import com.dominio.consumo_agua;
import com.dominio.encargado;
import java.awt.Color;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

public class registrar_AACC extends javax.swing.JFrame {

    int xMouse,yMouse;
    private final Timer timer;
    private JDateChooser dateChooser;
    encargado Encargado;
    Periodo periodo;
    consumo_agua consumo_general;
    float cuota_agua,cuota_desague,igv,cargo_fijo;
    int mes;
    
    
    public registrar_AACC(encargado encargadoingresado, Periodo periodoingresado, int mesSeleccionado) {
        initComponents();
        this.timer = new Timer(10000, e -> conexion.getConexion());
        this.timer.start();

        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        this.mes = mesSeleccionado;

        // Intentar obtener el consumo exterior
        this.consumo_general = obtenerConsumoExteriorPorMesYPeriodo(mesSeleccionado, periodoingresado.getIdPeriodo());

        // Validar si no existe el consumo
        if (this.consumo_general == null) {
            JOptionPane.showMessageDialog(
                null, 
                "No existe un consumo de tipo Exterior para el mes y periodo seleccionados.\nPor favor, regístrelo primero.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            this.dispose(); // Cerrar el formulario inmediatamente
            return; // Salir del constructor
        }
        
        this.cuota_agua = this.consumo_general.getPagoConsumo() / (this.consumo_general.getLecturaActual() - this.consumo_general.getLecturaAnterior());
        this.cuota_desague = this.consumo_general.getPagoDesague() / (this.consumo_general.getLecturaActual() - this.consumo_general.getLecturaAnterior());
        this.igv = this.consumo_general.getIgvConsumo() / (this.consumo_general.getPagoConsumo() + this.consumo_general.getPagoDesague() + this.consumo_general.getCargoFijo());

        panel_botones.setBorder(new MatteBorder(0, 0, 2, 2, Color.BLACK));
        this.setLocationRelativeTo(null);
    }

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
        confirmar_panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cancelar_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

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
        setMinimumSize(new java.awt.Dimension(309, 232));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setMaximumSize(new java.awt.Dimension(309, 251));
        jPanel2.setMinimumSize(new java.awt.Dimension(309, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(309, 251));

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
                .addContainerGap(247, Short.MAX_VALUE))
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
        jLabel3.setText("CM3:");

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

        jTextField4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.setSelectionColor(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void confirmar_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_panelMouseClicked
        String cm3_str = jTextField4.getText();

        try {
            // Validar que se haya ingresado un valor numérico válido
            float cm3 = Float.parseFloat(cm3_str) / 1000.0f;

            // Calcular los valores
            float totalConsumo = cm3 * this.cuota_agua;
            float totalDesague = cm3 * this.cuota_desague;
            float totalIGV = (totalConsumo + totalDesague) * this.igv;
            float totalConsumoAgua = totalConsumo + totalDesague + totalIGV;

            // Intentar obtener un registro existente de AACC para el periodo y mes actual
            consumo_agua consumoExistente = obtenerConsumoPorPeriodoMesApartamento(periodo.getIdPeriodo(), mes, "AACC");

            if (consumoExistente != null) {
                // Preguntar al usuario si desea reemplazar los valores del registro existente
                int opcion = JOptionPane.showConfirmDialog(
                    this,
                    "Ya existe un registro de AACC para este mes y periodo. ¿Desea reemplazar los valores?",
                    "Modificar Registro",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );

                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar los valores del registro existente
                    boolean actualizado = actualizarConsumoAACC(periodo.getIdPeriodo(), mes, totalConsumo, totalDesague, totalIGV, totalConsumoAgua);

                    if (actualizado) {
                        JOptionPane.showMessageDialog(this, "AACC actualizado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al actualizar el AACC.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    this.setVisible(false);
                    return;
                } else {
                    // Si no se desea modificar, cerrar la ventana
                    this.setVisible(false);
                    return;
                }
            }

            // Si no existe un registro previo, proceder a registrar uno nuevo
            consumo_agua consumo_aacc = new consumo_agua(
                "AACC", mes, 0, 0, cm3, "", totalIGV, totalConsumo, totalDesague, totalConsumoAgua, "AACC", 
                periodo.getIdPeriodo(), Encargado.getDni_encargado()
            );
            agregarConsumo(consumo_aacc);

            JOptionPane.showMessageDialog(this, "AACC registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido para CM3.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al procesar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel panel_botones;
    private com.vistas.PanelRound1 panel_minimizar;
    private com.vistas.PanelRound1 panel_salir;
    // End of variables declaration//GEN-END:variables
}
