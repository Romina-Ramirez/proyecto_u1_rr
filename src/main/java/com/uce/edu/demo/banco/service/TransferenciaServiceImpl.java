package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	/*
	 * Como la lógica de CuentaBancariaService no hace nada Si puedo inyectar el
	 * CuentaBancariaRepository
	 */
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Autowired
	private ITransferenciaRepository itransferenciaRepository;

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.itransferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.itransferenciaRepository.leer(fecha);
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		this.itransferenciaRepository.actualizar(t);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.itransferenciaRepository.eliminar(numero);
	}

}
