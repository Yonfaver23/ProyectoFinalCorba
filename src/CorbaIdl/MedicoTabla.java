package CorbaIdl;
import ConexionBaseDato.ConexionBaseDato;
import CorbaIdl.Medicos.MedicoPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MedicoTabla extends MedicoPOA{
 ConexionBaseDato objConect = new ConexionBaseDato(); 
    @Override
    public boolean insertarMedico(int cedulaMedico, int codigoHospital, String nombre, String especialidad, char estado) {
        boolean resultado = false;
        try {
            String sql = "insert into medico (med_cedula,med_hos_codigo,med_nombre,med_especialidad,med_estado) values ('"+cedulaMedico+"','"+codigoHospital+"','"+nombre+"','"+especialidad+"','"+estado+"')";
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
    public boolean actualizarMedico(int cedulaMedico, int codigoHospital, String nombre, String especialidad, char estado) {
        boolean resultado = false;
        try {
            String sql;
            
            if (codigoHospital == 0 ) {
                sql = "UPDATE medico SET  med_nombre = '"+nombre+"', med_especialidad = '"+especialidad+"', med_estado = '"+estado+"' where med_cedula = '"+cedulaMedico+"'";
            }
            else {
                sql = "UPDATE medico SET med_hos_codigo = '"+codigoHospital+"', med_nombre = '"+nombre+"', med_especialidad = '"+especialidad+"', med_estado = '"+estado+"' where med_cedula = '"+cedulaMedico+"' ";
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
    public boolean eliminarMedico(int cedulaMedico) {
        boolean resultado = false;
        try {
            String sql = "Delete from medico where med_cedula = " +cedulaMedico;
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
    public String consultarMedico(int cedulaMedico) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where med_cedula = " + cedulaMedico;
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
    
    public ResultSet cargarMedico(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT med_cedula, hos_nombre ,med_nombre ,med_especialidad, med_estado FROM medico, hospital WHERE med_hos_codigo = hos_codigo";
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
