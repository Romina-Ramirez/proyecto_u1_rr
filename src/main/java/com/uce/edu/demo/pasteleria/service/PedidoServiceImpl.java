package com.uce.edu.demo.pasteleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.pasteleria.modelo.AuxiliarPastelero;
import com.uce.edu.demo.pasteleria.modelo.ChefPastelero;
import com.uce.edu.demo.pasteleria.modelo.Pedido;
import com.uce.edu.demo.pasteleria.repository.IPedidoRepository;

@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private IPedidoRepository pedidoRepository;

	@Autowired
	private ChefPastelero chefPastelero;

	@Autowired
	private AuxiliarPastelero auxiliarPastelero;

	@Override
	public void ingresarPedido(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: " + this.chefPastelero);
		System.out.println("DI desde Service PROTOTYPE: " + this.auxiliarPastelero);
		this.pedidoRepository.crear(p);
	}

	@Override
	public Pedido buscarPedido(String numPedido) {
		// TODO Auto-generated method stub
		return this.pedidoRepository.leer(numPedido);
	}

	@Override
	public void actualizarPedido(Pedido p) {
		// TODO Auto-generated method stub
		this.pedidoRepository.actualizar(p);
	}

	@Override
	public void eliminarPedido(String numPedido) {
		// TODO Auto-generated method stub
		this.pedidoRepository.eliminar(numPedido);
	}

}
