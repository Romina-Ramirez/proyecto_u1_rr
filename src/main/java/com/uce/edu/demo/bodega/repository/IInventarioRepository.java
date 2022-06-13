package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {

	public void crear(Inventario i);

	public Inventario leer(String codigo);

	public void actualizar(Inventario i);

	public void eliminar(String codigo);

}
