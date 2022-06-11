package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui debería estar el SQL a la base
		List<Transferencia> listaConsultada = new ArrayList<>();

		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsultada.add(trans1);

		return listaConsultada;
	}

}
