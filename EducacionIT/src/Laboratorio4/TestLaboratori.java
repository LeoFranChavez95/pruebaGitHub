package Laboratorio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLaboratori {

	Zoologico zoologico = new Zoologico();
	
	@Test
	void zoologicoAbierto() {
		
		zoologico.abrir();
		assertTrue(zoologico.zoologicoAbierto(), "El zoologico esta abierto");
		
	}
	@Test
	void zoologicoCerrado() {

		zoologico.cerrar();
		assertFalse(zoologico.zoologicoAbierto(), "El zoologico esta cerrado");
		
	}

	
}
