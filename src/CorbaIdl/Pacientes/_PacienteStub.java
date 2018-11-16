package CorbaIdl.Pacientes;


/**
* Pacientes/_PacienteStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Paciente.idl
* viernes 16 de noviembre de 2018 03H01' COT
*/

public class _PacienteStub extends org.omg.CORBA.portable.ObjectImpl implements CorbaIdl.Pacientes.Paciente
{

  public boolean insertarPaciente (int cedulaPaciente, int codigoCama, String nombre, String direccion, char estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarPaciente", true);
                $out.write_long (cedulaPaciente);
                $out.write_long (codigoCama);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_wchar (estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarPaciente (cedulaPaciente, codigoCama, nombre, direccion, estado        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarPaciente

  public boolean actualizarPaciente (int cedulaPaciente, int codigoCama, String nombre, String direccion, char estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarPaciente", true);
                $out.write_long (cedulaPaciente);
                $out.write_long (codigoCama);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_wchar (estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarPaciente (cedulaPaciente, codigoCama, nombre, direccion, estado        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarPaciente

  public boolean eliminarPaciente (int cedulaPaciente)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarPaciente", true);
                $out.write_long (cedulaPaciente);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarPaciente (cedulaPaciente        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarPaciente

  public String consultarPaciente (int cedulaPaciente)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarPaciente", true);
                $out.write_long (cedulaPaciente);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarPaciente (cedulaPaciente        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarPaciente

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Pacientes/Paciente:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PacienteStub
