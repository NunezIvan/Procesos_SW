
package com.vistas;

import com.conexion.conexion;
import static com.datos.egresos.listarEgresosPorPeriodoYMes;
import com.dominio.Periodo;
import com.dominio.egreso;
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
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class Egresos_Panel extends javax.swing.JPanel {
    
    encargado Encargado;
    Periodo periodo;
    private final Timer timer;
    
    public Egresos_Panel(encargado encargadoingresado, Periodo periodoingresado) {
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        timer = new Timer(1000, e->actualizartabla_condiseño());
        timer.start();
        initComponents();
        configurarComboBoxMeses();

        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTablaEgresos();
                personalizar_tablas();
            }
        });
        actualizarTablaEgresos();
        personalizar_tablas();
    }

    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        egreso_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        egreso_fijo_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mes_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabla_egresos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        saldo_total_mes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(953, 443));
        setMinimumSize(new java.awt.Dimension(953, 443));
        setPreferredSize(new java.awt.Dimension(953, 443));

        egreso_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        egreso_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egreso_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                egreso_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                egreso_panelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Egreso");

        javax.swing.GroupLayout egreso_panelLayout = new javax.swing.GroupLayout(egreso_panel);
        egreso_panel.setLayout(egreso_panelLayout);
        egreso_panelLayout.setHorizontalGroup(
            egreso_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        egreso_panelLayout.setVerticalGroup(
            egreso_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel2.setText("Registrar Egreso Fijo");

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

        mes_panel.setBackground(new java.awt.Color(255, 255, 255));
        mes_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Egresos de");

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

        tabla_egresos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_egresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_egresos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tabla_egresos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        tabla_egresos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_egresos.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        tabla_egresos.setMaximumSize(new java.awt.Dimension(928, 368));
        tabla_egresos.setMinimumSize(new java.awt.Dimension(928, 368));
        tabla_egresos.setName(""); // NOI18N
        tabla_egresos.setPreferredSize(new java.awt.Dimension(928, 368));

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
        jTable1.setMaximumSize(new java.awt.Dimension(928, 368));
        jTable1.setMinimumSize(new java.awt.Dimension(928, 368));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(928, 368));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        tabla_egresos.setViewportView(jTable1);
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
        jPanel5.setMaximumSize(new java.awt.Dimension(15, 41));
        jPanel5.setMinimumSize(new java.awt.Dimension(15, 41));
        jPanel5.setPreferredSize(new java.awt.Dimension(15, 41));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo_total_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(egreso_fijo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(egreso_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_egresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_egresos, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(egreso_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(egreso_fijo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo_total_mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mes_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void actualizartabla_condiseño(){
        actualizarTablaEgresos();
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
    
    private void actualizarTablaEgresos() {
        int mesEgreso = jComboBox1.getSelectedIndex() + 1;

        List<egreso> egresos = listarEgresosPorPeriodoYMes(periodo.getIdPeriodo(), mesEgreso);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Egresos");
        model.addColumn("Egresos por Transferencia");
        model.addColumn("Egresos por Yape");
        model.addColumn("Egresos en Efectivo");
        model.addColumn("Depósito en BCP");
        model.addColumn("Pago Vía Web");

        float totalEgreso = 0.0f; 

        for (egreso eg : egresos) {
            String descripcionEgreso;
            if(eg.getA_nombre()==null){
                descripcionEgreso = "Pago  " +  eg.getTipo() +  "  |  " +
                                       eg.getDia_egreso() + "/" + eg.getMes_egreso() + "/" + eg.getAno_egreso();
            }else{
                descripcionEgreso = eg.getTipo() + "  |  " + eg.getA_nombre() + "  |  " +
                                       eg.getDia_egreso() + "/" + eg.getMes_egreso() + "/" + eg.getAno_egreso();
            }
            

            Object[] fila = new Object[6];
            fila[0] = descripcionEgreso;
            // Según el modo de pago, llenar la columna correspondiente con el monto
            String modoPago = eg.getModo_pago();

            switch (modoPago.trim()) { // trim() para eliminar espacios accidentales
                case "Transferencia":
                    fila[1] = eg.getMonto();
                    break;
                case "Yape":
                    fila[2] = eg.getMonto();
                    break;
                case "Efectivo":
                    fila[3] = eg.getMonto();
                    break;
                case "BCP":
                    fila[4] = eg.getMonto();
                    break;
                case "Vía Web":
                    fila[5] = eg.getMonto();
                    break;
                default:
                    System.out.println("Modo de pago no reconocido: " + modoPago);
                    break;
            }

            // Sumar el monto actual al total de egresos
            totalEgreso += eg.getMonto();

            // Agregar la fila al modelo
            model.addRow(fila);
        }
        jTable1.setModel(model);
        jLabel5.setText(String.format("%.2f", totalEgreso));
    }
    
    
    private void egreso_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_panelMouseClicked
        registrar_egreso egreso = new registrar_egreso(Encargado,periodo);
        egreso.setVisible(true);
        egreso.setLocationRelativeTo(this);
    }//GEN-LAST:event_egreso_panelMouseClicked

    private void egreso_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_panelMouseEntered
        egreso_panel.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_egreso_panelMouseEntered

    private void egreso_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_panelMouseExited
        egreso_panel.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_egreso_panelMouseExited

    private void egreso_fijo_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseClicked
        registrar_egreso_fijo egreso_fijo = new registrar_egreso_fijo(Encargado,periodo);
        egreso_fijo.setVisible(true);
        egreso_fijo.setLocationRelativeTo(this);
    }//GEN-LAST:event_egreso_fijo_panelMouseClicked

    private void egreso_fijo_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseEntered
        egreso_fijo_panel.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_egreso_fijo_panelMouseEntered

    private void egreso_fijo_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egreso_fijo_panelMouseExited
        egreso_fijo_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_egreso_fijo_panelMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void personalizar_tablas() {
        // Comprobar si el JTable tiene el modelo de columna adecuado
        if (jTable1.getColumnModel().getColumnCount() > 0) {

            jTable1.getColumnModel().getColumn(0).setPreferredWidth(180);
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

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel egreso_fijo_panel;
    private javax.swing.JPanel egreso_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mes_panel;
    private javax.swing.JPanel saldo_total_mes;
    private javax.swing.JScrollPane tabla_egresos;
    // End of variables declaration//GEN-END:variables
}
