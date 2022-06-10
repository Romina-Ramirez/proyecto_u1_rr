package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar(Retiro r);

	public Retiro leer(LocalDateTime fecha);

	public void actualizar(Retiro r);

	public void eliminar(String numeroRetiro);

}
