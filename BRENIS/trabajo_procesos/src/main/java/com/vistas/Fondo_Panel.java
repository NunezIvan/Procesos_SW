
package com.vistas;

import com.datos.Ingresos;
import com.datos.egresos;
import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Fondo_Panel extends javax.swing.JPanel {

    encargado Encargado;
    Periodo periodo;
    
    
    public Fondo_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        initComponents();
        
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalizar_tablas();
            llenarTablaFondosContables();
            configurarComboBoxMeses();
            }
        });
        llenarTablaFondosContables();
        personalizar_tablas();
        configurarComboBoxMeses();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(953, 441));
        setMinimumSize(new java.awt.Dimension(953, 441));
        setPreferredSize(new java.awt.Dimension(953, 441));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(953, 300));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(953, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(953, 300));
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fondos Contables en Físico", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setMaximumSize(new java.awt.Dimension(953, 300));
        jTable1.setMinimumSize(new java.awt.Dimension(953, 300));
        jTable1.setPreferredSize(new java.awt.Dimension(953, 300));
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(15, 45));
        jPanel5.setMinimumSize(new java.awt.Dimension(15, 45));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(129, 19));
        jPanel2.setMinimumSize(new java.awt.Dimension(129, 19));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fondo Contable de");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Enero", " Febrero", " Marzo", " Abril", " Mayo", " Junio", " Julio", " Agosto", " Septiembre", " Octubre", " Noviembre", " Diciembre", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(641, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        llenarTablaFondosContables();
        personalizar_tablas();
        configurarComboBoxMeses();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void llenarTablaFondosContables() {
        int mesSeleccionado = jComboBox1.getSelectedIndex() + 1; // Mes seleccionado (1-12)
        int idPeriodo = periodo.getIdPeriodo(); // Obtener el idPeriodo del objeto periodo
        String año = periodo.getAñoPeriodo(); // Obtener el año actual del periodo
        int añoAnterior = Integer.parseInt(año) - 1; // Año anterior

        String mesActualNombre = jComboBox1.getSelectedItem().toString().trim();
        String mesAnteriorNombre = mesSeleccionado == 1 ? "Diciembre" : jComboBox1.getItemAt(mesSeleccionado - 2).trim();

        // Calcular el mes anterior y año
        int mesAnterior = mesSeleccionado == 1 ? 12 : mesSeleccionado - 1;
        int añoMesAnterior = mesSeleccionado == 1 ? añoAnterior : Integer.parseInt(año);

        // Obtener datos del mes anterior
        float ingresosMesAnterior = Ingresos.obtenerSumaIngresosPorMes(idPeriodo, mesAnterior);
        float egresosMesAnterior = egresos.calcularEgresoTotal(idPeriodo, mesAnterior);
        float saldoMesAnterior = ingresosMesAnterior - egresosMesAnterior;

        // Obtener datos del mes actual
        float ingresosMesActual = Ingresos.obtenerSumaIngresosPorMes(idPeriodo, mesSeleccionado);
        float egresosMesActual = egresos.calcularEgresoTotal(idPeriodo, mesSeleccionado);
        float saldoMesActual = ingresosMesActual - egresosMesActual + saldoMesAnterior;

        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Fondos Contables en Físico");
        model.addColumn("");

        // Agregar filas
        model.addRow(new Object[]{"Saldo del mes " + mesAnteriorNombre + " " + añoMesAnterior, String.format("%.2f", saldoMesAnterior)});
        model.addRow(new Object[]{"Ingresos Totales del mes " + mesActualNombre, String.format("%.2f", ingresosMesActual)});
        model.addRow(new Object[]{"Egresos Totales del mes " + mesActualNombre, String.format("%.2f", egresosMesActual)});
        model.addRow(new Object[]{"Saldo del mes " + mesActualNombre + " " + año, String.format("%.2f", saldoMesActual)});

        // Configurar la tabla con el modelo
        jTable1.setModel(model);

        // Opcional: Ajustar el ancho de la columna
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(700);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        }
    }
    
    private void personalizar_tablas() {
        // Verificar si las columnas están configuradas
        if (jTable1.getColumnModel().getColumnCount() > 0) {

            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);

            // Personalizar encabezados de la tabla
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    c.setBackground(new Color(166, 189, 211)); // Fondo del encabezado
                    c.setForeground(Color.BLACK); // Color del texto del encabezado
                    c.setFont(new Font("Roboto Light", Font.BOLD, 13)); // Fuente del encabezado

                    // Agregar borde a los encabezados
                    setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK)); // Bordes del encabezado (grid)
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
