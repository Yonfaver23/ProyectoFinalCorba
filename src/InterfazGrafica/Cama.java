package InterfazGrafica;

import CorbaIdl.CamaTabla;
import CorbaIdl.SalaTabla;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Cama extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTablaCama;
    TableRowSorter trs;
   
    public Cama() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        
        //Llenamos todos los datos que se encuentran en la BD para el ComboBox
        ComboBoxSala sala = new ComboBoxSala();

        //Creamos un Objeto para obtener el modelo del comboBox
        DefaultComboBoxModel objSala = new DefaultComboBoxModel(sala.mostrarSala());
        cmbSala.setModel(objSala);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCama = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCama = new javax.swing.JTextField();
        cmbSala = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Sala");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        tblCama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCama.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCamaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCama);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("CAMA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, -1));

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
        jLabel5.setText("Codigo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtCodigoCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoCama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jPanel1.add(cmbSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Selecciona*", "Activo", "Inactivo" }));
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(txtCodigoCama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo de la cama");
            txtCodigoCama.requestFocus();
            return;
        }
        if (cmbSala.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una sala");
            cmbSala.requestFocus();
            return;
        }
        if(txtDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la descripcion");
            txtDescripcion.requestFocus();
            return;
        }
       
        if (cmbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }
      
         
        CamaTabla objCama = new CamaTabla(); 
        ComboBoxSala objSala = (ComboBoxSala) cmbSala.getSelectedItem();
         
        int codigoCama = Integer.parseInt(txtCodigoCama.getText());
        int codigoSala = objSala.getId();
        String descripcion = txtDescripcion.getText();
        
        char estado;

        //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
        if (cmbEstado.getSelectedIndex() == 1) {

            estado = 'A';
        }
        else {
            estado = 'I';
        }
         
        try {
            boolean resultado = objCama.insertarCama(codigoCama, descripcion, codigoSala , estado);
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

    private void txtCodigoCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCamaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblCama.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblCama.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        
        if(txtCodigoCama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo de la cama");
            txtCodigoCama.requestFocus();
            return;
        }
        if (cmbSala.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una sala");
            cmbSala.requestFocus();
            return;
        }
        if(txtDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la descripcion");
            txtDescripcion.requestFocus();
            return;
        }
       
        if (cmbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona el estado");
            cmbEstado.requestFocus();
            return;
        }
        
         

        try {
            
            CamaTabla objCama = new CamaTabla(); 

         
            int codigoCama = Integer.parseInt(txtCodigoCama.getText());

            String descripcion = txtDescripcion.getText();

            char estado;

            //Si el usuario selecciona el Item 1 (Activo) se añade una A de lo contrario I
            if (cmbEstado.getSelectedIndex() == 1) {

                estado = 'A';
            } else {
                estado = 'I';
            }
            
            
            String nombreSala =  (String) modeloTablaCama.getValueAt(tblCama.getSelectedRow(), 1);

            boolean resultado;

            if (cmbSala.getSelectedItem().equals(nombreSala)) {

               resultado = objCama.actualizarCama(codigoCama, descripcion, 0, estado);
            }
           else {
                ComboBoxSala objSala = (ComboBoxSala) cmbSala.getSelectedItem();
                int codigoSala = objSala.getId();
                resultado = objCama.actualizarCama(codigoCama, descripcion, codigoSala, estado);
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
        if(tblCama.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblCama.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        CamaTabla objCama = new CamaTabla();


        try {
            
            int codigoSala = Integer.parseInt(txtCodigoCama.getText());

            boolean resultado = objCama.eliminarCama(codigoSala);
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

    private void tblCamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCamaMouseClicked
       // Defino el modelo para el JTable
        modeloTablaCama = (DefaultTableModel) tblCama.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            
            
            
            ComboBoxSala objSala = new ComboBoxSala();
            
            DefaultComboBoxModel modeloSala = new DefaultComboBoxModel(objSala.mostrarSala());

            txtCodigoCama.setText(String.valueOf(modeloTablaCama.getValueAt(tblCama.getSelectedRow(), 0)));
            
            String hospital = (String) modeloTablaCama.getValueAt(tblCama.getSelectedRow(), 2);
            modeloSala.setSelectedItem(hospital);
            cmbSala.setModel(modeloSala);
            
            txtDescripcion.setText(String.valueOf(modeloTablaCama.getValueAt(tblCama.getSelectedRow(), 1)));
            
            String estado = (String)modeloTablaCama.getValueAt(tblCama.getSelectedRow(), 3);
            
            if(estado.equals("A")){
            cmbEstado.setSelectedItem("Activo");
            }
            else{
                cmbEstado.setSelectedItem("Inactivo");
            } 
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }                       
    }//GEN-LAST:event_tblCamaMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Sala mostrarVentana = new Sala();
        
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        this.dispose();
        Paciente mostrarVentana = new Paciente();
        
        mostrarVentana.setVisible(true);
        
    }//GEN-LAST:event_btnSiguienteActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTablaCama = (DefaultTableModel) tblCama.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTablaCama.addColumn("Codigo");
        modeloTablaCama.addColumn("Descripcion");
        modeloTablaCama.addColumn("Sala");
        modeloTablaCama.addColumn("estado");  
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        CamaTabla objCama = new CamaTabla();
        //Se Identifica el modelo de la JTable
        modeloTablaCama = (DefaultTableModel) tblCama.getModel();
        ResultSet resultado = objCama.cargarCama();
        try {
            Object datos[] = new Object[4];
            while(resultado.next()){
                for(int i = 0; i < 4; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaCama.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    private void limpiar() {
        
        modeloTablaCama = (DefaultTableModel) tblCama.getModel();
        
        ComboBoxSala objSala = new ComboBoxSala();
            
        DefaultComboBoxModel modeloSala = new DefaultComboBoxModel(objSala.mostrarSala());
        
        modeloSala.setSelectedItem("*Selecciona*");
        cmbSala.setModel(modeloSala);
        
        // Limpio las filas y las columnas de la tabla
        modeloTablaCama.setColumnCount(0);
        modeloTablaCama.setNumRows(0);
        
        txtCodigoCama.setText("");
        txtDescripcion.setText("");
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
            java.util.logging.Logger.getLogger(Cama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cama().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCama;
    private javax.swing.JTextField txtCodigoCama;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
