package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);

	public Deposito buscar(LocalDateTime fecha);

	public void actualizar(Deposito d);

	public void borrar(String numero);
}