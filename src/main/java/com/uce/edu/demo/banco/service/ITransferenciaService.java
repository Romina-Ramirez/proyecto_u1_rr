package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public Transferencia buscar(LocalDateTime fecha);

	public void actualizar(Transferencia t);

	public void borrar(String numero);
}