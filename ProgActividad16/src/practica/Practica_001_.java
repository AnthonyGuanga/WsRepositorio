package practica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Practica_001_ {
	
	Jugador j1 = new Jugador();
	
	
	@BeforeEach
	void test() {
		j1 = new Jugador();
	}
	
	@Test
	void ponerDorsal() {
	
		int dorsal1 = 10;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = 10;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ponerDorsalMayorQueelrango() {
	
		int dorsal1 = 31;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ponerDorsalMenorQueelrango() {
		
		int dorsal1 = -1;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@Test
	void numerodetarjetasAmarillas() {
	
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = j1.estaExpulsado();
		assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	@Test
	void numerodetarjetasRojasMayor() {
	
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = j1.estaExpulsado();
		assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	@Test
	void numerodetarjetasAmarillasMayor() {
	
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = j1.estaExpulsado();
		assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	@Test
	void dorsal() {
		
		j1.setDorsal(0);
		j1.setNumeroTarjetasAmarillas(0);
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = j1.estaExpulsado();
		assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	@Test
	void dorsal2() {
		
	j1.getNumeroTarjetasAmarillas();
	j1.getNumeroTarjetasRojas();
		
		
	}
	
	
	
	

}
