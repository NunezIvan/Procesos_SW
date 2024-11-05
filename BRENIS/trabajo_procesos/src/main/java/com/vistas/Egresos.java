/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import static com.datos.egresos.listarEgresos;
import com.dominio.egreso;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USER
 */
public class Egresos extends javax.swing.JPanel {

    /**
     * Creates new form Egresos
     */
    public Egresos() {
        initComponents();
        cargarDatosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_egresos = new javax.swing.JTable();
        Registrar_Egreso_Button = new javax.swing.JButton();
        Registrar_Egreso_Fijo_Button = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        setBackground(new java.awt.Color(255, 255, 255));

        tabla_egresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_egreso", "tipo_egreso", "tipo_pago", "A_nombre", "fecha_egreso", "descripcion", "monto", "encargado_DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_egresos);

        Registrar_Egreso_Button.setText("Registrar Egreso");
        Registrar_Egreso_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_Egreso_ButtonActionPerformed(evt);
            }
        });

        Registrar_Egreso_Fijo_Button.setText("Registrar Egreso fijo");
        Registrar_Egreso_Fijo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_Egreso_Fijo_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Registrar_Egreso_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Registrar_Egreso_Fijo_Button)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar_Egreso_Button)
                    .addComponent(Registrar_Egreso_Fijo_Button))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarDatosEnTabla() {
        // Obtener la lista de egresos desde la base de datos
        List<egreso> listaEgresos = listarEgresos();
        
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tabla_egresos.getModel();
        
        // Limpiar la tabla antes de agregar nuevos datos
        model.setRowCount(0);

        // Agregar cada objeto egreso como una fila en la tabla
        for (egreso e : listaEgresos) {
            model.addRow(new Object[]{
                e.getId_egreso(),
                e.getTipo_egreso(),
                e.getTipo_pago(),
                e.getA_nombre(),
                e.getDia_egreso() + "/" + e.getMes_egreso() + "/" + e.getYear_egreso(),
                e.getDescripcion(),
                e.getMonto(),
                e.getEncargado_DNI()
            });
        }
    }
    
    private void Registrar_Egreso_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_Egreso_ButtonActionPerformed
        JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Agregar Egreso", true);

        // Crear una instancia de Registro_Egreso y asignarle el diálogo
        Registro_Egreso registroEgresoPanel = new Registro_Egreso();
        registroEgresoPanel.setDialog(dialog); // Establece el diálogo en el panel

        // Agregar el panel al diálogo y configurar el tamaño y posición
        dialog.add(registroEgresoPanel);
        dialog.setSize(300, 443); // Ajusta el tamaño según sea necesario
        dialog.setLocationRelativeTo(null); // Centra el diálogo en la pantalla
        dialog.setVisible(true);
        
        cargarDatosEnTabla();
    }//GEN-LAST:event_Registrar_Egreso_ButtonActionPerformed

    private void Registrar_Egreso_Fijo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_Egreso_Fijo_ButtonActionPerformed
        // Crear un diálogo para el formulario Registro_Egreso_Fijo
        JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Agregar Egreso Fijo", true);

        // Crear una instancia de Registro_Egreso_Fijo y asignarle el diálogo
        Registro_Egreso_Fijo registroEgresoFijoPanel = new Registro_Egreso_Fijo();
        registroEgresoFijoPanel.setDialog(dialog); // Establece el diálogo en el panel

        // Agregar el panel al diálogo y configurar el tamaño y posición
        dialog.add(registroEgresoFijoPanel);
        dialog.setSize(304, 300); // Ajusta el tamaño según sea necesario
        dialog.setLocationRelativeTo(null); // Centra el diálogo en la pantalla
        dialog.setVisible(true);

        // Opcional: Actualizar la tabla después de agregar un nuevo egreso fijo
        cargarDatosEnTabla();
    }//GEN-LAST:event_Registrar_Egreso_Fijo_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar_Egreso_Button;
    private javax.swing.JButton Registrar_Egreso_Fijo_Button;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_egresos;
    // End of variables declaration//GEN-END:variables
}