package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();

		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("2345");

		listaDepositos.add(depo1);

		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1234");

		listaDepositos.add(depo2);

		return listaDepositos;
	}

}
