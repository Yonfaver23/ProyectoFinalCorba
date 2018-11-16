package InterfazGrafica;


import CorbaIdl.HospitalTabla;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Hospital extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTablaHospital;
    TableRowSorter trs;
   
    public Hospital() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSiguente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoHospital = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblHospital.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("HOSPITAL");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        btnSiguente.setText("Siguiente");
        btnSiguente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguenteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Estado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel1.add(txtCodigoHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        jLabel10.setText("Codigo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 51));
        jLabel12.setText("Direccion");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 51));
        jLabel13.setText("Telefono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Selecciona*", "Activo", "Inactivo" }));
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(txtCodigoHospital.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo hospital");
            txtCodigoHospital.requestFocus();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digite el nombre");
            txtNombre.requestFocus();
            return;
        }
         if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
          if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digite el telefono");
            txtTelefono.requestFocus();
            return;
        }
         if(cmbEstado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }
        
        
       
         
         
        int codigoHospital = Integer.parseInt(txtCodigoHospital.getText());
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
         
        String estado;

        //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
        if (cmbEstado.getSelectedIndex() == 1) {

            estado = "A";
        }
        else {
            estado = "I";
        }
         
        HospitalTabla objHospital = new HospitalTabla(); 
         

        try {
            boolean resultado = objHospital.insertarHospital(codigoHospital,nombre, direccion , telefono, estado);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro.");
                //Utilizamos el objeto para limpiar todos los campos.
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado. ¡Por favor, vuelva a intentarlo!");
        }
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Mostramos la información que se encuentra en la BD al Usuario
        limpiar();
        getColumn();
        cargarTabla(); 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblHospital.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblHospital.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        

        if(txtCodigoHospital.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo hospital");
            txtCodigoHospital.requestFocus();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digite el nombre");
            txtNombre.requestFocus();
            return;
        }
         if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
          if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digite el telefono");
            txtTelefono.requestFocus();
            return;
        }
         if(cmbEstado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }

        try {
            
            HospitalTabla objHospital = new HospitalTabla(); 
         
            int codigoHospital = Integer.parseInt(txtCodigoHospital.getText());
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();
            
            String estado;

            //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
            if (cmbEstado.getSelectedIndex() == 1) {

                estado = "A";
            }
            else {
                estado = "I";
            }
            
            
            boolean resultado = objHospital.actualizarHospital(codigoHospital, nombre, direccion, telefono, estado);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
                //Se realiza la limpieza al JTable
                limpiar();
                //Mostramos las columnas (La informacion que identifica a cada tabla en la BD)
                getColumn();
                //Actualizamos la tabla (Buscamos todos los registros)
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema , por favor intentalo de nuevo.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalMouseClicked
        // Defino el modelo para el JTable
        modeloTablaHospital = (DefaultTableModel) tblHospital.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            txtCodigoHospital.setText(String.valueOf(modeloTablaHospital.getValueAt(tblHospital.getSelectedRow(), 0)));
            txtNombre.setText(String.valueOf(modeloTablaHospital.getValueAt(tblHospital.getSelectedRow(), 1)));
            txtDireccion.setText(String.valueOf(modeloTablaHospital.getValueAt(tblHospital.getSelectedRow(), 2)));
            txtTelefono.setText(String.valueOf(modeloTablaHospital.getValueAt(tblHospital.getSelectedRow(), 3)));
            String estado = (String)modeloTablaHospital.getValueAt(tblHospital.getSelectedRow(), 4);
            
            if(estado.equals("A")){
            cmbEstado.setSelectedItem("Activo");
            }
            else{
                cmbEstado.setSelectedItem("Inactivo");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }   
    }//GEN-LAST:event_tblHospitalMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblHospital.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblHospital.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        HospitalTabla objHospital = new HospitalTabla();


        try {
            
            int codigoHospital = Integer.parseInt(txtCodigoHospital.getText());

            boolean resultado = objHospital.eliminarHospital(codigoHospital);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Se Eliminó el registro correctamente.");
                limpiar();
                getColumn();
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar.");
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado ¡Por favor, vuelva a intentarlo!" + e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSiguenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguenteActionPerformed
        this.dispose();
        Medico mostrarVentana = new Medico();
        
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnSiguenteActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTablaHospital = (DefaultTableModel) tblHospital.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTablaHospital.addColumn("Codigo");
        modeloTablaHospital.addColumn("Nombre");
        modeloTablaHospital.addColumn("Direccion");
        modeloTablaHospital.addColumn("Telefono");  
        modeloTablaHospital.addColumn("Estado"); 
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        HospitalTabla objHospital = new HospitalTabla();
        //Se Identifica el modelo de la JTable
        modeloTablaHospital = (DefaultTableModel) tblHospital.getModel();
        ResultSet resultado = objHospital.cargarHospital();
        try {
            Object datos[] = new Object[5];
            while(resultado.next()){
                for(int i = 0; i < 5; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaHospital.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void limpiar() {
        
        modeloTablaHospital = (DefaultTableModel) tblHospital.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modeloTablaHospital.setColumnCount(0);
        modeloTablaHospital.setNumRows(0);
        
        txtCodigoHospital.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cmbEstado.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguente;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtCodigoHospital;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
