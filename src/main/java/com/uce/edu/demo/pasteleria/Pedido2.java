package com.uce.edu.demo.pasteleria;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.pasteleria.modelo.ChefPastelero;

@Service
public class Pedido2 {

	private LocalDateTime fechaPedido;
	private String descripcion;

	private ChefPastelero pastelero;
	private Cliente cliente;

	// 2) DI por constructor
	public Pedido2(ChefPastelero pastelero, Cliente cliente) {
		this.pastelero = pastelero;
		this.cliente = cliente;
	}

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
		return "Pedido 2 realizado con éxito.";
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

	public ChefPastelero getPastelero() {
		return pastelero;
	}

	public void setPastelero(ChefPastelero pastelero) {
		this.pastelero = pastelero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
