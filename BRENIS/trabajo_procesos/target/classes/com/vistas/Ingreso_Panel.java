
package com.vistas;

import static com.datos.Ingresos.obtenerIngresosPagadosPorPeriodoYMes_1;
import com.dominio.Ingreso;
import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ingreso_Panel extends javax.swing.JPanel {

    encargado Encargado;
    Periodo periodo;
    
    public Ingreso_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        configurarComboBoxMeses();
        
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTablaIngresos();
                personalizar_tablas();
            }
        });
        
        actualizarTablaIngresos();
        personalizar_tablas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        mes_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        saldo_total_mes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        egreso_fijo_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(953, 443));
        setMinimumSize(new java.awt.Dimension(953, 443));
        setPreferredSize(new java.awt.Dimension(953, 443));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(928, 368));

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ingresos", "Ingresos por Transferencia", "Ingresos por Yape", "Ingresos en Efectivo", "Depósito en BCP", "Pago Vía Web"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setMaximumSize(new java.awt.Dimension(928, 368));
        jTable1.setMinimumSize(new java.awt.Dimension(928, 368));
        jTable1.setPreferredSize(new java.awt.Dimension(928, 368));
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(230);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(15, 41));
        jPanel5.setMinimumSize(new java.awt.Dimension(15, 41));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mes_panel.setBackground(new java.awt.Color(255, 255, 255));
        mes_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresos de");

        javax.swing.GroupLayout mes_panelLayout = new javax.swing.GroupLayout(mes_panel);
        mes_panel.setLayout(mes_panelLayout);
        mes_panelLayout.setHorizontalGroup(
            mes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        mes_panelLayout.setVerticalGroup(
            mes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Enero", " Febrero", " Marzo", " Abril", " Mayo", " Junio", " Julio", " Agosto", " Septiembre", " Octubre", " Noviembre", " Diciembre", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        saldo_total_mes.setBackground(new java.awt.Color(255, 255, 255));
        saldo_total_mes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0000");

        javax.swing.GroupLayout saldo_total_mesLayout = new javax.swing.GroupLayout(saldo_total_mes);
        saldo_total_mes.setLayout(saldo_total_mesLayout);
        saldo_total_mesLayout.setHorizontalGroup(
            saldo_total_mesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        saldo_total_mesLayout.setVerticalGroup(
            saldo_total_mesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        egreso_fijo_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        egreso_fijo_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egreso_fijo_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                egreso_fijo_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                egreso_fijo_panelMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrar Ingreso");

        javax.swing.GroupLayout egreso_fijo_panelLayout = new javax.swing.GroupLayout(egreso_fijo_panel);
        egreso_fijo_panel.setLayout(egreso_fijo_panelLayout);
        egreso_fijo_panelLayout.setHorizontalGroup(
            egreso_fijo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        egreso_fijo_panelLayout.setVerticalGroup(
            egreso_fijo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saldo_total_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(egreso_fijo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mes_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldo_total_mes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(egreso_fijo_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void egreso_fijo_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseClicked
        Registrar_Ingreso ingreso = new Registrar_Ingreso(Encargado,periodo);
        ingreso.setVisible(true);
        ingreso.setLocationRelativeTo(this);
    }//GEN-LAST:event_egreso_fijo_panelMouseClicked

    private void egreso_fijo_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseEntered
        egreso_fijo_panel.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_egreso_fijo_panelMouseEntered

    private void egreso_fijo_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseExited
        egreso_fijo_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_egreso_fijo_panelMouseExited
    
    private void configurarComboBoxMeses() {
        jComboBox1.setRenderer(new CustomComboBoxRenderer());
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setBorder(null);
    }

    class CustomComboBoxRenderer extends JLabel implements ListCellRenderer<Object> {
        public CustomComboBoxRenderer() {
            setOpaque(true); // Necesario para mostrar el color de fondo
        }

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            setText(value == null ? "" : value.toString());

            if (isSelected) {
                setBackground(new Color(204, 204, 204));
            } else {
                setBackground(Color.WHITE);
            }

            setForeground(Color.BLACK);
            return this;
        }
    }
    
    private void personalizar_tablas() {
        // Comprobar si el JTable tiene el modelo de columna adecuado
        if (jTable1.getColumnModel().getColumnCount() > 0) {

            jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(0).setResizable(false);

            jTable1.getColumnModel().getColumn(1).setPreferredWidth(105);
            jTable1.getColumnModel().getColumn(1).setResizable(false);

            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(2).setResizable(false);

            jTable1.getColumnModel().getColumn(3).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(3).setResizable(false);

            jTable1.getColumnModel().getColumn(4).setPreferredWidth(55);
            jTable1.getColumnModel().getColumn(4).setResizable(false);

            jTable1.getColumnModel().getColumn(5).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(5).setResizable(false);

            // Personalizar encabezados de la tabla
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    c.setBackground(new Color(166, 189, 211)); // Fondo del encabezado
                    c.setForeground(Color.BLACK); // Color del texto del encabezado
                    c.setFont(new Font("Roboto Light", Font.BOLD, 13)); // Fuente del encabezado

                    // Agregar borde a los encabezados
                    setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK)); // Bordes del encabezado (grid)
                    setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
                    return c;
                }
            };

            // Asignar el renderizador a todos los encabezados
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }

            // Centrar el contenido de las celdas para las columnas de monto
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            centerRenderer.setFont(new Font("Roboto Light", Font.PLAIN, 10));

            // Aplica el centrado solo a las columnas que representan los montos
            for (int i = 1; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        } else {
            System.out.println("Error: Las columnas no están inicializadas.");
        }
    }


    
    private void actualizarTablaIngresos() {
        int mesIngreso = jComboBox1.getSelectedIndex() + 1;

        // Obtener lista de ingresos pagados por periodo y mes
        List<Ingreso> ingresos = obtenerIngresosPagadosPorPeriodoYMes_1(periodo.getIdPeriodo(), mesIngreso);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ingresos");
        model.addColumn("Ingresos por Transferencia");
        model.addColumn("Ingresos por Yape");
        model.addColumn("Ingresos en Efectivo");
        model.addColumn("Depósito en BCP");
        model.addColumn("Pago Vía Web");

        float totalIngreso = 0.0f; // Variable para calcular el total de ingresos

        for (Ingreso ingreso : ingresos) {
            // Descripción del ingreso
            String descripcionIngreso = "Cuota  " + ingreso.getApartamento() + "  |  " +
                                        ingreso.getDiaIngreso() + "/" + ingreso.getMesIngreso() + "/" + ingreso.getAnoIngreso();

            Object[] fila = new Object[6];
            fila[0] = descripcionIngreso;

            // Según el modo de pago, llenar la columna correspondiente con el monto
            String modoPago = ingreso.getTipoPago();

            switch (modoPago.trim()) { // trim() para eliminar espacios accidentales
                case "Transferencia":
                    fila[1] = ingreso.getMonto();
                    break;
                case "Yape":
                    fila[2] = ingreso.getMonto();
                    break;
                case "Efectivo":
                    fila[3] = ingreso.getMonto();
                    break;
                case "BCP":
                    fila[4] = ingreso.getMonto();
                    break;
                case "Vía Web":
                    fila[5] = ingreso.getMonto();
                    break;
                default:
                    System.out.println("Modo de pago no reconocido: " + modoPago);
                    break;
            }

            // Sumar el monto actual al total de ingresos
            totalIngreso += ingreso.getMonto();

            // Agregar la fila al modelo
            model.addRow(fila);
        }

        // Configurar el modelo en la tabla
        jTable1.setModel(model);

        // Mostrar el total de ingresos en la etiqueta correspondiente
        jLabel5.setText(String.format("%.2f", totalIngreso));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel egreso_fijo_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mes_panel;
    private javax.swing.JPanel saldo_total_mes;
    // End of variables declaration//GEN-END:variables
}
