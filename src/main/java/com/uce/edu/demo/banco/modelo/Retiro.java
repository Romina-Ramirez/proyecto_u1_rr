package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private String numeroRetiro;
	private LocalDateTime fecha;
	private String numeroCuentaOrigen;
	private BigDecimal monto;

	@Override
	public String toString() {
		return "Retiro [numeroRetiro=" + numeroRetiro + ", fecha=" + fecha + ", numeroCuentaOrigen="
				+ numeroCuentaOrigen + ", monto=" + monto + "]";
	}

	// Set y Get
	public String getNumeroRetiro() {
		return numeroRetiro;
	}

	public void setNumeroRetiro(String numeroRetiro) {
		this.numeroRetiro = numeroRetiro;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}

	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
