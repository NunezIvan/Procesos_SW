package com.vistas;


import com.datos.consumos;
import static com.datos.consumos.existeConsumoAguaPorMesYPeriodo;
import static com.datos.consumos.listarConsumosPorOrden;
import static com.datos.consumos.obtenerConsumoPorPeriodoYMes;
import static com.datos.egresos.existeEgresoAguaPorMesYPeriodo;
import static com.datos.egresos.obtenerEgresoAguaPorMesYPeriodo;
import com.dominio.Periodo;
import com.dominio.consumo_agua;
import com.dominio.egreso;
import com.dominio.encargado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class Consumo_panel extends javax.swing.JPanel {
   
    encargado Encargado;
    Periodo periodo;
    
    public Consumo_panel(encargado encargadoingresado, Periodo periodoingresado) {
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        initComponents();
        configurarEstiloSinBordes();
        personalizar_tablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consumo_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contometro_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        aacc_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(959, 511));
        setMinimumSize(new java.awt.Dimension(959, 511));
        setPreferredSize(new java.awt.Dimension(959, 511));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        consumo_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        consumo_panel.setMaximumSize(new java.awt.Dimension(167, 41));
        consumo_panel.setMinimumSize(new java.awt.Dimension(167, 41));
        consumo_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consumo_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consumo_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consumo_panelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar Consumo");
        jLabel3.setMaximumSize(new java.awt.Dimension(167, 41));
        jLabel3.setMinimumSize(new java.awt.Dimension(167, 41));
        jLabel3.setPreferredSize(new java.awt.Dimension(167, 41));

        javax.swing.GroupLayout consumo_panelLayout = new javax.swing.GroupLayout(consumo_panel);
        consumo_panel.setLayout(consumo_panelLayout);
        consumo_panelLayout.setHorizontalGroup(
            consumo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
            .addGroup(consumo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(consumo_panelLayout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        consumo_panelLayout.setVerticalGroup(
            consumo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(consumo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

        contometro_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contometro_panel.setMaximumSize(new java.awt.Dimension(167, 41));
        contometro_panel.setMinimumSize(new java.awt.Dimension(167, 41));
        contometro_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contometro_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contometro_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contometro_panelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar Contómetro");

        javax.swing.GroupLayout contometro_panelLayout = new javax.swing.GroupLayout(contometro_panel);
        contometro_panel.setLayout(contometro_panelLayout);
        contometro_panelLayout.setHorizontalGroup(
            contometro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
            .addGroup(contometro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        contometro_panelLayout.setVerticalGroup(
            contometro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(contometro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
        );

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(129, 19));
        jPanel1.setMinimumSize(new java.awt.Dimension(129, 19));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consumo de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Enero", " Febrero", " Marzo", " Abril", " Mayo", " Junio", " Julio", " Agosto", " Septiembre", " Octubre", " Noviembre", " Diciembre", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        aacc_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aacc_panel.setMaximumSize(new java.awt.Dimension(167, 41));
        aacc_panel.setMinimumSize(new java.awt.Dimension(167, 41));
        aacc_panel.setName(""); // NOI18N
        aacc_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aacc_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aacc_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aacc_panelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar AACC*");
        jLabel6.setMaximumSize(new java.awt.Dimension(167, 41));
        jLabel6.setMinimumSize(new java.awt.Dimension(167, 41));
        jLabel6.setPreferredSize(new java.awt.Dimension(167, 41));

        javax.swing.GroupLayout aacc_panelLayout = new javax.swing.GroupLayout(aacc_panel);
        aacc_panel.setLayout(aacc_panelLayout);
        aacc_panelLayout.setHorizontalGroup(
            aacc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
            .addGroup(aacc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aacc_panelLayout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        aacc_panelLayout.setVerticalGroup(
            aacc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(aacc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(aacc_panelLayout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(954, 420));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(954, 420));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(954, 420));

        jTable1.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DPTOS", "Lectura Anterior", "Lectura Actual", "C.M3", "Cuota Agua", "Subtotal", "Cuota_D", "Subtotal_D", "C_Fijo", "IGV", "Mora", "C.P X DPTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setMaximumSize(new java.awt.Dimension(933, 420));
        jTable1.setMinimumSize(new java.awt.Dimension(933, 420));
        jTable1.setPreferredSize(new java.awt.Dimension(933, 420));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(75);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(aacc_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contometro_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consumo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contometro_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aacc_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consumo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(536, 536, 536))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consumo_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consumo_panelMouseClicked
        int mesSeleccionado = jComboBox1.getSelectedIndex() + 1; // Enero es 0, lo ajustamos a 1

        boolean existeEgreso = existeEgresoAguaPorMesYPeriodo(mesSeleccionado, periodo.getIdPeriodo());
        boolean existeConsumo = existeConsumoAguaPorMesYPeriodo (mesSeleccionado, periodo.getIdPeriodo());

        egreso egresoExistente = obtenerEgresoAguaPorMesYPeriodo(mesSeleccionado, periodo.getIdPeriodo());
        consumo_agua consumoExistente = obtenerConsumoPorPeriodoYMes(periodo.getIdPeriodo(), mesSeleccionado);

        // Verificar si no existen registros
        if (!existeEgreso && !existeConsumo) {
            registrar_consumo consumo = new registrar_consumo(Encargado, periodo, 0, 0);
            consumo.setVisible(true);
            consumo.setLocationRelativeTo(this);
        } else {
            int option = JOptionPane.showConfirmDialog(
                this,
                "Ya existen registros para el mes seleccionado. ¿Deseas modificarlos?",
                "Modificar Registros",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (option == JOptionPane.YES_OPTION) {
                // Validar que existan los objetos antes de continuar
                if (egresoExistente != null && consumoExistente != null) {
                    registrar_consumo consumo = new registrar_consumo(
                        Encargado,
                        periodo,
                        consumoExistente.getIdConsumoAgua(),
                        egresoExistente.getId_egreso()
                    );

                    // Rellenar los campos con los valores existentes
                    consumo.setValores(egresoExistente, consumoExistente);
                    consumo.setVisible(true);
                    consumo.setLocationRelativeTo(this);
                } else {
                    JOptionPane.showMessageDialog(
                        this,
                        "Error al cargar los registros existentes.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
    }//GEN-LAST:event_consumo_panelMouseClicked

    private void consumo_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consumo_panelMouseEntered
        consumo_panel.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_consumo_panelMouseEntered

    private void consumo_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consumo_panelMouseExited
        consumo_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_consumo_panelMouseExited

    private void contometro_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contometro_panelMouseClicked

        registrar_contometro contometro = new registrar_contometro(Encargado, periodo,(jComboBox1.getSelectedIndex() + 1));
        if(contometro.isDisplayable()) { // Solo mostrar si no se cerró por error
            contometro.setVisible(true);
            contometro.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_contometro_panelMouseClicked

    private void contometro_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contometro_panelMouseEntered
        contometro_panel.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_contometro_panelMouseEntered

    private void contometro_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contometro_panelMouseExited
        contometro_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_contometro_panelMouseExited

    private void aacc_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aacc_panelMouseClicked
        registrar_AACC consumo_aacc = new registrar_AACC(Encargado,periodo,(jComboBox1.getSelectedIndex() + 1));
        if(consumo_aacc.isDisplayable()) {
            consumo_aacc.setVisible(true);
            consumo_aacc.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_aacc_panelMouseClicked

    private void aacc_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aacc_panelMouseEntered
        aacc_panel.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_aacc_panelMouseEntered

    private void aacc_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aacc_panelMouseExited
        aacc_panel.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_aacc_panelMouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int mesSeleccionado = jComboBox1.getSelectedIndex() + 1;
        actualizarTablaConsumos(mesSeleccionado);
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
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
    
    private void configurarEstiloSinBordes() {
        try {
            // Establecer el LookAndFeel predeterminado de Java para evitar Nimbus o Metal
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setRenderer(new Consumo_panel.CustomComboBoxRenderer()); // Aplicar renderer personalizado  
    }  
    
    private void actualizarTablaConsumos(int mesSeleccionado) {
        // Obtener el modelo de la tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        // Limpiar la tabla
        modelo.setRowCount(0);

        // Listar los consumos en el orden solicitado
        List<consumo_agua> listaConsumos = listarConsumosPorOrden(periodo.getIdPeriodo(), mesSeleccionado);

        // Iterar sobre la lista de consumos y añadir las filas al modelo de la tabla
        for (consumo_agua consumo : listaConsumos) {
            // Determinar el valor para la columna DPTOS
            String dptos = consumo.getTipoConsumo();
            if (dptos.equalsIgnoreCase("Apartamento")) {
                dptos = consumo.getApartamento(); // Usar el número del apartamento
            }

            // Calcular valores específicos para AACC
            String lecturaAnterior = "-";
            String lecturaActual = "-";
            String cM3 = "-";
            float cm3 = 0;
            if (consumo.getTipoConsumo().equalsIgnoreCase("AACC")) {
                cm3 = consumo.getCargoFijo(); // Usar Cargo Fijo como el valor de C.M3 para AACC
                cM3 = String.format("%.2f", cm3); // Redondear a 2 decimales
            } else {
                // Calcular el valor de C.M3 (sin dividir entre 1000 para "Exterior")
                cm3 = consumo.getLecturaActual() - consumo.getLecturaAnterior();
                if (!consumo.getTipoConsumo().equalsIgnoreCase("Exterior")) {
                    cm3 = cm3 / 1000.0f; // Dividir entre 1000 solo para apartamentos
                }
                cM3 = cm3 == 0 ? "-" : String.format("%.2f", cm3); // Redondear a 2 decimales

                // Solo llenar lecturas para Exterior y Apartamentos
                lecturaAnterior = consumo.getLecturaAnterior() == 0 ? "-" : String.valueOf(consumo.getLecturaAnterior());
                lecturaActual = consumo.getLecturaActual() == 0 ? "-" : String.valueOf(consumo.getLecturaActual());
            }

            // Ajustar la mora para los apartamentos dividiendo entre 10
            String mora = consumo.getMora();
            if (consumo.getTipoConsumo().equalsIgnoreCase("Apartamento")) {
                float moraAjustada = Float.parseFloat(mora) / 10;
                mora = String.format("%.2f", moraAjustada); // Redondear a 2 decimales
            }

            // Reemplazar valores 0 con "-" para las columnas correspondientes
            String cuotaAgua = consumo.getPagoConsumo() == 0 ? "-" : String.format("%.2f", consumo.getPagoConsumo() / cm3);
            String subtotal = consumo.getPagoConsumo() == 0 ? "-" : String.format("%.2f", consumo.getPagoConsumo());
            String cuotaD = consumo.getPagoDesague() == 0 ? "-" : String.format("%.2f", consumo.getPagoDesague() / cm3);
            String subtotalD = consumo.getPagoDesague() == 0 ? "-" : String.format("%.2f", consumo.getPagoDesague());
            String cFijo = consumo.getCargoFijo() == 0 ? "-" : String.format("%.2f", consumo.getCargoFijo());
            String igv = consumo.getIgvConsumo() == 0 ? "-" : String.format("%.2f", consumo.getIgvConsumo());
            String total = consumo.getMontoTotal() == 0 ? "-" : String.format("%.2f", consumo.getMontoTotal());

            // Añadir la fila al modelo de la tabla
            modelo.addRow(new Object[]{
                dptos, // DPTOS: Exterior, AACC o número del apartamento
                lecturaAnterior, // Lectura Anterior (vacío para AACC)
                lecturaActual, // Lectura Actual (vacío para AACC)
                cM3, // C.M3
                cuotaAgua, // Cuota Agua
                subtotal, // Subtotal
                cuotaD, // Cuota_D
                subtotalD, // Subtotal_D
                cFijo, // C_Fijo
                igv, // IGV
                mora, // Mora
                total // C.P X DPTO
            });
        }
    }
    
    private void personalizar_tablas() {
        // Comprobar si el JTable tiene el modelo de columna adecuado
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            // Establecer las columnas como no redimensionables
            for (int i = 0; i < jTable1.getColumnModel().getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setResizable(false);
            }

            // Personalizar el encabezado
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    c.setBackground(new Color(166, 189, 211)); // Color de fondo del header
                    c.setForeground(Color.BLACK); // Color del texto
                    setFont(new Font("Roboto Light", Font.BOLD, 13)); // Fuente personalizada
                    setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
                    setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto
                    return c;
                }
            };
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }

            // Render para centrar y personalizar colores
            DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto

                    // Aplicar colores personalizados según la columna
                    if (column == 8 || column == 10) { // Columnas Cargo Fijo y Mora
                        c.setBackground(new Color(182, 210, 167));
                    } else {
                        c.setBackground(Color.WHITE); // Fondo blanco por defecto
                    }

                    if (column == 4 || column == 6) { // Columnas Cuota Agua y Cuota Desagüe
                        c.setForeground(Color.RED);
                    } else {
                        c.setForeground(Color.BLACK); // Texto negro por defecto
                    }

                    return c;
                }
            };

            // Asignar el render personalizado a todas las columnas
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
            }
        } else {
            System.out.println("Error: Las columnas no están inicializadas.");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aacc_panel;
    private javax.swing.JPanel consumo_panel;
    private javax.swing.JPanel contometro_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
