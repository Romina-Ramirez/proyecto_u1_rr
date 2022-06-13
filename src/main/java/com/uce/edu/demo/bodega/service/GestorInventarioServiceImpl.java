package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Override
	public void reporte(LocalDateTime fechaIngreso, Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("--------- REPORTE DEL INVENTARIO ---------");
		System.out.println("Fechas mayores a: " + fechaIngreso);
		System.out.println();

		for (Producto p : inventario.getProducto()) {
			if (fechaIngreso.compareTo(p.getFecha()) < 0) {
				Producto p1 = precioVenta(p);
				System.out.println(p1.getNombre() + " - " + p1.getCantidad() + " - $" + p1.getPrecioVenta() + " - "
						+ p1.getFecha());
			}

		}

	}

	private Producto precioVenta(Producto p) {
		Producto producto = p;

		BigDecimal precioCompra = producto.getPrecioCompra();
		BigDecimal ganancia = precioCompra.multiply(new BigDecimal(0.1));
		BigDecimal iva = precioCompra.multiply(new BigDecimal(0.12));
		BigDecimal precioVenta = precioCompra.add(ganancia).add(iva);
		BigDecimal precioFinal = precioVenta.setScale(2, RoundingMode.HALF_UP);
		producto.setPrecioVenta(precioFinal);

		return producto;
	}

}
