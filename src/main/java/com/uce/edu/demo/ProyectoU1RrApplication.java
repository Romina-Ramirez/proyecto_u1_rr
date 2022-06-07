package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Estudiantes
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

		
		System.out.println("Materias: ");
		// Ingresar materias
		Materia materia1 = new Materia();
		materia1.setNombre("Programación Avanzada II");
		materia1.setSemestre("Quinto");
		this.materiaService.ingresarMateria(materia1);

		Materia materia2 = new Materia();
		materia2.setNombre("Programación Avanzada I");
		materia2.setSemestre("Quinto");
		this.materiaService.ingresarMateria(materia2);
		
		Materia materia3 = new Materia();
		materia3.setNombre("Inteligencia Artificial");
		materia3.setSemestre("Sexto");
		this.materiaService.ingresarMateria(materia3);

		// Actualizar materia
		materia1.setSemestre("Sexto");
		this.materiaService.actualizarMateria(materia1);

		// Buscar materia por nombre
		this.materiaService.buscarPorNombre("Programación Avanzada I");

		// Eliminar materia
		this.materiaService.borrarMateria("Programación Avanzada I");

		List<Materia> materiasSexto = new ArrayList<Materia>();
		materiasSexto.add(materia1);
		materiasSexto.add(materia2);
		materiasSexto.add(materia3);
		
		
		System.out.println("Matricula: ");
		// Ingresar matricula
		Matricula matricula1 = new Matricula();
		matricula1.setNumero("82618");
		matricula1.setEstudiante(e);
		matricula1.setMateria(materiasSexto);
		this.matriculaService.ingresarMatricula(matricula1);
		
		// Actualizar matricula
		materiasSexto.remove(materia2);
		matricula1.setMateria(materiasSexto);
		this.matriculaService.actualizarMatricula(matricula1);
		
		//Buscar matricula por numero
		this.matriculaService.buscarPorNumero("82618");
		
		//Borrar matricula
		this.matriculaService.borrarMatricula("82618");
	}

}
