package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private String codigo;
	private List<Producto> productos;

	@Override
	public String toString() {
		return "Inventario de código = " + codigo + ", \nProductos = \n " + productos;
	}

	// Set y Get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Producto> getProducto() {
		return productos;
	}

	public void setProducto(List<Producto> producto) {
		this.productos = producto;
	}

}
