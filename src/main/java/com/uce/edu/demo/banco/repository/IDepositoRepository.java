package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public Deposito leer(LocalDateTime fecha);

	public void actualizar(Deposito d);

	public void eliminar(String numeroDeposito);

}
