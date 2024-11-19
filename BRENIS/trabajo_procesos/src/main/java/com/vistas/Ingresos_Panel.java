
package com.vistas;

import com.conexion.conexion;
import com.dominio.Periodo;
import com.dominio.Ingreso;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static com.datos.Ingresos.ListarIngresosporPeriodoYMes;
import static com.datos.Ingresos.CalcularMontoApartamento;



public class Ingresos_Panel extends javax.swing.JPanel {
    
    encargado Encargado;
    Periodo periodo;
    private final Timer timer;
    
    public Ingresos_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        timer = new Timer(1000, e->actualizartabla_condiseño());
        timer.start();
        initComponents();
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

        ingreso_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mes_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabla_ingresos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        saldo_total_mes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CUOTA = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(953, 443));
        setMinimumSize(new java.awt.Dimension(953, 443));
        setPreferredSize(new java.awt.Dimension(953, 443));

        ingreso_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingreso_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_panelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Ingreso");

        javax.swing.GroupLayout ingreso_panelLayout = new javax.swing.GroupLayout(ingreso_panel);
        ingreso_panel.setLayout(ingreso_panelLayout);
        ingreso_panelLayout.setHorizontalGroup(
            ingreso_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        ingreso_panelLayout.setVerticalGroup(
            ingreso_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tabla_ingresos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_ingresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_ingresos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tabla_ingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_ingresos.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        tabla_ingresos.setMaximumSize(new java.awt.Dimension(452, 402));
        tabla_ingresos.setMinimumSize(new java.awt.Dimension(452, 402));

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Egresos", "Egresos por Transferencia", "Egresos por Yape", "Egresos en Efectivo", "Depósito en BCP", "Pago Vía Web"
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
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setMaximumSize(new java.awt.Dimension(540, 80));
        jTable1.setMinimumSize(new java.awt.Dimension(540, 80));
        jTable1.setName(""); // NOI18N
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        tabla_ingresos.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(230);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(55);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(55);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Enero", " Febrero", " Marzo", " Abril", " Mayo", " Junio", " Julio", " Agosto", " Septiembre", " Octubre", " Noviembre", " Diciembre", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CUOTA DEL MES:");

        CUOTA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CUOTA.setForeground(new java.awt.Color(0, 0, 0));
        CUOTA.setText("C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo_total_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CUOTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingreso_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingreso_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saldo_total_mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mes_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CUOTA))
                        .addGap(20, 20, 20))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void actualizartabla_condiseño(){
        actualizarTablaIngresos();
        personalizar_tablas();
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
    
    private void actualizarTablaIngresos() {
        int mes_ingreso = jComboBox1.getSelectedIndex() + 1;

        List<Ingreso> ingresos = ListarIngresosporPeriodoYMes(periodo.getIdPeriodo(), mes_ingreso);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ingreos");
        model.addColumn("Ingresos por Transferencia");
        model.addColumn("Ingresos por Yape");
        model.addColumn("Ingresos en Efectivo");
        model.addColumn("Ingresos Totales");

        float total_ingresos = 0.0f;
        float cuota_mensual = 0.0f;

        for (Ingreso ing : ingresos) {
            String descripcionIngreso;
                descripcionIngreso = "Cuota " + ing.getMes_ingreso() + "/" + ing.getAño_ingreso() +
                                       "/" + "DPTO. " + ing.getApartamento();

            Object[] fila = new Object[3];
            fila[0] = descripcionIngreso;
            // Según el modo de pago, llenar la columna correspondiente con el monto
            String TipoPago = ing.getTipo_pago();

            switch (TipoPago.trim()) { // trim() para eliminar espacios accidentales
                case "Transferencia":
                    fila[1] = ing.getMonto();
                    break;
                case "Yape":
                    fila[2] = ing.getMonto();
                    break;
                case "Efectivo":
                    fila[3] = ing.getMonto();
                    break;
                default:
                    System.out.println("Modo de pago no reconocido: " + TipoPago);
                    break;
            }

            // Sumar el monto actual al total de egresos
            total_ingresos += ing.getMonto();
            cuota_mensual = CalcularMontoApartamento(periodo.getIdPeriodo(), mes_ingreso);

            // Agregar la fila al modelo
            model.addRow(fila);
        }
        CUOTA.setText(String.format("%.2f", cuota_mensual));
        jTable1.setModel(model);
        jLabel5.setText(String.format("%.2f", total_ingresos));
    }
    
    
    private void ingreso_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_panelMouseClicked
        registrar_ingreso ingreso = new registrar_ingreso(Encargado,periodo);
        ingreso.setVisible(true);
        ingreso.setLocationRelativeTo(this);
    }//GEN-LAST:event_ingreso_panelMouseClicked

    private void ingreso_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_panelMouseEntered
        ingreso_panel.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_ingreso_panelMouseEntered

    private void ingreso_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_panelMouseExited
        ingreso_panel.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_ingreso_panelMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void personalizar_tablas() {
        // Comprobar si el JTable tiene el modelo de columna adecuado
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(230);
            jTable1.getColumnModel().getColumn(0).setResizable(false);

            jTable1.getColumnModel().getColumn(1).setPreferredWidth(95);
            jTable1.getColumnModel().getColumn(1).setResizable(false);

            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(2).setResizable(false);

            jTable1.getColumnModel().getColumn(3).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(3).setResizable(false);

            jTable1.getColumnModel().getColumn(4).setPreferredWidth(55);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            
             DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            headerRenderer.setFont(new Font("Roboto Light", Font.BOLD, 12));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUOTA;
    private javax.swing.JPanel ingreso_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mes_panel;
    private javax.swing.JPanel saldo_total_mes;
    private javax.swing.JScrollPane tabla_ingresos;
    // End of variables declaration//GEN-END:variables
}
