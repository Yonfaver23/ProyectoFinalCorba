package CorbaIdl.Hospitales;


/**
* Hospitales/HospitalOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hospital.idl
* jueves 15 de noviembre de 2018 21H59' COT
*/

public interface HospitalOperations 
{
  boolean insertarHospital (int codigo, String nombre, String direccion, String telefono, String estado);
  boolean actualizarHospital (int codigo, String nombre, String direccion, String telefono, String estado);
  boolean eliminarHospital (int codigo);
  String consultarHospital (int codigo);
  void shutdown ();
} // interface HospitalOperations
