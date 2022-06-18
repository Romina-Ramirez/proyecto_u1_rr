package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
//		ProfesorMateria profeM = new ProfesorMateria();
//		profeM.setApellido("Tapia");
//		profeM.setNombre("Jose");
//		System.out.println("fffffffffffffffffff");
//		return profeM;
		return null;
	}
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
//		System.out.println("fffffffffffffffffff");
		return null;
	}

	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON: " + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE: " + this.profesorMateria);
		
		System.out.println("DI desde un método General: " + this.obtenerProfesorG());
		System.out.println("DI desde un método Materia: " + this.obtenerProfesorM());
		this.matriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.leer(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}
	
}
