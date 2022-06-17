package com.uce.edu.demo.pasteleria.modelo;

import java.time.LocalDateTime;

public class Pedido {

	private String numPedido;
	private LocalDateTime fechaPedido;
	private String descripcion;

	@Override
	public String toString() {
		return "Pedido: \n Número Pedido = " + numPedido + "\n Fecha = " + fechaPedido + "\n Descripcion = " + descripcion;
	}

	// Set y Get
	public String getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}

	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDateTime fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
