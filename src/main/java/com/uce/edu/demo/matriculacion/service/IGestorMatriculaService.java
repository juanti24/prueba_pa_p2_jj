package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

public interface IGestorMatriculaService {
	
	public void matricularVehiculo(String cedula, String placa);

	BigDecimal costoVehiculo( BigDecimal precio);
}
