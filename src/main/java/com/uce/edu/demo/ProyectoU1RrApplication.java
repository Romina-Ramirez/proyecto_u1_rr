package com.uce.edu.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	public IInventarioService inventarioService;
	
	@Autowired
	private IGestorInventarioService gestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Producto producto1 = new Producto();
		producto1.setNombre("Harina");
		producto1.setPrecioCompra(new BigDecimal(0.60).setScale(2, RoundingMode.HALF_UP));
		producto1.setCantidad(10);
		producto1.setFecha(LocalDateTime.of(2022, 5, 3, 18, 30, 5));
		
		Producto producto2 = new Producto();
		producto2.setNombre("Huevos");
		producto2.setPrecioCompra(new BigDecimal(5.5).setScale(2, RoundingMode.HALF_UP));
		producto2.setCantidad(50);
		producto2.setFecha(LocalDateTime.of(2022, 6, 9, 12, 54, 7));
		
		Producto producto3 = new Producto();
		producto3.setNombre("Leche");
		producto3.setPrecioCompra(new BigDecimal(0.9).setScale(2, RoundingMode.HALF_UP));
		producto3.setCantidad(35);
		producto3.setFecha(LocalDateTime.of(2022, 5, 25, 10, 52, 34));
		
		Producto producto4 = new Producto();
		producto4.setNombre("Aceite");
		producto4.setPrecioCompra(new BigDecimal(3.45).setScale(2, RoundingMode.HALF_UP));
		producto4.setCantidad(14);
		producto4.setFecha(LocalDateTime.of(2022, 6, 3, 17, 32, 59));
		
		Producto producto5 = new Producto();
		producto5.setNombre("Azúcar");
		producto5.setPrecioCompra(new BigDecimal(2.9).setScale(2, RoundingMode.HALF_UP));
		producto5.setCantidad(21);
		producto5.setFecha(LocalDateTime.of(2022, 6, 13, 12, 18, 17));

		
		List<Producto> producto = new ArrayList<>();
		producto.add(producto1);
		producto.add(producto2);
		producto.add(producto3);
		producto.add(producto4);
		producto.add(producto5);
		
		Inventario inventario = new Inventario();
		inventario.setCodigo("0001");
		inventario.setProducto(producto);
		this.inventarioService.insertarInventario(inventario);

		this.gestorInventarioService.reporte(LocalDateTime.of(2022, 5, 26, 0, 0, 0), inventario);
		
		
	}

}
