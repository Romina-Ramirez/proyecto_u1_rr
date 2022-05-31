package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.pasteleria.Pedido1;
import com.uce.edu.demo.pasteleria.Pedido2;
import com.uce.edu.demo.pasteleria.Pedido3;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

//	@Autowired
//	private CitaMedica cita;
//	private CitaMedica2 cita;
	
	
	//Tarea 5
	//1) DI por atributo
	@Autowired
	private Pedido1 pedido1;
	
	//2) DI por constructor
	@Autowired
	private Pedido2 pedido2;
	
	//3) DI por metodos Set
	@Autowired
	private Pedido3 pedido3;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework.");
		
//		String respuesta = this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta);
		
		
		//Tarea 5
		
		String respuestaPasteleria1 = this.pedido1.realizarPedido(LocalDateTime.now(), "Galletas de chispas de chocolate", "Luis", "Galletas", "Romina", "Ramírez", "Piñas");
		System.out.println(respuestaPasteleria1);
		
		String respuestaPasteleria2 = this.pedido2.realizarPedido(LocalDateTime.now(), "Pastel Red Velvet", "Mina", "Pasteles", "Dahyun", "Kim", "Piñas");
		System.out.println(respuestaPasteleria2);
		
		String respuestaPasteleria3 = this.pedido3.realizarPedido(LocalDateTime.now(), "Croissant", "Sana", "Pan", "Cristian", "Pardo", "Machala");
		System.out.println(respuestaPasteleria3);
	}

}
