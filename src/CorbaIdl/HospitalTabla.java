package CorbaIdl;
import ConexionBaseDato.ConexionBaseDato;
import CorbaIdl.Hospitales.HospitalPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class HospitalTabla extends HospitalPOA{

    ConexionBaseDato objConect = new ConexionBaseDato(); 
     
    @Override
    public boolean insertarHospital(int codigo, String nombre, String direccion, String telefono, String estado) {
        boolean resultado = false;
        try {
            String sql = "insert into hospital (hos_codigo,hos_nombre,hos_direccion,hos_telefono,hos_estado) values ('"+codigo+"','"+nombre+"','"+direccion+"','"+telefono+"','"+estado+"')";
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones
            objConect.conex.close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio un problema. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado;
    }

    @Override
    public boolean actualizarHospital(int codigo, String nombre, String direccion, String telefono, String estado) {
        boolean resultado = false;
        try {
            String sql = "UPDATE hospital SET hos_nombre = '"+nombre+"', hos_direccion = '"+direccion+"', hos_telefono = '"+telefono+"', hos_estado = '"+estado+"' where hos_codigo = '"+codigo+"' ";
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }        
        return resultado;
    }

    @Override
    public boolean eliminarHospital(int codigo) {
        boolean resultado = false;
        try {
            String sql = "Delete from hospital where hos_codigo = " +codigo;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
    }

    @Override
    public String consultarHospital(int codigo) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where identificacion = " + codigo;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            
            while (rs.next()) {                
                resultado += rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public ResultSet cargarHospital(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT hos_codigo, hos_nombre, hos_direccion, hos_telefono, hos_estado FROM hospital";
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            resultado = st.executeQuery(sqlConsultar);
           
            //Cerrar las conexiones.
            //st.close();
            //objConect.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
       return resultado;
    }
    
}
