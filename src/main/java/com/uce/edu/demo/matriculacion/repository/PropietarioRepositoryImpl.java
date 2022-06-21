package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario p) {
		p.setNombre("Juan");
		p.setApellido("Jumbo");
		p.setCedula("17239290979");
		p.setFechaNacimiento(LocalDateTime.now());
		System.out.println("Se ha creado un propietario " + p);
		
	}

	@Override
	public void eliminar(String cedula) {
		System.out.println("Se ha eliminado un propietario " + cedula);
		
	}

}
