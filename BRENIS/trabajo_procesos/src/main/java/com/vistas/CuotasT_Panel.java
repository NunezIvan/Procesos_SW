/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import com.datos.Ingresos;
import static com.datos.Ingresos.crearIngreso;
import static com.datos.Ingresos.eliminarIngresoPorApartamentoYPeriodo;
import com.datos.consumos;
import static com.datos.consumos.listarConsumosPorOrden;
import com.datos.egresos;
import com.dominio.Ingreso;
import com.dominio.Periodo;
import com.dominio.consumo_agua;
import static com.datos.contingencia_db.generarContingenciaMensual;
import com.dominio.egreso;
import com.dominio.encargado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class CuotasT_Panel extends javax.swing.JPanel {

    encargado Encargado;
    Periodo periodo;
    
    public CuotasT_Panel(encargado encargadoingresado, Periodo periodoingresado) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Panel_Crear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Eliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(953, 443));
        setMinimumSize(new java.awt.Dimension(953, 443));
        setPreferredSize(new java.awt.Dimension(953, 443));

        jPanel2.setBackground(new java.awt.Color(191, 221, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(917, 28));
        jPanel2.setMinimumSize(new java.awt.Dimension(917, 28));
        jPanel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUOTA  DEL EDIFICIO \"SANTIAGO APOSTOL\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(928, 368));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(928, 368));

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dpto", "C.Mensual", "C.Agua", "Total S/.", "Redondeo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setMaximumSize(new java.awt.Dimension(928, 368));
        jTable1.setMinimumSize(new java.awt.Dimension(928, 368));
        jTable1.setPreferredSize(new java.awt.Dimension(928, 368));
        jTable1.setRowHeight(25);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(15, 41));
        jPanel1.setMinimumSize(new java.awt.Dimension(15, 41));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(106, 41));
        jPanel3.setMinimumSize(new java.awt.Dimension(106, 41));
        jPanel3.setPreferredSize(new java.awt.Dimension(106, 41));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cuota de");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Enero", " Febrero", " Marzo", " Abril", " Mayo", " Junio", " Julio", " Agosto", " Septiembre", " Octubre", " Noviembre", " Diciembre", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(106, 41));
        jPanel4.setMinimumSize(new java.awt.Dimension(106, 41));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panel_Crear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Crear.setMaximumSize(new java.awt.Dimension(106, 41));
        Panel_Crear.setMinimumSize(new java.awt.Dimension(106, 41));
        Panel_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CrearMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear Cuotas");

        javax.swing.GroupLayout Panel_CrearLayout = new javax.swing.GroupLayout(Panel_Crear);
        Panel_Crear.setLayout(Panel_CrearLayout);
        Panel_CrearLayout.setHorizontalGroup(
            Panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        Panel_CrearLayout.setVerticalGroup(
            Panel_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Eliminar.setMaximumSize(new java.awt.Dimension(106, 41));
        Panel_Eliminar.setMinimumSize(new java.awt.Dimension(106, 41));
        Panel_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_EliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_EliminarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar Cuotas");

        javax.swing.GroupLayout Panel_EliminarLayout = new javax.swing.GroupLayout(Panel_Eliminar);
        Panel_Eliminar.setLayout(Panel_EliminarLayout);
        Panel_EliminarLayout.setHorizontalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        Panel_EliminarLayout.setVerticalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void personalizar_tablas() {
        // Verificar si las columnas están configuradas
        if (jTable1.getColumnModel().getColumnCount() > 0) {

            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);

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
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Panel_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CrearMouseClicked
        int mesSeleccionado = jComboBox1.getSelectedIndex() + 1; // Enero es 0
        int idPeriodo = periodo.getIdPeriodo();
        String tipoPago = "Sin_Determinar";
        List<String> apartamentos = List.of("201", "202", "301", "302", "401", "402", "501", "502", "601", "602");

        // Validar si todos los consumos están registrados
        boolean consumosCompletos = true;
        for (String apto : apartamentos) {
            if (!consumos.existeConsumoAguaPorDepartamento(apto, idPeriodo, mesSeleccionado)) {
                consumosCompletos = false;
                break;
            }
        }

        if (!consumosCompletos) {
            JOptionPane.showMessageDialog(
                this,
                "No se pueden crear las cuotas. Todos los consumos deben estar registrados.",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Verificar si ya existen cuotas
        List<Ingreso> cuotasExistentes = Ingresos.obtenerIngresosPorPeriodoYMes(idPeriodo, mesSeleccionado);
        if (cuotasExistentes.size() == 10) {
            llenarTablaCuotasExistentes(cuotasExistentes);
            JOptionPane.showMessageDialog(
                this,
                "Las cuotas ya están creadas para este mes y periodo.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // Calcular cuotas
        Map<String, Float> cuotaMensualMap = calcularCuotasMensuales(idPeriodo, mesSeleccionado);
        List<Ingreso> ingresos = new ArrayList<>();
        float sumaTotalRedondeada = 0;

        for (String apto : apartamentos) {
            float cuotaMensual = cuotaMensualMap.getOrDefault(apto, 0f);
            float consumoAgua = consumos.obtenerConsumoAguaPorDepartamento(apto, idPeriodo, mesSeleccionado);
            float total = cuotaMensual + consumoAgua;
            float redondeo = redondear(total); // Aplicar lógica de redondeo

            // Crear el objeto Ingreso
            Ingreso ingreso = new Ingreso(
                tipoPago,                   // Tipo de pago
                java.time.LocalDate.now().getDayOfMonth(), // Día actual
                mesSeleccionado,            // Mes seleccionado
                java.time.LocalDate.now().getYear(),      // Año actual
                apto,                       // Apartamento
                redondeo,                   // Monto redondeado
                false,                      // No pagado por defecto
                idPeriodo,                  // ID del periodo
                Encargado.getDni_encargado()          // DNI del encargado
            );
            ingresos.add(ingreso);
            sumaTotalRedondeada += redondeo;

            // Añadir a la tabla
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.addRow(new Object[]{
                apto,
                String.format("%.2f", cuotaMensual),
                String.format("%.2f", consumoAgua),
                String.format("%.2f", total),
                String.format("%.2f", redondeo)
            });
        }
        
        try {
            generarContingenciaMensual(periodo.getIdPeriodo(), Encargado.getDni_encargado(), mesSeleccionado);
        } catch (SQLException ex) {
            Logger.getLogger(CuotasT_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Guardar en la base de datos
        for (Ingreso ingreso : ingresos) {
            Ingresos.crearIngreso(ingreso);
        }

        // Actualizar el JLabel con el total redondeado
        jLabel7.setText(String.format("%.2f", sumaTotalRedondeada));

        JOptionPane.showMessageDialog(
            this,
            "Cuotas creadas correctamente.",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_Panel_CrearMouseClicked

    private void Panel_CrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CrearMouseEntered
        Panel_Crear.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Panel_CrearMouseEntered

    private void Panel_CrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CrearMouseExited
        Panel_Crear.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Panel_CrearMouseExited

    private void Panel_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EliminarMouseClicked
        int mesSeleccionado = jComboBox1.getSelectedIndex() + 1; // Enero es 0
        int idPeriodo = periodo.getIdPeriodo();
        List<String> apartamentos = List.of("201", "202", "301", "302", "401", "402", "501", "502", "601", "602");

        // Eliminar cuotas de la base de datos
        for (String apto : apartamentos) {
            eliminarIngresoPorApartamentoYPeriodo(apto, idPeriodo, mesSeleccionado); // Método CRUD para eliminar
        }

        // Limpiar la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);

        // Resetear el JLabel
        jLabel7.setText("0000");

        JOptionPane.showMessageDialog(this, "Cuotas eliminadas exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Panel_EliminarMouseClicked

    private void Panel_EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EliminarMouseEntered
        Panel_Eliminar.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Panel_EliminarMouseEntered

    private void Panel_EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EliminarMouseExited
        Panel_Eliminar.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Panel_EliminarMouseExited

    public Map<String, Float> calcularCuotasMensuales(int idPeriodo, int mesSeleccionado) {
        // Mapa para almacenar el total acumulado por apartamento
        Map<String, Float> cuotasMensuales = new HashMap<>();

        // Lista de apartamentos en orden
        String[] apartamentos = {"201", "202", "301", "302", "401", "402", "501", "502", "601", "602"};

        // Inicializar el mapa con los apartamentos
        for (String apto : apartamentos) {
            cuotasMensuales.put(apto, 0.0f);
        }

        // Obtener todos los egresos para el periodo y mes seleccionados
        List<egreso> listaEgresos = egresos.listarEgresosPorPeriodoYMes(idPeriodo, mesSeleccionado);

        // Calcular el monto por departamento para cada tipo de egreso
        for (egreso eg : listaEgresos) {
            // Ignorar egresos del tipo " Agua"
            if (" Agua".equalsIgnoreCase(eg.getTipo())) {
                continue;
            }

            // Dividir el monto total entre 10 departamentos
            float cuotaPorDepartamento = eg.getMonto() / 10;

            // Agregar la cuota a cada apartamento
            for (String apto : apartamentos) {
                float totalActual = cuotasMensuales.get(apto);
                cuotasMensuales.put(apto, totalActual + cuotaPorDepartamento);
            }
        }

        // Fondo de contingencia fijo, dividido entre 10 departamentos
        float fondoContingenciaTotal = 600.0f; // Ejemplo: 600
        float fondoContingenciaPorDepartamento = fondoContingenciaTotal / 10;

        // Agregar el fondo de contingencia a cada apartamento
        for (String apto : apartamentos) {
            float totalActual = cuotasMensuales.get(apto);
            cuotasMensuales.put(apto, totalActual + fondoContingenciaPorDepartamento);
        }

        return cuotasMensuales;
    }
    
    private float redondear(float valor) {
        // Convertir el valor a una representación con dos decimales
        int entero = (int) valor; // Parte entera del número
        float decimal = valor - entero; // Parte decimal del número

        // Extraer los primeros dos decimales
        int decimales = Math.round(decimal * 100); // Convertir la parte decimal en entero (e.g., 0.27 -> 27)

        // Redondear al decimal más cercano:
        // Si el segundo decimal es >= 5, redondear hacia arriba
        if (decimales % 10 >= 5) {
            decimales = (decimales / 10) * 10 + 10; // Redondear al siguiente múltiplo de 10
        } else {
            decimales = (decimales / 10) * 10; // Redondear al múltiplo de 10 inferior
        }

        // Reconstruir el valor final redondeado
        float valorRedondeado = entero + (decimales / 100.0f);

        return valorRedondeado;
    }
    
    private void llenarTablaCuotasExistentes(List<Ingreso> cuotasExistentes) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        float sumaTotal = 0;
        for (Ingreso ingreso : cuotasExistentes) {
            float cuotaMensual = calcularCuotasMensuales(ingreso.getIdPeriodo(), ingreso.getMesIngreso()).get(ingreso.getApartamento());
            float consumoAgua = consumos.obtenerConsumoAguaPorDepartamento(ingreso.getApartamento(), ingreso.getIdPeriodo(), ingreso.getMesIngreso());
            float total = cuotaMensual + consumoAgua;

            float redondeo = redondear(total); // Aplicar redondeo

            modelo.addRow(new Object[]{
                ingreso.getApartamento(),
                String.format("%.2f", cuotaMensual),
                String.format("%.2f", consumoAgua),
                String.format("%.2f", total),
                String.format("%.2f", redondeo)
            });

            sumaTotal += redondeo;
        }

        jLabel7.setText(String.format("%.2f", sumaTotal)); // Actualizar el JLabel con el total redondeado
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
    private javax.swing.JPanel Panel_Crear;
    private javax.swing.JPanel Panel_Eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
