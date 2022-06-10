package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public Transferencia leer(LocalDateTime fecha);

	public void actualizar(Transferencia t);

	public void eliminar(String numeroTransferencia);

}
