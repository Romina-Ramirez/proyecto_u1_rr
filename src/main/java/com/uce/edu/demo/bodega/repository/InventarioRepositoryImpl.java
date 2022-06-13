package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void crear(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el inventario de productos: \n" + i + "\n");
	}

	@Override
	public Inventario leer(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó el inventario con codigo: " + codigo + "\n");
		Inventario i = new Inventario();
		i.setCodigo(codigo);
		return i;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizó el inventario: " + i + "\n");
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se eliminó el inventario del producto: " + nombre + "\n");
	}

}
