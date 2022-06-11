package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros = new ArrayList<>();

		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuentaOrigen("1239");

		listaRetiros.add(reti1);

		return listaRetiros;
	}

}
