package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el retiro: " + r);
	}

	@Override
	public Retiro leer(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó el retiro con fecha:" + fecha);
		Retiro r = new Retiro();
		r.setFecha(fecha);
		return r;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: " + r);
	}

	@Override
	public void eliminar(String numeroRetiro) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro con número: " + numeroRetiro);
	}

}
