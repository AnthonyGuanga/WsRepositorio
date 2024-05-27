package practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Practica_002_ {

	Soldado s1 = new Soldado();
	Soldado s2 = new Soldado();
	@BeforeEach
	void test() {
	s1 = new Soldado();
	s2 = new Soldado();
	}
	
	@Test
	void numerodeBalas() {
		int numeroBalas = 10;
		s1.setNumeroBalas(numeroBalas);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void numerodeBalasMenorDelRango() {

		int numeroBalas = 0;
		s1.setNumeroBalas(numeroBalas);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s1.puedeDisparar();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void numerodeBalasMenorDelRango2() {
		int numeroBalas = -10;
		s1.setNumeroBalas(numeroBalas);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s1.puedeDisparar();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	@Test
	void dispararSoldado() {
		
		s2.setEstaMuerto(false);
		s1.setNumeroBalas(10);
		s1.disparar(s2);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s2.isEstaMuerto();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	void dispararSoldadocero() {
		
		s2.setEstaMuerto(true);
		s1.setNumeroBalas(10);
		s1.disparar(s2);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s2.isEstaMuerto();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	

	@Test
	void dispararSoldadoMenorQueElrango() {
		
		s2.setEstaMuerto(false);
		s1.setNumeroBalas(-10);
		s1.disparar(s2);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s2.isEstaMuerto();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	void numerodeBales() {
		s1.getNumeroBalas();
	}
	
	
	
	
	
	
	

}
