
package CorbaIdl;

import ConexionBaseDato.ConexionBaseDato;
import CorbaIdl.Pacientes.PacientePOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PacienteTabla extends PacientePOA{

    ConexionBaseDato objConect = new ConexionBaseDato(); 
    
    @Override
    public boolean insertarPaciente(int cedulaPaciente, int codigoCama, String nombre, String direccion, char estado) {
        boolean resultado = false;
        try {
            String sql = "insert into paciente (pac_cedula,pac_cam_codigo,pac_nombre,pac_direccion,pac_estado) values ('"+cedulaPaciente+"','"+codigoCama+"','"+nombre+"','"+direccion+"','"+estado+"')";
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
    public boolean actualizarPaciente(int cedulaPaciente, int codigoCama, String nombre, String direccion, char estado) {
        boolean resultado = false;
        try {
            
            String sql;
                    
            if (codigoCama == 0) {
                sql = "UPDATE paciente SET  pac_nombre = '"+nombre+"', pac_direccion = '"+direccion+"', pac_estado = '"+estado+"' where pac_cedula = '"+cedulaPaciente+"' ";
            }
            else {
                sql = "UPDATE paciente SET pac_codigo = '"+codigoCama+"', pac_nombre = '"+nombre+"', pac_direccion = '"+direccion+"', pac_estado = '"+estado+"' where pac_cedula = '"+cedulaPaciente+"' ";
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
    public boolean eliminarPaciente(int cedulaPaciente) {
        boolean resultado = false;
        try {
            String sql = "Delete from paciente where pac_cedula = " +cedulaPaciente;
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
    public String consultarPaciente(int cedulaPaciente) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where pac_cedula = " + cedulaPaciente;
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
    
    
    public ResultSet cargarPaciente(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT  pac_cedula, pac_cam_codigo , pac_nombre, pac_direccion, pac_estado FROM paciente, cama WHERE pac_cam_codigo = cam_codigo";
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
