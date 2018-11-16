package InterfazGrafica;

import ConexionBaseDato.ConexionBaseDato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ComboBoxCama {
  
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString()
    {
        return this.nombre;
    }
    
    public ResultSet rs = null;
    
    ConexionBaseDato conexion = new ConexionBaseDato();
    
    //Sirve para agregar los valores al ComboBox
    //Permite agregar el id y lo tome como su indice y su nombre como valor visible al Usuario
    public Vector<ComboBoxCama> mostrarCama(){
       
        //Realizamos la conexion con la base de datos
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexx = (Connection) conexion.conectar();
        
        Vector<ComboBoxCama> informacion = new Vector<ComboBoxCama>();
        ComboBoxCama dat = null;
        
        try {
            String sql = "SELECT * FROM cama";
            ps = conexx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //Creamos una instanciacion de la misma clase
            //Me permite que el objeto dat pueda acceder a todos los atributos, metodos
            dat = new ComboBoxCama();
            //Le enviamos el 0 porque el ComboBox si index es el 0 inicialmente
            dat.setId(0);
            dat.setNombre("*Selecciona*");
            //Agregamos el id, nombre al vector
            informacion.add(dat);
            
            
            while (rs.next()) {                
                
                dat = new ComboBoxCama();
                dat.setId(rs.getInt("cam_codigo"));
                dat.setNombre(rs.getString("cam_codigo"));
                informacion.add(dat);
                
            }
            
            //Cerramos la conexion con la base de datos
            rs.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ha ocurrido en Error" + ex.getMessage());
        }
        
        return informacion;
        
    }
    
    
    
    
}
