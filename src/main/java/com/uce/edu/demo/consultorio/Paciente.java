package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//Les voy a poner una metadata
//1) IoC Component
@Component
public class Paciente {
	
	private String nombre;
	private int edad;
	
	//Set y Get
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
