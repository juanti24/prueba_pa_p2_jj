package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.repository.IMatriculaRespository;

@Service
@Qualifier("gestorMatriculaPesadoServiceImpl")
public class GestorMatriculaPesadoServiceImpl implements IGestorMatriculaService {
	
	@Autowired
	private IMatriculaRespository matriculaRespository;

	@Override
	public void matricularVehiculo(String cedula, String placa) {
		this.matriculaRespository.generarMatricula();
	}

	@Override
	public BigDecimal costoVehiculo(BigDecimal precio) {
		
		
		precio = precio.multiply(new BigDecimal("0.15"));

		if (precio.compareTo(new BigDecimal(2000)) == 1) {

			precio.multiply(new BigDecimal(0.7));

		}

		return precio;
	}

}
