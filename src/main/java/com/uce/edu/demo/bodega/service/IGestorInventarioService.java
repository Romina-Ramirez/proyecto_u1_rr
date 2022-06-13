package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IGestorInventarioService {

	public void reporte(LocalDateTime fechaIngreso, Inventario inventario);

}
