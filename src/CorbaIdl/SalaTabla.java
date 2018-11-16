package CorbaIdl;
import ConexionBaseDato.ConexionBaseDato;
import CorbaIdl.Salas.SalaPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SalaTabla extends SalaPOA{
    
    ConexionBaseDato objConect = new ConexionBaseDato(); 
    
    @Override
    public boolean insertarSala(int codigoSala, int codigoHospital, String nombre, char estado) {
        boolean resultado = false;
        try {
            String sql = "insert into sala (sal_codigo,sal_hos_codigo,sal_nombre,sal_estado) values ('"+codigoSala+"','"+codigoHospital+"','"+nombre+"','"+estado+"')";
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
    public boolean actualizarSala(int codigoSala, int codigoHospital, String nombre, char estado) {
        boolean resultado = false;
        try {
            
            String sql;
            
            if (codigoHospital == 0) {
                sql = "UPDATE sala SET  sal_nombre = '"+nombre+"', sal_estado = '"+estado+"' where sal_codigo = '"+codigoSala+"' ";
            }
            else {
                sql = "UPDATE sala SET sal_hos_codigo = '"+codigoHospital+"', sal_nombre = '"+nombre+"', sal_estado = '"+estado+"' where sal_codigo = '"+codigoSala+"' ";
            }
            
            
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
    public boolean eliminarSala(int codigoSala) {
        boolean resultado = false;
        try {
            String sql = "Delete from sala where sal_codigo = " +codigoSala;
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
    public String consultarSala(int codigoSala) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where sal_codigo = " + codigoSala;
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
    
    public ResultSet cargarSala(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT sal_codigo , hos_nombre, sal_nombre , sal_estado FROM sala, hospital WHERE sal_hos_codigo = hos_codigo";
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
