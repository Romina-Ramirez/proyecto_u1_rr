package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {

	public void crear(Producto p);

	public Producto leer(LocalDateTime fechaIngreso);

	public void actualizar(Producto p);

	public void eliminar(String nombre);

}
