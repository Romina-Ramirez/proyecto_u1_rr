package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	
	public void insertar(Materia m);

	public Materia leer(String nombre);

	public void actualizar(Materia m);

	public void eliminar(String nombre);
	
}
