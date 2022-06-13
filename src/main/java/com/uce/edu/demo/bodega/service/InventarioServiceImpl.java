package com.uce.edu.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository inventarioRepository;

	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.inventarioRepository.crear(i);
	}

}
