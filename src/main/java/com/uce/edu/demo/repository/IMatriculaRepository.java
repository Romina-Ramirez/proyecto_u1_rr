package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void insertar(Matricula m);

	public Matricula leer(String numero);

	public void actualizar(Matricula m);

	public void eliminar(String numero);

}
