package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		// Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado en la base el estudiante: " + e + "\n");
	}

	@Override
	public Estudiante leer(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base los estudiantes con apellido: " + apellido + "\n");
		Estudiante e = new Estudiante();
		e.setApellido(apellido);
		return e;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el estudiante: " + e + "\n");
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el estudiante con la cédula: " + cedula + "\n");
	}

}
