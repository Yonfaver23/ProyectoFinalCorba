package InterfazGrafica;

import CorbaIdl.CamaTabla;
import CorbaIdl.PacienteTabla;
import CorbaIdl.SalaTabla;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Paciente extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTablaPaciente;
    TableRowSorter trs;
   
    public Paciente() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        
        //Llenamos todos los datos que se encuentran en la BD para el ComboBox
        ComboBoxCama cama = new ComboBoxCama();

        //Creamos un Objeto para obtener el modelo del comboBox
        DefaultComboBoxModel objCama = new DefaultComboBoxModel(cama.mostrarCama());
        cmbCama.setModel(objCama);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaPaciente = new javax.swing.JTextField();
        cmbCama = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Cama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        tblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPaciente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPaciente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("PACIENTE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 130, -1));

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

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Cedula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, -1));

        txtCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jPanel1.add(cmbCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Selecciona*", "Activo", "Inactivo" }));
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(txtCedulaPaciente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el cedula del paciente");
            txtCedulaPaciente.requestFocus();
            return;
        }
        if (cmbCama.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una cama");
            cmbCama.requestFocus();
            return;
        }
         if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la el nombre");
            txtNombre.requestFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
       
        if (cmbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }
      
         
        PacienteTabla objPaciente = new PacienteTabla(); 
        ComboBoxCama objCama = (ComboBoxCama) cmbCama.getSelectedItem();
         
        int cedulaPaciente = Integer.parseInt(txtCedulaPaciente.getText());
        int codigoCama = objCama.getId();
        String nombre= txtNombre.getText();
        String direccion= txtDireccion.getText();
        
        char estado;

        //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
        if (cmbEstado.getSelectedIndex() == 1) {

            estado = 'A';
        }
        else {
            estado = 'I';
        }
         
        try {
            boolean resultado = objPaciente.insertarPaciente(cedulaPaciente, codigoCama, nombre , direccion, estado);
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

    private void txtCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaPacienteActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblPaciente.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblPaciente.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        
       
        if(txtCedulaPaciente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el cedula del paciente");
            txtCedulaPaciente.requestFocus();
            return;
        }
        if (cmbCama.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una cama");
            cmbCama.requestFocus();
            return;
        }
         if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la el nombre");
            txtNombre.requestFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
       
        if (cmbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }
        
        try {
            
            PacienteTabla objPaciente = new PacienteTabla(); 

         
            int cedulaPaciente = Integer.parseInt(txtCedulaPaciente.getText());

            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();

            char estado;

            //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
            if (cmbEstado.getSelectedIndex() == 1) {

                estado = 'A';
            } else {
                estado = 'I';
            }
            
            String nombreSala =  (String) modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 1);

            boolean resultado;

            if (cmbCama.getSelectedItem().equals(nombreSala)) {

               resultado = objPaciente.actualizarPaciente(cedulaPaciente, 0, nombre,direccion, estado);
            }
           else {
                ComboBoxCama objCama = (ComboBoxCama) cmbCama.getSelectedItem();
                int codigoCama = objCama.getId();
                
                resultado = objPaciente.actualizarPaciente(cedulaPaciente, codigoCama, nombre,direccion, estado);
            }
            
            
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblPaciente.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblPaciente.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        PacienteTabla objPaciente = new PacienteTabla();


        try {
            
            int cedulaPaciente = Integer.parseInt(txtCedulaPaciente.getText());

            boolean resultado = objPaciente.eliminarPaciente(cedulaPaciente);
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacienteMouseClicked
       // Defino el modelo para el JTable
        modeloTablaPaciente = (DefaultTableModel) tblPaciente.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            
            
            
            ComboBoxCama objCama = new ComboBoxCama();
            
            DefaultComboBoxModel modeloCama = new DefaultComboBoxModel(objCama.mostrarCama());

            txtCedulaPaciente.setText(String.valueOf(modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 0)));
            
            String cama = String.valueOf(modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 1));
            modeloCama.setSelectedItem(cama);
            cmbCama.setModel(modeloCama);
            
            txtNombre.setText(String.valueOf(modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 2)));
            
            txtDireccion.setText(String.valueOf(modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 3)));
            
            String estado = (String)modeloTablaPaciente.getValueAt(tblPaciente.getSelectedRow(), 4);
            
            if(estado.equals("A")){
                cmbEstado.setSelectedItem("Activo");
            }
            else{
                cmbEstado.setSelectedItem("Inactivo");
            } 
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila" + e.getMessage());
        }                       
    }//GEN-LAST:event_tblPacienteMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Cama mostrarVentana = new Cama();
        
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        this.dispose();
        Hospital mostrarVentana = new Hospital();
        
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTablaPaciente= (DefaultTableModel) tblPaciente.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTablaPaciente.addColumn("Cedula");
        modeloTablaPaciente.addColumn("Cama");
        modeloTablaPaciente.addColumn("Nombre");
        modeloTablaPaciente.addColumn("Direccion");  
        modeloTablaPaciente.addColumn("Estado"); 
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        PacienteTabla objPaciente = new PacienteTabla();
        //Se Identifica el modelo de la JTable
        modeloTablaPaciente = (DefaultTableModel) tblPaciente.getModel();
        ResultSet resultado = objPaciente.cargarPaciente();
        try {
            Object datos[] = new Object[5];
            while(resultado.next()){
                for(int i = 0; i < 5; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaPaciente.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    private void limpiar() {
        
        modeloTablaPaciente = (DefaultTableModel) tblPaciente.getModel();
        
        ComboBoxCama objCama = new ComboBoxCama();
            
        DefaultComboBoxModel modeloSala = new DefaultComboBoxModel(objCama.mostrarCama());
        
        modeloSala.setSelectedItem("*Selecciona*");
        cmbCama.setModel(modeloSala);
        
        // Limpio las filas y las columnas de la tabla
        modeloTablaPaciente.setColumnCount(0);
        modeloTablaPaciente.setNumRows(0);
        
        txtCedulaPaciente.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbCama;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTextField txtCedulaPaciente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
