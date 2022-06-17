package com.uce.edu.demo.pasteleria.service;

import com.uce.edu.demo.pasteleria.modelo.Pedido;

public interface IPedidoService {
	
	public void ingresarPedido(Pedido p);

	public Pedido buscarPedido(String numPedido);

	public void actualizarPedido(Pedido p);

	public void eliminarPedido(String numPedido);

}
