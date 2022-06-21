package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRespository {

	public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void consultar(Vehiculo v);

	public void eliminar(String placa);

	
	
}
