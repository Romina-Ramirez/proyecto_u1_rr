package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e = new Estudiante();
		e.setNombre("Romina");
		e.setApellido("Ramírez");
		e.setCedula("1723069801");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("1725435689");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 métodos restantes
		e.setCedula("1723069819");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Ramírez");
		
		this.estudianteService.borrarEstudiante("1725435689");
	}

}
