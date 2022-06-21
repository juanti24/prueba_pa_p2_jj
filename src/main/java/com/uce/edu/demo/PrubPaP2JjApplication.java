package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IGestorMatriculaService;

@SpringBootApplication
public class PrubPaP2JjApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("gestorMatriculaLivianoServiceImpl")
	private IGestorMatriculaService gestorMatriculaLivianoService;

	@Autowired
	@Qualifier("gestorMatriculaPesadoServiceImpl")
	private IGestorMatriculaService gestorMatriculaPesadoService;

	public static void main(String[] args) {
		SpringApplication.run(PrubPaP2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Propietario propietario = new Propietario();
		propietario.setNombre("Juan ");
		propietario.setApellido("Jumbo");
		propietario.setCedula("1723920979");
		propietario.setFechaNacimiento(LocalDateTime.of(97, 11, 5, 0, 0, 0));

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("forest");
		vehiculo.setPrecio(new BigDecimal(20));
		vehiculo.setPlaca("546-sdf");
		vehiculo.setTipo("Pesado");

		System.out.println(this.gestorMatriculaLivianoService.costoVehiculo(new BigDecimal(20)));

		this.gestorMatriculaPesadoService.matricularVehiculo("1723920979", "546-sdf");

	}

}
