package Laboratorio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLaboratorio3 {

	
	@Test
	void pruebaClasePersona() {
		Persona persona = new Persona("Pepe", "Lopez", "38620300");
		assertEquals(new Persona("Pepe", "Lopez", "38620300"), persona);
	}

	@Test
	void pruebaClaseVehiculo() {
		Vehiculo vehiculo = new Vehiculo(45, 20, 12);
		assertEquals(new Vehiculo(45,20,12), vehiculo);
	}
}
