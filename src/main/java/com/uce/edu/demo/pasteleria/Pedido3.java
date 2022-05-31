package com.uce.edu.demo.pasteleria;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pedido3 {

	private LocalDateTime fechaPedido;
	private String descripcion;

	// 3) DI por métodos Set
	private Pastelero pastelero; // A su método Set le pongo @Autowired
	private Cliente cliente; // A su método Set le pongo @Autowired

	public String realizarPedido(LocalDateTime fechaPedido, String descripcion, String nombrePastelero,
			String especialidadPastelero, String nombreCliente, String apellidoCliente, String direccionCliente) {

		this.pastelero.setNombre(nombrePastelero);
		this.pastelero.setEspecialidad(especialidadPastelero);

		this.cliente.setNombre(nombreCliente);
		this.cliente.setApellido(apellidoCliente);
		this.cliente.setDireccion(direccionCliente);

		this.fechaPedido = fechaPedido;
		this.descripcion = descripcion;

		// Se inserta el pedido en la base de datos
		return "Pedido 3 realizado con éxito.";
	}

	// Set y Get
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

	public Pastelero getPastelero() {
		return pastelero;
	}

	@Autowired
	public void setPastelero(Pastelero pastelero) {
		this.pastelero = pastelero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
