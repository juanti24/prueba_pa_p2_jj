package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MatriculaRespositoryImpl implements IMatriculaRespository {

	
	@Override
	public void generarMatricula() {
		System.out.println("Se ha generado una matricula " );
		
	}

}
