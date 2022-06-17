package com.uce.edu.demo.pasteleria.repository;

import com.uce.edu.demo.pasteleria.modelo.Pedido;

public interface IPedidoRepository {

	public void crear(Pedido p);

	public Pedido leer(String numPedido);

	public void actualizar(Pedido p);

	public void eliminar(String numPedido);

}
