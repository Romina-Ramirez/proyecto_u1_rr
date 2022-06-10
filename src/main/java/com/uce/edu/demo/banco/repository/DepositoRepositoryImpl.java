package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el deposito: " + d);
	}

	@Override
	public Deposito leer(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó el deposito con fecha: " + fecha);
		Deposito d = new Deposito();
		d.setFecha(fecha);
		return d;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el deposito: " + d);
	}

	@Override
	public void eliminar(String numeroDeposito) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito con número: " + numeroDeposito);
	}

}
