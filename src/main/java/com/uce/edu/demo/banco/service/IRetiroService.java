package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto);

	public Retiro buscar(LocalDateTime fecha);

	public void actualizar(Retiro r);

	public void borrar(String numero);
}
