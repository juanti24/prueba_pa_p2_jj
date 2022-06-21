package com.uce.edu.demo.matriculacion.repository;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public class VehiculoRespositoryLivianoImpl implements IVehiculoRespository {

	@Override
	public void insertar(Vehiculo v1) {

		v1.setMarca("Toyota");
		v1.setPlaca("ABC 1201");
		v1.setPrecio(new BigDecimal(20));
		v1.setTipo("Liviano");

		System.out.println("Se ha creado un vehiculo " + v1);

	}

	@Override
	public Vehiculo buscar(String placa) {
		System.out.println("Se ha buscado un vehiculo " + placa);
		Vehiculo v2 = new Vehiculo();
		v2.setMarca("Toyota");
		v2.setPlaca(placa);
		v2.setPrecio(new BigDecimal(20));
		v2.setTipo("Liviano");

		return v2;
	}

	@Override
	public void consultar(Vehiculo v3) {

		v3.setMarca("Toyota");
		v3.setPlaca("ABC 1201");
		v3.setPrecio(new BigDecimal(20));
		v3.setTipo("Livianoo");

		System.out.println("Se ha consultado un vehiculo " + v3);

	}

	@Override
	public void eliminar(String placa) {

		Vehiculo v4 = new Vehiculo();
		v4.setMarca("Toyota");
		v4.setPlaca(placa);
		v4.setPrecio(new BigDecimal(20));
		v4.setTipo("Pesado");

		System.out.println("Se ha eliminado un vehiculo " + placa);

	}

}