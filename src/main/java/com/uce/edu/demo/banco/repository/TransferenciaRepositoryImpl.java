package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se creó la transferencia: " + t);
	}

	@Override
	public Transferencia leer(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó la transferencia con fecha: " + fecha);
		Transferencia t = new Transferencia();
		t.setFechaTransferencia(fecha);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia: " + t);
	}

	@Override
	public void eliminar(String numeroTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia con número: " + numeroTransferencia);
	}
	
}
