package CorbaIdl.Salas;


/**
* Salas/SalaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Sala.idl
* viernes 16 de noviembre de 2018 00H19' COT
*/

public interface SalaOperations 
{
  boolean insertarSala (int codigoSala, int codigoHospital, String nombre, char estado);
  boolean actualizarSala (int codigoSala, int codigoHospital, String nombre, char estado);
  boolean eliminarSala (int codigoSala);
  String consultarSala (int codigoSala);
  void shutdown ();
} // interface SalaOperations
