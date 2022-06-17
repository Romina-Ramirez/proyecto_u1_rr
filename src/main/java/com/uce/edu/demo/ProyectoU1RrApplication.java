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
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	private ChefPastelero chefP;

	@Autowired
	private ChefPastelero chefP1;

	@Autowired
	private AuxiliarPastelero auxiliarP;

	@Autowired
	private AuxiliarPastelero auxiliarP1;

	@Autowired
	private IPedidoService iPedidoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Ejemplo SINGLETON");
		this.chefP.setNombre("Romina");
		this.chefP.setApellido("Ramírez");
		this.chefP.setEdad(20);
		this.chefP.setEspecialidad("General");
		System.out.println(this.chefP);

		System.out.println("-------------------------");
		System.out.println(this.chefP1);

		System.out.println("-------------------------");
		this.chefP1.setNombre("Mina");
		this.chefP1.setEdad(45);
		System.out.println(this.chefP);

		System.out.println("--------------------------");
		System.out.println(this.chefP1);

		System.out.println("\nEjemplo PROTOTYPE");
		this.auxiliarP.setNombre("Maria");
		this.auxiliarP.setApellido("Gomez");
		this.auxiliarP.setEdad(25);
		this.auxiliarP.setEspecialidad("Pasteles");
		this.auxiliarP.setExperiencia(1);
		System.out.println(this.auxiliarP);

		System.out.println("---------------------------");
		System.out.println(this.auxiliarP1);

		System.out.println();
		Pedido pedido = new Pedido();
		pedido.setNumPedido("1234");
		pedido.setFechaPedido(LocalDateTime.now());
		pedido.setDescripcion("Pastel de chocolate");

		this.iPedidoService.ingresarPedido(pedido);

	}

}
