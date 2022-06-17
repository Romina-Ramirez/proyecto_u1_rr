package com.uce.edu.demo.pasteleria.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AuxiliarPastelero {

	private String nombre;
	private String apellido;
	private int edad;
	private String especialidad;
	private int experiencia;

	@Override
	public String toString() {
		return "Auxiliar Pastelero: \n Nombre = " + nombre + " " + apellido + ", Edad = " + edad
				+ ", Especialidad = " + especialidad + ", Experiencia = " + experiencia;
	}

	// Set y Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
