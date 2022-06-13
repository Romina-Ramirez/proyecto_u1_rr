package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void crear(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el producto: " + p + "\n");
	}

	@Override
	public Producto leer(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó el producto con fecha: " + fechaIngreso + "\n");
		Producto p = new Producto();
		p.setFecha(fechaIngreso);
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizó el producto: " + p + "\n");
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se eliminó el producto con nombre: " + nombre + "\n");
	}

}
