/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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
public class Cuotas_Panel extends javax.swing.JPanel {
    
    private JPanel botonSeleccionado;
    encargado Encargado;
    Periodo periodo;
    
    public Cuotas_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        
        setBotonSeleccionado(Panel_CuotasM);
    
        // Limpia contenido previo
        jPanel3.removeAll();

        // Añade nuevo contenido
        CuotasM_Panel cuotas = new CuotasM_Panel(Encargado, periodo);
        cuotas.setSize(953, 443);
        cuotas.setLocation(0, 0);
        jPanel3.add(cuotas, BorderLayout.CENTER);

        // Actualiza visualización
        jPanel3.revalidate();
        jPanel3.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Cuotas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_CuotasM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(967, 512));
        setMinimumSize(new java.awt.Dimension(959, 511));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(967, 512));

        Panel_Cuotas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Cuotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Cuotas.setMaximumSize(new java.awt.Dimension(252, 50));
        Panel_Cuotas.setMinimumSize(new java.awt.Dimension(252, 50));
        Panel_Cuotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CuotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CuotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CuotasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cuota Total");

        javax.swing.GroupLayout Panel_CuotasLayout = new javax.swing.GroupLayout(Panel_Cuotas);
        Panel_Cuotas.setLayout(Panel_CuotasLayout);
        Panel_CuotasLayout.setHorizontalGroup(
            Panel_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        Panel_CuotasLayout.setVerticalGroup(
            Panel_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        Panel_CuotasM.setBackground(new java.awt.Color(255, 255, 255));
        Panel_CuotasM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_CuotasM.setMaximumSize(new java.awt.Dimension(252, 50));
        Panel_CuotasM.setMinimumSize(new java.awt.Dimension(252, 50));
        Panel_CuotasM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CuotasMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CuotasMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CuotasMMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuota Mensual");

        javax.swing.GroupLayout Panel_CuotasMLayout = new javax.swing.GroupLayout(Panel_CuotasM);
        Panel_CuotasM.setLayout(Panel_CuotasMLayout);
        Panel_CuotasMLayout.setHorizontalGroup(
            Panel_CuotasMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        Panel_CuotasMLayout.setVerticalGroup(
            Panel_CuotasMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(953, 443));
        jPanel3.setMinimumSize(new java.awt.Dimension(953, 443));
        jPanel3.setPreferredSize(new java.awt.Dimension(953, 443));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Panel_CuotasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Cuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_CuotasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_Cuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setBotonSeleccionado(JPanel boton) {
        botonSeleccionado = boton;
        resetearBotones();
        boton.setBackground(new Color(153, 255, 153));
    }
    
    private void resetearBotones() {
        if (botonSeleccionado != Panel_Cuotas) {
            Panel_Cuotas.setBackground(Color.WHITE);
        }
        if (botonSeleccionado != Panel_CuotasM) {
            Panel_CuotasM.setBackground(Color.WHITE);
        }
    }
    
    private void Panel_CuotasMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMMouseClicked
        setBotonSeleccionado(Panel_CuotasM);
    
        // Limpia contenido previo
        jPanel3.removeAll();

        // Añade nuevo contenido
        CuotasM_Panel cuotas = new CuotasM_Panel(Encargado, periodo);
        cuotas.setSize(953, 443);
        cuotas.setLocation(0, 0);
        jPanel3.add(cuotas, BorderLayout.CENTER);

        // Actualiza visualización
        jPanel3.revalidate();
        jPanel3.repaint();
        
    }//GEN-LAST:event_Panel_CuotasMMouseClicked

    private void Panel_CuotasMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMMouseEntered
        if (botonSeleccionado != Panel_CuotasM) {
            Panel_CuotasM.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_Panel_CuotasMMouseEntered

    private void Panel_CuotasMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMMouseExited
        if (botonSeleccionado != Panel_CuotasM) {
            Panel_CuotasM.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Panel_CuotasMMouseExited

    private void Panel_CuotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMouseClicked
        setBotonSeleccionado(Panel_Cuotas);
        
        // Limpia contenido previo
        jPanel3.removeAll();

        // Añade nuevo contenido
        CuotasT_Panel cuotasT = new CuotasT_Panel(Encargado, periodo);
        cuotasT.setSize(953, 443);
        cuotasT.setLocation(0, 0);
        jPanel3.add(cuotasT, BorderLayout.CENTER);

        // Actualiza visualización
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_Panel_CuotasMouseClicked

    private void Panel_CuotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMouseEntered
        if (botonSeleccionado != Panel_Cuotas) {
            Panel_Cuotas.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_Panel_CuotasMouseEntered

    private void Panel_CuotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CuotasMouseExited
        if (botonSeleccionado != Panel_Cuotas) {
            Panel_Cuotas.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_Panel_CuotasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Cuotas;
    private javax.swing.JPanel Panel_CuotasM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
