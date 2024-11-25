
package com.vistas;

import static com.datos.egresos.listarEgresosPorPeriodoYMes;
import com.dominio.Periodo;
import com.dominio.egreso;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class CuotasM_Panel extends javax.swing.JPanel {
    
    encargado Encargado;
    Periodo periodo;
    
    public CuotasM_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        initComponents();
        
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalizar_tablas();
                configurarComboBoxMeses();
            }
        });
        
        personalizar_tablas();
        configurarComboBoxMeses();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        mes_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cuota_mensual_num_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cuota_mensual_dpt = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(953, 443));
        setMinimumSize(new java.awt.Dimension(953, 443));
        setPreferredSize(new java.awt.Dimension(953, 443));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jScrollPane1.setMaximumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(928, 368));

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descripción", "Total", "X Dpto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setMaximumSize(new java.awt.Dimension(928, 368));
        jTable1.setMinimumSize(new java.awt.Dimension(928, 368));
        jTable1.setPreferredSize(new java.awt.Dimension(928, 368));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(600);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(15, 41));
        jPanel1.setMinimumSize(new java.awt.Dimension(15, 41));
        jPanel1.setPreferredSize(new java.awt.Dimension(15, 41));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mes_panel.setBackground(new java.awt.Color(255, 255, 255));
        mes_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mes_panel.setMaximumSize(new java.awt.Dimension(106, 41));
        mes_panel.setMinimumSize(new java.awt.Dimension(106, 41));
        mes_panel.setName(""); // NOI18N
        mes_panel.setPreferredSize(new java.awt.Dimension(106, 41));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cuota de");

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

        jPanel2.setBackground(new java.awt.Color(191, 221, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(917, 28));
        jPanel2.setMinimumSize(new java.awt.Dimension(917, 28));
        jPanel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUOTA MENSUAL DEL EDIFICIO \"SANTIAGO APOSTOL\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Generar Cuotas Mensuales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cuota_mensual_num_panel.setBackground(new java.awt.Color(255, 255, 255));
        cuota_mensual_num_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0000");

        javax.swing.GroupLayout cuota_mensual_num_panelLayout = new javax.swing.GroupLayout(cuota_mensual_num_panel);
        cuota_mensual_num_panel.setLayout(cuota_mensual_num_panelLayout);
        cuota_mensual_num_panelLayout.setHorizontalGroup(
            cuota_mensual_num_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        cuota_mensual_num_panelLayout.setVerticalGroup(
            cuota_mensual_num_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuota_mensual_num_panelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cuota_mensual_dpt.setBackground(new java.awt.Color(255, 255, 255));
        cuota_mensual_dpt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0000");

        javax.swing.GroupLayout cuota_mensual_dptLayout = new javax.swing.GroupLayout(cuota_mensual_dpt);
        cuota_mensual_dpt.setLayout(cuota_mensual_dptLayout);
        cuota_mensual_dptLayout.setHorizontalGroup(
            cuota_mensual_dptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        cuota_mensual_dptLayout.setVerticalGroup(
            cuota_mensual_dptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuota_mensual_dptLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuota_mensual_num_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuota_mensual_dpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(mes_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuota_mensual_num_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuota_mensual_dpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        llenarYPersonalizarTablaCuotas(periodo.getIdPeriodo(), jComboBox1.getSelectedIndex() + 1);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_jPanel3MouseExited
    
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
    
    private void actualizartabla_condiseño(){
        llenarYPersonalizarTablaCuotas(periodo.getIdPeriodo(), jComboBox1.getSelectedIndex() + 1);
        personalizar_tablas();
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
    
    private void llenarYPersonalizarTablaCuotas(int idPeriodo, int mesEgreso) {
        // Lista de colores para tipo_egreso
        Map<String, Color> coloresFondo = new HashMap<>();
        coloresFondo.put(" Limpieza", new Color(153, 204, 255));
        coloresFondo.put(" Luz", new Color(255, 255, 153));
        coloresFondo.put(" Mantenimiento", new Color(255, 153, 153));
        coloresFondo.put(" Token", new Color(204, 204, 255));
        coloresFondo.put(" Comisiones", new Color(204, 255, 255));
        coloresFondo.put(" Impuestos", new Color(199, 199, 121));
        coloresFondo.put("Fondo de Contingencia", new Color(141, 189, 141));

        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);

        // Mapa para acumular los valores por tipo_egreso
        Map<String, Float> acumulados = new HashMap<>();

        // Obtén la lista de egresos basándote en el mes y el periodo
        List<egreso> egresos = listarEgresosPorPeriodoYMes(idPeriodo, mesEgreso);

        for (egreso eg : egresos) {
            // Ignorar el tipo "Agua"
            if (" Agua".equalsIgnoreCase(eg.getTipo())) {
                continue;
            }

            // Acumular los valores
            acumulados.put(
                eg.getTipo(),
                acumulados.getOrDefault(eg.getTipo(), 0f) + eg.getMonto()
            );
        }

        // Agregar los valores acumulados a la tabla
        for (Map.Entry<String, Float> entry : acumulados.entrySet()) {
            String tipo = entry.getKey();
            float total = entry.getValue();
            float porDepartamento = total / 10;

            modeloTabla.addRow(new Object[]{
                tipo,
                String.format("%.2f", total),
                String.format("%.2f", porDepartamento)
            });
        }

        // Fondo de contingencia siempre al final
        float fondoContingenciaTotal = 600.0f;
        float fondoContingenciaPorDepartamento = fondoContingenciaTotal / 10;

        modeloTabla.addRow(new Object[]{
            "Fondo de Contingencia",
            String.format("%.2f", fondoContingenciaTotal),
            String.format("%.2f", fondoContingenciaPorDepartamento)
        });

        // Personalización de las celdas
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                            boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Fondo del tipo_egreso
                String tipoEgreso = (String) table.getValueAt(row, 0); // Columna de "Descripción"
                c.setBackground(coloresFondo.getOrDefault(tipoEgreso, Color.WHITE));

                // Centrado del contenido
                ((JLabel) c).setHorizontalAlignment(SwingConstants.CENTER);
                return c;
            }
        };

        // Aplica el renderer a todas las columnas
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        // Configura el encabezado de la tabla
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setFont(new Font("Roboto Light", Font.BOLD, 12));
        headerRenderer.setBackground(new Color(166, 189, 211));

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        actualizarTotales();
    }
    
    private void actualizarTotales() {
        float sumaTotal = 0.0f;
        float sumaXDpto = 0.0f;

        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();

        // Iterar sobre las filas de la tabla para sumar las columnas "Total" y "X Dpto"
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String valorTotal = (String) modeloTabla.getValueAt(i, 1); // Columna "Total"
            String valorXDpto = (String) modeloTabla.getValueAt(i, 2); // Columna "X Dpto"

            // Sumar los valores, asegurándonos de que no sean nulos o vacíos
            if (valorTotal != null && !valorTotal.isEmpty()) {
                sumaTotal += Float.parseFloat(valorTotal);
            }
            if (valorXDpto != null && !valorXDpto.isEmpty()) {
                sumaXDpto += Float.parseFloat(valorXDpto);
            }
        }

        // Formatear las sumas a dos decimales
        String sumaTotalFormateada = String.format("%.2f", sumaTotal);
        String sumaXDptoFormateada = String.format("%.2f", sumaXDpto);

        // Actualizar los JLabel dentro de los paneles
        jLabel5.setText(sumaTotalFormateada);
        jLabel6.setText(sumaXDptoFormateada);
    }

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cuota_mensual_dpt;
    private javax.swing.JPanel cuota_mensual_num_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mes_panel;
    // End of variables declaration//GEN-END:variables
}
