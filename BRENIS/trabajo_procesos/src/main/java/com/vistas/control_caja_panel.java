package com.vistas;

import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class control_caja_panel extends javax.swing.JPanel {
    
    private JPanel botonSeleccionado;
    encargado Encargado;
    Periodo periodo;
    
    public control_caja_panel(encargado encargadoingresado, Periodo periodoingresado) {
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        setBotonSeleccionado(Egresos_Button);
        
        Egresos_Panel egresos = new Egresos_Panel(encargadoingresado,periodoingresado);
        egresos.setSize(953, 451);
        egresos.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(egresos,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Egresos_Button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ingresos_Button = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contingencia_Button = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fondo_Button = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(967, 512));
        setMinimumSize(new java.awt.Dimension(959, 511));
        setPreferredSize(new java.awt.Dimension(967, 512));

        Egresos_Button.setBackground(new java.awt.Color(255, 255, 255));
        Egresos_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Egresos_Button.setMaximumSize(new java.awt.Dimension(223, 41));
        Egresos_Button.setMinimumSize(new java.awt.Dimension(223, 41));
        Egresos_Button.setPreferredSize(new java.awt.Dimension(223, 41));
        Egresos_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Egresos_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Egresos_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Egresos_ButtonMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Egresos");

        javax.swing.GroupLayout Egresos_ButtonLayout = new javax.swing.GroupLayout(Egresos_Button);
        Egresos_Button.setLayout(Egresos_ButtonLayout);
        Egresos_ButtonLayout.setHorizontalGroup(
            Egresos_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        Egresos_ButtonLayout.setVerticalGroup(
            Egresos_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        Ingresos_Button.setBackground(new java.awt.Color(255, 255, 255));
        Ingresos_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ingresos_Button.setMaximumSize(new java.awt.Dimension(223, 41));
        Ingresos_Button.setMinimumSize(new java.awt.Dimension(223, 41));
        Ingresos_Button.setPreferredSize(new java.awt.Dimension(223, 41));
        Ingresos_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingresos_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ingresos_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ingresos_ButtonMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresos");

        javax.swing.GroupLayout Ingresos_ButtonLayout = new javax.swing.GroupLayout(Ingresos_Button);
        Ingresos_Button.setLayout(Ingresos_ButtonLayout);
        Ingresos_ButtonLayout.setHorizontalGroup(
            Ingresos_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        Ingresos_ButtonLayout.setVerticalGroup(
            Ingresos_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        contingencia_Button.setBackground(new java.awt.Color(255, 255, 255));
        contingencia_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contingencia_Button.setMaximumSize(new java.awt.Dimension(223, 41));
        contingencia_Button.setMinimumSize(new java.awt.Dimension(223, 41));
        contingencia_Button.setPreferredSize(new java.awt.Dimension(223, 41));
        contingencia_Button.setRequestFocusEnabled(false);
        contingencia_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contingencia_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contingencia_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contingencia_ButtonMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fondo de Contingencia");

        javax.swing.GroupLayout contingencia_ButtonLayout = new javax.swing.GroupLayout(contingencia_Button);
        contingencia_Button.setLayout(contingencia_ButtonLayout);
        contingencia_ButtonLayout.setHorizontalGroup(
            contingencia_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        contingencia_ButtonLayout.setVerticalGroup(
            contingencia_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        fondo_Button.setBackground(new java.awt.Color(255, 255, 255));
        fondo_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fondo_Button.setMaximumSize(new java.awt.Dimension(223, 41));
        fondo_Button.setMinimumSize(new java.awt.Dimension(223, 41));
        fondo_Button.setPreferredSize(new java.awt.Dimension(203, 41));
        fondo_Button.setRequestFocusEnabled(false);
        fondo_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondo_ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fondo_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fondo_ButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fondo Contable");

        javax.swing.GroupLayout fondo_ButtonLayout = new javax.swing.GroupLayout(fondo_Button);
        fondo_Button.setLayout(fondo_ButtonLayout);
        fondo_ButtonLayout.setHorizontalGroup(
            fondo_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondo_ButtonLayout.setVerticalGroup(
            fondo_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(953, 441));
        jPanel1.setMinimumSize(new java.awt.Dimension(953, 441));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Egresos_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ingresos_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contingencia_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fondo_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fondo_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresos_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Egresos_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contingencia_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void setBotonSeleccionado(JPanel boton) {
        botonSeleccionado = boton;
        resetearBotones();
        boton.setBackground(new Color(153, 255, 153));
    }
    
    private void resetearBotones() {
        if (botonSeleccionado != Egresos_Button) {
            Egresos_Button.setBackground(Color.WHITE);
        }
        if (botonSeleccionado != Ingresos_Button) {
            Ingresos_Button.setBackground(Color.WHITE);
        }
        if (botonSeleccionado != contingencia_Button) {
            contingencia_Button.setBackground(Color.WHITE);
        }
        if (botonSeleccionado != fondo_Button) {
            fondo_Button.setBackground(Color.WHITE);
        }
    }
    
    private void Egresos_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egresos_ButtonMouseClicked
        setBotonSeleccionado(Egresos_Button);
        
        Egresos_Panel egresos = new Egresos_Panel(Encargado,periodo);
        
        egresos.setSize(953, 451);
        egresos.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(egresos,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        
        
    }//GEN-LAST:event_Egresos_ButtonMouseClicked

    private void Egresos_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egresos_ButtonMouseEntered
        if (botonSeleccionado != Egresos_Button) {
            Egresos_Button.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_Egresos_ButtonMouseEntered

    private void Egresos_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egresos_ButtonMouseExited
        if (botonSeleccionado != Egresos_Button) {
            Egresos_Button.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Egresos_ButtonMouseExited

    private void Ingresos_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresos_ButtonMouseClicked
        setBotonSeleccionado(Ingresos_Button);
        
        Ingreso_Panel ingresos = new Ingreso_Panel(Encargado,periodo);
        
        ingresos.setSize(953, 451);
        ingresos.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(ingresos,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        
        
    }//GEN-LAST:event_Ingresos_ButtonMouseClicked

    private void Ingresos_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresos_ButtonMouseEntered
        if (botonSeleccionado != Ingresos_Button) {
            Ingresos_Button.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_Ingresos_ButtonMouseEntered

    private void Ingresos_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresos_ButtonMouseExited
        if (botonSeleccionado != Ingresos_Button) {
            Ingresos_Button.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Ingresos_ButtonMouseExited

    private void contingencia_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contingencia_ButtonMouseClicked
        setBotonSeleccionado(contingencia_Button);
    }//GEN-LAST:event_contingencia_ButtonMouseClicked

    private void contingencia_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contingencia_ButtonMouseEntered
        if (botonSeleccionado != contingencia_Button) {
            contingencia_Button.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_contingencia_ButtonMouseEntered

    private void contingencia_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contingencia_ButtonMouseExited
        if (botonSeleccionado != contingencia_Button) {
            contingencia_Button.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_contingencia_ButtonMouseExited

    private void fondo_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_ButtonMouseClicked
        setBotonSeleccionado(fondo_Button);
    }//GEN-LAST:event_fondo_ButtonMouseClicked

    private void fondo_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_ButtonMouseEntered
        if (botonSeleccionado != fondo_Button) {
            fondo_Button.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_fondo_ButtonMouseEntered

    private void fondo_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_ButtonMouseExited
        if (botonSeleccionado != fondo_Button) {
            fondo_Button.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_fondo_ButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Egresos_Button;
    private javax.swing.JPanel Ingresos_Button;
    private javax.swing.JPanel contingencia_Button;
    private javax.swing.JPanel fondo_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
