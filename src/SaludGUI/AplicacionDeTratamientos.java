/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaludGUI;

/**
 *
 * @author jonhe
 */
public class AplicacionDeTratamientos extends javax.swing.JPanel {

    /**
     * Creates new form Tratamiento
     */
    public AplicacionDeTratamientos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker();
        timePicker3 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel47 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel48 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        calendarPanel1 = new com.github.lgooddatepicker.components.CalendarPanel();
        calendarPanel2 = new com.github.lgooddatepicker.components.CalendarPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1100, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1100, 850));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro de aplicación de tratamiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 40, -1, -1));

        jLabel2.setText("Arete de ganado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 87, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 84, 176, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 122, 176, 173));

        jLabel3.setText("Tipo de tratamiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 316, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conocido", "Veterinario" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 313, 176, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 475, 176, -1));

        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 478, -1, -1));

        jLabel6.setText("Fecha de registro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 516, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 513, 176, -1));

        jButton1.setText("Registrar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 612, -1, -1));

        jLabel7.setText("Enfermedad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 351, -1, -1));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Enfermedad 1", "Enfermedad 2", "Enfermedad 3", "Enfermedad 4", "Enfermedad 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setEnabled(false);
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 351, 176, 93));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 551, 176, -1));

        jLabel16.setText("Hora");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 554, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Registro de aplicación de tratamiento", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Arete de ganado");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 197, -1, -1));

        jLabel9.setText("Fecha de registro");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 61, -1, -1));

        jLabel10.setText("Actualización de aplicación de tratamiento");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 27, -1, -1));

        jLabel11.setText("Descripcion");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 587, -1, -1));
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 584, 176, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conocido", "Veterinario" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 423, 176, -1));

        jLabel13.setText("Tipo de tratamiento");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 426, -1, -1));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Enfermedad 1", "Enfermedad 2", "Enfermedad 3", "Enfermedad 4", "Enfermedad 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.setEnabled(false);
        jScrollPane3.setViewportView(jList3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 461, 176, 93));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 232, 176, 173));

        jLabel14.setText("Enfermedad");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 461, -1, -1));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 194, 176, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 622, -1, -1));

        jLabel15.setText("Hora");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, -1, -1));

        jButton6.setText("Buscar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));
        jPanel4.add(datePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        jPanel4.add(timePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 166, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel47.setText("jLabel12");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 910));

        jTabbedPane1.addTab("Actualización de aplicación de tratamiento", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Hora");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 102, -1, -1));

        jLabel18.setText("Fecha de registro");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 66, -1, -1));

        jButton4.setText("Buscar");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 63, -1, -1));

        jLabel19.setText("Consulta individual de aplicación de tratamientos");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 31, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 495, 166, -1));

        jLabel20.setText("Descripcion");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 498, -1, -1));

        jLabel21.setText("Enfermedad");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 460, -1, -1));

        jLabel22.setText("Arete de ganado");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 228, -1, -1));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganado 1", "Ganado 2", "Ganado 3", "Ganado 4", "Ganado 5", "Ganado 6", "Ganado 7", "Ganado 8", "Ganado 9", "Ganado 10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList5.setEnabled(false);
        jScrollPane5.setViewportView(jList5);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 228, 166, 173));

        jLabel23.setText("Tipo de tratamiento");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 422, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conocido", "Veterinario" }));
        jComboBox3.setEnabled(false);
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 419, 166, -1));

        jLabel25.setText("Empleado");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 536, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 533, 166, -1));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 457, 166, -1));
        jPanel2.add(timePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 98, 166, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel48.setText("jLabel12");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 900));

        jTabbedPane1.addTab("Consulta individual", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Consulta por intervalos de fecha de aplicación de tratamiento");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 11, -1, -1));

        jLabel27.setText("Fecha inicio");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 43, -1, -1));

        jLabel28.setText("Fecha fin");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 43, -1, -1));
        jPanel3.add(calendarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 75, -1, 201));
        jPanel3.add(calendarPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 75, -1, 201));

        jButton5.setText("Consultar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 291, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Tipo de tratamiento", "Enfermedad", "Descripción", "Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable1);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 325, 640, 337));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estampado.jpg"))); // NOI18N
        jLabel49.setText("jLabel12");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 910));

        jTabbedPane1.addTab("Consulta por intervalos de fecha", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel1;
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel2;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private com.github.lgooddatepicker.components.TimePicker timePicker3;
    // End of variables declaration//GEN-END:variables
}
