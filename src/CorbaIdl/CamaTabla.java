
package CorbaIdl;

import ConexionBaseDato.ConexionBaseDato;
import CorbaIdl.Camas.CamaPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CamaTabla extends CamaPOA{
    ConexionBaseDato objConect = new ConexionBaseDato(); 
    
    @Override
    public boolean insertarCama(int codigoCama, String descripcion, int codigoSala, char estado) {
        boolean resultado = false;
        try {
            String sql = "insert into cama (cam_codigo,cam_descripcion,cam_sal_codigo,cam_estado) values ('"+codigoCama+"','"+descripcion+"','"+codigoSala+"','"+estado+"')";
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
    public boolean actualizarCama(int codigoCama, String descripcion, int codigoSala, char estado) {
        boolean resultado = false;
        try {
            
            String sql;
            
            if (codigoSala == 0) {
                sql = "UPDATE cama SET cam_descripcion = '"+descripcion+"', cam_estado = '"+estado+"' where cam_codigo = '"+codigoCama+"' ";
            }
            else {
                sql = "UPDATE cama SET cam_descripcion = '"+descripcion+"', cam_sal_codigo = '"+codigoSala+"', cam_estado = '"+estado+"' where cam_codigo = '"+codigoCama+"' ";
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
    public boolean eliminarCama(int codigoCama) {
        boolean resultado = false;
        try {
            String sql = "Delete from cama where cam_codigo = " +codigoCama;
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
    public String consultarCama(int codigoCama) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where cam_codigo= " + codigoCama;
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
    
    public ResultSet cargarCama(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT cam_codigo,cam_descripcion,sal_nombre,cam_estado FROM cama, sala WHERE cam_sal_codigo = sal_codigo";
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
