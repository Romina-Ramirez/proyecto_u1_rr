package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1RrApplication implements CommandLineRunner {

	@Autowired
	public IRetiroService retiroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("--------------------------Retiro--------------------------");
		this.retiroService.realizarRetiro("2761", new BigDecimal(20));

	}

}
