/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author USER
 */
public class Egresos_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Egresos_Panel
     */
    public Egresos_Panel() {
        initComponents();
        personalizarTabla();
    }

    private void personalizarTabla() {
        // Fuente Roboto Light en negrita
        Font fuenteRoboto = new Font("Roboto Light", Font.BOLD, 14);

        // Personalizar encabezados
        JTableHeader header = jTable1.getTableHeader();
        header.setPreferredSize(new Dimension(100, 30));
        header.setFont(fuenteRoboto); // Aplica la fuente Roboto Light Bold
        header.setBackground(new Color(220, 220, 220)); // Fondo gris del encabezado
        header.setForeground(Color.BLACK);

        // Crear borde negro en el encabezado
        header.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)); 

        // Renderizador para personalizar el encabezado
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        headerRenderer.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)); // Borde gris en los encabezados
        header.setDefaultRenderer(headerRenderer);

        // Ajustar celdas de la tabla
        jTable1.setRowHeight(30); // Ajusta la altura de las filas
        jTable1.setFont(fuenteRoboto); // Aplica la fuente Roboto Light Bold a las celdas

        // Renderizador de celdas para borde gris y centrado
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER); // Centra el texto en las celdas
        cellRenderer.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY)); // Borde gris en celdas

        // Alternar colores de fondo en las filas para una mejor apariencia
        cellRenderer.setBackground(new Color(245, 245, 245)); // Color gris claro
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(row % 2 == 0 ? new Color(245, 245, 245) : Color.WHITE); // Alterna colores
                setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
                return c;
            }
        });

        // Asignar el renderizador a todas las columnas de la tabla
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(953, 451));
        setMinimumSize(new java.awt.Dimension(953, 451));
        setPreferredSize(new java.awt.Dimension(953, 451));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Egresos", "Egresos por Transferencia", "Egresos por Yape", "Egresos en efectivo", "Depósito en BCP", "Pago vía Web", "Egresos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
