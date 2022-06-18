package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.pasteleria.modelo.AuxiliarPastelero;
import com.uce.edu.demo.pasteleria.modelo.ChefPastelero;
import com.uce.edu.demo.pasteleria.modelo.Pedido;
import com.uce.edu.demo.pasteleria.service.IPedidoService;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral general;

	@Autowired
	private ProfesorGeneral general1;

	@Autowired
	private ProfesorMateria materia;

	@Autowired
	private ProfesorMateria materia1;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Ejemplo SINGLETON");
		this.general.setNombre("Romina");
		this.general.setApellido("Ramírez");
		System.out.println(this.general);

		System.out.println(" ------------------ ");
		System.out.println(this.general1);

		System.out.println(" ------------------ ");
		this.general1.setNombre("Pepito");
		System.out.println(this.general);

		System.out.println(" ------------------ ");
		System.out.println(this.general1);

		System.out.println("\nEjemplo PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");
		System.out.println(this.materia);

		System.out.println(" ------------------ ");
		System.out.println(this.materia1);

		System.out.println();
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1123");

		this.iMatriculaService.ingresarMatricula(matricula1);

	}

}
