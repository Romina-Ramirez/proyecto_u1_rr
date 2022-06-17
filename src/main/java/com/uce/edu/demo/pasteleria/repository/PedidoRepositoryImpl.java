package com.uce.edu.demo.pasteleria.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.pasteleria.modelo.Pedido;

@Repository
public class PedidoRepositoryImpl implements IPedidoRepository {

	@Override
	public void crear(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el pedido: " + p + "\n");
	}

	@Override
	public Pedido leer(String numPedido) {
		// TODO Auto-generated method stub
		System.out.println("Se buscó el pedido con número: " + numPedido + "\n");
		Pedido p = new Pedido();
		p.setNumPedido(numPedido);
		return p;
	}

	@Override
	public void actualizar(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizó el pedido: " + p + "\n");
	}

	@Override
	public void eliminar(String numPedido) {
		// TODO Auto-generated method stub
		System.out.println("Se eliminó el pedido con número: " + numPedido + "\n");
	}

}
