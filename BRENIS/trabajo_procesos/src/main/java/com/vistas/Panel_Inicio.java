
package com.vistas;

import static com.datos.Ingresos.obtenerSumaIngresos;
import static com.datos.Reportes.obtenerMesesSinConsumoAgua;
import static com.datos.Reportes.obtenerMesesSinRegistros;
import static com.datos.Reportes.obtenerPagosPorDepartamento;
import static com.datos.Reportes.tienePocaActividadMesActual;
import static com.datos.Reportes.verificarTodasCuotasPagadasHastaMesActual;
import static com.datos.contingencia_db.obtenerSumaContingencias;
import static com.datos.egresos.obtenerSumaEgresos;
import com.dominio.Periodo;
import com.dominio.encargado;
import java.awt.Color;
import java.time.LocalDate;

public class Panel_Inicio extends javax.swing.JPanel {

    encargado Encargado;
    Periodo periodo;
    
    public Panel_Inicio(encargado encargadoingresado, Periodo periodoingresado) {
        
        initComponents();
        this.Encargado = encargadoingresado;
        this.periodo = periodoingresado;
        this.revalidate();
        this.repaint();
        
        float ingresos_tot = obtenerSumaIngresos(periodo.getIdPeriodo());
        String ingresostot_str = Float.toString(ingresos_tot);
        label_ingresos.setText(ingresostot_str);
        
        float egresos_tot = obtenerSumaEgresos(periodo.getIdPeriodo());
        String egresostot_str = Float.toString(egresos_tot);
        label_egresos.setText(egresostot_str);
        
        float contin_tot = obtenerSumaContingencias(periodo.getIdPeriodo());
        String contintot_str = Float.toString(contin_tot);
        label_contingencia.setText(contintot_str);
        
        float Balance = ingresos_tot - egresos_tot;
        String Balance_Str = Float.toString(Balance);
        if(Balance < 0){
            label_balance.setText(Balance_Str);
            label_balance.setForeground(Color.red);
        }else{
            label_balance.setText(Balance_Str);
        }
        
        if(obtenerMesesSinRegistros(periodo.getIdPeriodo()) == 0){
            label_anuncios.setText("• No se encuentran meses vacios");
        }else if(obtenerMesesSinRegistros(periodo.getIdPeriodo())>0 && obtenerMesesSinRegistros(periodo.getIdPeriodo())<=3){
            label_anuncios.setText("• Algunos meses se encuentran vacios");
        } else if(obtenerMesesSinRegistros(periodo.getIdPeriodo())>3 && obtenerMesesSinRegistros(periodo.getIdPeriodo())<=6){
            label_anuncios.setText("• Varios meses se encuentran vacios");
        }else if(obtenerMesesSinRegistros(periodo.getIdPeriodo())>6 && obtenerMesesSinRegistros(periodo.getIdPeriodo())<=11){
            label_anuncios.setText("• Muchos meses se encuentran vacios");
        }else if(obtenerMesesSinRegistros(periodo.getIdPeriodo())>11){
            label_anuncios.setText("• Todos los meses se encuentran vacios");
        }
        
        
        if(verificarTodasCuotasPagadasHastaMesActual(periodo.getIdPeriodo())){
            label_anuncios1.setText("• Todas las cuotas estan pagadas");
        }else{
            label_anuncios1.setText("• Faltan cuotas por pagar");
        }
        
        int mesesSinConsumo = obtenerMesesSinConsumoAgua(periodo.getIdPeriodo());

        if (mesesSinConsumo == 0) {
            label_anuncios2.setText("• No se encuentran meses sin consumo de agua registrados");
        } else if (mesesSinConsumo > 0 && mesesSinConsumo <= 3) {
            label_anuncios2.setText("• Algunos meses no tienen consumo de agua registrado");
        } else if (mesesSinConsumo > 3 && mesesSinConsumo <= 6) {
            label_anuncios2.setText("• Varios meses no tienen consumo de agua registrado");
        } else if (mesesSinConsumo > 6 && mesesSinConsumo <= 11) {
            label_anuncios2.setText("• Muchos meses no tienen consumo de agua registrado");
        } else if (mesesSinConsumo > 11) {
            label_anuncios2.setText("• Todos los meses no tienen consumo de agua registrado");
        }
        
        if(tienePocaActividadMesActual(periodo.getIdPeriodo())){
            label_anuncios3.setText("• El mes actual tiene pocos registros");
        }else{
            label_anuncios3.setText("• El mes actual tiene suficiente actividad.");
        }
        actualizarEstadoDePagos(periodo.getIdPeriodo());
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        label_egresos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        label_ingresos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        label_contingencia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_balance = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Egreso_Panel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Contometro_Panel = new javax.swing.JPanel();
        Contometro_Label = new javax.swing.JLabel();
        Ingreso_Panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Egreso_Fijo = new javax.swing.JPanel();
        Contometro_Label1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        label_201 = new javax.swing.JLabel();
        label_202 = new javax.swing.JLabel();
        label_301 = new javax.swing.JLabel();
        label_302 = new javax.swing.JLabel();
        label_401 = new javax.swing.JLabel();
        label_402 = new javax.swing.JLabel();
        label_501 = new javax.swing.JLabel();
        label_502 = new javax.swing.JLabel();
        label_601 = new javax.swing.JLabel();
        label_602 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        label_anuncios = new javax.swing.JLabel();
        label_anuncios1 = new javax.swing.JLabel();
        label_anuncios2 = new javax.swing.JLabel();
        label_anuncios3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(967, 512));
        setMinimumSize(new java.awt.Dimension(959, 511));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(967, 512));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel1.setText("Resumen Financiero");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(687, 116));
        jPanel1.setMinimumSize(new java.awt.Dimension(687, 116));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("Ingresos Totales:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Egresos Totales:");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Fondo de Contingencia:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Balance:");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setMaximumSize(new java.awt.Dimension(91, 42));
        jPanel11.setMinimumSize(new java.awt.Dimension(91, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(91, 42));

        label_egresos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_egresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_egresos.setText("0000");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_egresos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_egresos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setMaximumSize(new java.awt.Dimension(91, 42));
        jPanel6.setMinimumSize(new java.awt.Dimension(91, 42));
        jPanel6.setPreferredSize(new java.awt.Dimension(91, 42));

        label_ingresos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_ingresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ingresos.setText("0000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ingresos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_ingresos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(91, 42));
        jPanel5.setMinimumSize(new java.awt.Dimension(91, 42));

        label_contingencia.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_contingencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_contingencia.setText("0000");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_contingencia, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_contingencia, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(91, 42));
        jPanel2.setMinimumSize(new java.awt.Dimension(91, 42));

        label_balance.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_balance.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_balance, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_balance, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel6.setText("Acciones rápidas:");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setMaximumSize(new java.awt.Dimension(398, 298));
        jPanel12.setMinimumSize(new java.awt.Dimension(398, 298));

        Egreso_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Egreso_Panel.setMaximumSize(new java.awt.Dimension(264, 53));
        Egreso_Panel.setMinimumSize(new java.awt.Dimension(264, 53));
        Egreso_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Egreso_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Egreso_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Egreso_PanelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registrar Egreso");

        javax.swing.GroupLayout Egreso_PanelLayout = new javax.swing.GroupLayout(Egreso_Panel);
        Egreso_Panel.setLayout(Egreso_PanelLayout);
        Egreso_PanelLayout.setHorizontalGroup(
            Egreso_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        Egreso_PanelLayout.setVerticalGroup(
            Egreso_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        Contometro_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contometro_Panel.setMaximumSize(new java.awt.Dimension(264, 53));
        Contometro_Panel.setMinimumSize(new java.awt.Dimension(264, 53));
        Contometro_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Contometro_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Contometro_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Contometro_PanelMouseExited(evt);
            }
        });

        Contometro_Label.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        Contometro_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contometro_Label.setText("Registrar Contometro");

        javax.swing.GroupLayout Contometro_PanelLayout = new javax.swing.GroupLayout(Contometro_Panel);
        Contometro_Panel.setLayout(Contometro_PanelLayout);
        Contometro_PanelLayout.setHorizontalGroup(
            Contometro_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contometro_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        Contometro_PanelLayout.setVerticalGroup(
            Contometro_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contometro_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        Ingreso_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ingreso_Panel.setMaximumSize(new java.awt.Dimension(264, 53));
        Ingreso_Panel.setMinimumSize(new java.awt.Dimension(264, 53));
        Ingreso_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingreso_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ingreso_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ingreso_PanelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registrar Ingreso");

        javax.swing.GroupLayout Ingreso_PanelLayout = new javax.swing.GroupLayout(Ingreso_Panel);
        Ingreso_Panel.setLayout(Ingreso_PanelLayout);
        Ingreso_PanelLayout.setHorizontalGroup(
            Ingreso_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        Ingreso_PanelLayout.setVerticalGroup(
            Ingreso_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        Egreso_Fijo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Egreso_Fijo.setMaximumSize(new java.awt.Dimension(264, 53));
        Egreso_Fijo.setMinimumSize(new java.awt.Dimension(264, 53));
        Egreso_Fijo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Egreso_FijoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Egreso_FijoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Egreso_FijoMouseExited(evt);
            }
        });

        Contometro_Label1.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        Contometro_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contometro_Label1.setText("Registrar Egreso Fijo");

        javax.swing.GroupLayout Egreso_FijoLayout = new javax.swing.GroupLayout(Egreso_Fijo);
        Egreso_Fijo.setLayout(Egreso_FijoLayout);
        Egreso_FijoLayout.setHorizontalGroup(
            Egreso_FijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contometro_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        Egreso_FijoLayout.setVerticalGroup(
            Egreso_FijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contometro_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Egreso_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Egreso_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contometro_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingreso_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Egreso_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Egreso_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ingreso_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contometro_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel7.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel7.setText("Estado de Pagos:");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setMaximumSize(new java.awt.Dimension(271, 298));
        jPanel17.setMinimumSize(new java.awt.Dimension(271, 298));
        jPanel17.setPreferredSize(new java.awt.Dimension(271, 298));

        label_201.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_201.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_201.setText("• DPTO 202: ");
        label_201.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_201.setMaximumSize(new java.awt.Dimension(257, 15));
        label_201.setMinimumSize(new java.awt.Dimension(257, 15));
        label_201.setPreferredSize(new java.awt.Dimension(257, 15));

        label_202.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_202.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_202.setText("• DPTO 201: ");
        label_202.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_202.setMaximumSize(new java.awt.Dimension(257, 15));
        label_202.setMinimumSize(new java.awt.Dimension(257, 15));
        label_202.setPreferredSize(new java.awt.Dimension(257, 15));

        label_301.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_301.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_301.setText("• DPTO 301: ");
        label_301.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_301.setMaximumSize(new java.awt.Dimension(257, 15));
        label_301.setMinimumSize(new java.awt.Dimension(257, 15));
        label_301.setPreferredSize(new java.awt.Dimension(257, 15));

        label_302.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_302.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_302.setText("• DPTO 302: ");
        label_302.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_302.setMaximumSize(new java.awt.Dimension(257, 15));
        label_302.setMinimumSize(new java.awt.Dimension(257, 15));
        label_302.setPreferredSize(new java.awt.Dimension(257, 15));

        label_401.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_401.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_401.setText("• DPTO 401: ");
        label_401.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_401.setMaximumSize(new java.awt.Dimension(257, 15));
        label_401.setMinimumSize(new java.awt.Dimension(257, 15));
        label_401.setPreferredSize(new java.awt.Dimension(257, 15));

        label_402.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_402.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_402.setText("• DPTO 402: ");
        label_402.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_402.setMaximumSize(new java.awt.Dimension(257, 15));
        label_402.setMinimumSize(new java.awt.Dimension(257, 15));
        label_402.setPreferredSize(new java.awt.Dimension(257, 15));

        label_501.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_501.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_501.setText("• DPTO 501: ");
        label_501.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_501.setMaximumSize(new java.awt.Dimension(257, 15));
        label_501.setMinimumSize(new java.awt.Dimension(257, 15));
        label_501.setPreferredSize(new java.awt.Dimension(257, 15));

        label_502.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_502.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_502.setText("• DPTO 502: ");
        label_502.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_502.setMaximumSize(new java.awt.Dimension(257, 15));
        label_502.setMinimumSize(new java.awt.Dimension(257, 15));
        label_502.setPreferredSize(new java.awt.Dimension(257, 15));

        label_601.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_601.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_601.setText("• DPTO 601: ");
        label_601.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_601.setMaximumSize(new java.awt.Dimension(257, 15));
        label_601.setMinimumSize(new java.awt.Dimension(257, 15));
        label_601.setPreferredSize(new java.awt.Dimension(257, 15));

        label_602.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_602.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_602.setText("• DPTO 602: ");
        label_602.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_602.setMaximumSize(new java.awt.Dimension(257, 15));
        label_602.setMinimumSize(new java.awt.Dimension(257, 15));
        label_602.setPreferredSize(new java.awt.Dimension(257, 15));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_301, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_202, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_302, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_401, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_402, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_501, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_502, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_601, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_602, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_202, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(label_201, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(label_302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel8.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel8.setText("Notificaciones:");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setMaximumSize(new java.awt.Dimension(230, 460));
        jPanel13.setMinimumSize(new java.awt.Dimension(230, 460));
        jPanel13.setPreferredSize(new java.awt.Dimension(230, 460));

        label_anuncios.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_anuncios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_anuncios.setText("• ANUNCIO 1");
        label_anuncios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_anuncios.setMaximumSize(new java.awt.Dimension(208, 446));
        label_anuncios.setMinimumSize(new java.awt.Dimension(208, 446));
        label_anuncios.setPreferredSize(new java.awt.Dimension(208, 446));

        label_anuncios1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_anuncios1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_anuncios1.setText("• ANUNCIO 2");
        label_anuncios1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_anuncios1.setMaximumSize(new java.awt.Dimension(208, 446));
        label_anuncios1.setMinimumSize(new java.awt.Dimension(208, 446));
        label_anuncios1.setPreferredSize(new java.awt.Dimension(208, 446));

        label_anuncios2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_anuncios2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_anuncios2.setText("• ANUNCIO 3");
        label_anuncios2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_anuncios2.setMaximumSize(new java.awt.Dimension(208, 446));
        label_anuncios2.setMinimumSize(new java.awt.Dimension(208, 446));
        label_anuncios2.setPreferredSize(new java.awt.Dimension(208, 446));

        label_anuncios3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        label_anuncios3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_anuncios3.setText("• ANUNCIO 4");
        label_anuncios3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_anuncios3.setMaximumSize(new java.awt.Dimension(208, 446));
        label_anuncios3.setMinimumSize(new java.awt.Dimension(208, 446));
        label_anuncios3.setPreferredSize(new java.awt.Dimension(208, 446));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_anuncios, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(label_anuncios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_anuncios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_anuncios3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_anuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_anuncios1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(label_anuncios2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label_anuncios3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Egreso_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_PanelMouseClicked
        registrar_egreso egreso = new registrar_egreso(Encargado,periodo);
        egreso.setVisible(true);
        egreso.setLocationRelativeTo(this);
    }//GEN-LAST:event_Egreso_PanelMouseClicked

    private void Egreso_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_PanelMouseEntered
        Egreso_Panel.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Egreso_PanelMouseEntered

    private void Egreso_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_PanelMouseExited
        Egreso_Panel.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Egreso_PanelMouseExited

    private void Egreso_FijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_FijoMouseClicked
        registrar_egreso_fijo egreso_fijo = new registrar_egreso_fijo(Encargado,periodo);
        egreso_fijo.setVisible(true);
        egreso_fijo.setLocationRelativeTo(this);
    }//GEN-LAST:event_Egreso_FijoMouseClicked

    private void Egreso_FijoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_FijoMouseEntered
        Egreso_Fijo.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Egreso_FijoMouseEntered

    private void Egreso_FijoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egreso_FijoMouseExited
        Egreso_Fijo.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Egreso_FijoMouseExited

    private void Ingreso_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingreso_PanelMouseClicked
        Registrar_Ingreso ingreso = new Registrar_Ingreso(Encargado,periodo);
        ingreso.setVisible(true);
        ingreso.setLocationRelativeTo(this);
    }//GEN-LAST:event_Ingreso_PanelMouseClicked

    private void Ingreso_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingreso_PanelMouseEntered
        Ingreso_Panel.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Ingreso_PanelMouseEntered

    private void Ingreso_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingreso_PanelMouseExited
        Ingreso_Panel.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Ingreso_PanelMouseExited

    private void Contometro_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contometro_PanelMouseClicked
        
        LocalDate fechaActual = LocalDate.now();
        int mesNum = fechaActual.getMonthValue(); 
        
        registrar_contometro contometro = new registrar_contometro(Encargado, periodo,mesNum);
        if(contometro.isDisplayable()) {
            contometro.setVisible(true);
            contometro.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_Contometro_PanelMouseClicked

    private void Contometro_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contometro_PanelMouseEntered
        Contometro_Panel.setBackground(new Color (153,255,153));
    }//GEN-LAST:event_Contometro_PanelMouseEntered

    private void Contometro_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contometro_PanelMouseExited
        Contometro_Panel.setBackground(new Color (242,242,242));
    }//GEN-LAST:event_Contometro_PanelMouseExited

    
    public final void actualizarEstadoDePagos(int idPeriodo) {
        label_201.setText("• DPTO 201: " + obtenerPagosPorDepartamento(idPeriodo, "201") + " pagos realizados");
        label_202.setText("• DPTO 202: " + obtenerPagosPorDepartamento(idPeriodo, "202") + " pagos realizados");
        label_301.setText("• DPTO 301: " + obtenerPagosPorDepartamento(idPeriodo, "301") + " pagos realizados");
        label_302.setText("• DPTO 302: " + obtenerPagosPorDepartamento(idPeriodo, "302") + " pagos realizados");
        label_401.setText("• DPTO 401: " + obtenerPagosPorDepartamento(idPeriodo, "401") + " pagos realizados");
        label_402.setText("• DPTO 402: " + obtenerPagosPorDepartamento(idPeriodo, "402") + " pagos realizados");
        label_501.setText("• DPTO 501: " + obtenerPagosPorDepartamento(idPeriodo, "501") + " pagos realizados");
        label_502.setText("• DPTO 502: " + obtenerPagosPorDepartamento(idPeriodo, "502") + " pagos realizados");
        label_601.setText("• DPTO 601: " + obtenerPagosPorDepartamento(idPeriodo, "601") + " pagos realizados");
        label_602.setText("• DPTO 602: " + obtenerPagosPorDepartamento(idPeriodo, "602") + " pagos realizados");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contometro_Label;
    private javax.swing.JLabel Contometro_Label1;
    private javax.swing.JPanel Contometro_Panel;
    private javax.swing.JPanel Egreso_Fijo;
    private javax.swing.JPanel Egreso_Panel;
    private javax.swing.JPanel Ingreso_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label_201;
    private javax.swing.JLabel label_202;
    private javax.swing.JLabel label_301;
    private javax.swing.JLabel label_302;
    private javax.swing.JLabel label_401;
    private javax.swing.JLabel label_402;
    private javax.swing.JLabel label_501;
    private javax.swing.JLabel label_502;
    private javax.swing.JLabel label_601;
    private javax.swing.JLabel label_602;
    private javax.swing.JLabel label_anuncios;
    private javax.swing.JLabel label_anuncios1;
    private javax.swing.JLabel label_anuncios2;
    private javax.swing.JLabel label_anuncios3;
    private javax.swing.JLabel label_balance;
    private javax.swing.JLabel label_contingencia;
    private javax.swing.JLabel label_egresos;
    private javax.swing.JLabel label_ingresos;
    // End of variables declaration//GEN-END:variables
}
