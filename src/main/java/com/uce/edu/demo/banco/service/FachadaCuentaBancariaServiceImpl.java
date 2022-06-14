package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaServiceC;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;

	@Autowired
	@Qualifier("ahorroFuturo")
	private ICuentaBancariaService bancariaServiceAF;

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		if (cta.getTipo().equals("A")) {
			// Ahorros
			System.out.println("La cuenta de ahorros recibe un interes de: ");
			interes = this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		} else if (cta.getTipo().equals("C")) {
			// Corriente
			System.out.println("La cuenta corriente recibe un interes de: ");
			interes = this.bancariaServiceC.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			// Ahorro Futuro
			System.out.println("La cuenta de ahorro futuro recibe un interes de: ");
			interes = this.bancariaServiceAF.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
