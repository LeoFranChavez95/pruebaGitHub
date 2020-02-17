package Laboratorio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestLaboratorio7 {

	
	@Test
	void verificarEmpleados() {
		
		Empleado e1 = new Empleado("Steve", "12345678", 28);
		Empleado e2 = new Empleado("Tony","30000000",32);
		Empleado e3 = new Empleado("Sam", "456789123", 27);
		Empleado e4 = new Empleado("James", "515465413", 19);
		Empleado e5 = new Empleado("Nat","965136713",29);
		
		Empresa empresa = new Empresa();
		
		empresa.agregarEmpleados(e1);
		empresa.agregarEmpleados(e2);
		empresa.agregarEmpleados(e3);
		empresa.agregarEmpleados(e4);
		empresa.agregarEmpleados(e5);
		
		Assert.assertEquals(5, empresa.cantidadDeEmpleados());
		
	}
	
	@Test
	void verificarEmpleadosMayoresA30() {
		
		Empleado e1 = new Empleado("Steve", "12345678", 28);
		Empleado e2 = new Empleado("Tony","30000000",32);
		Empleado e3 = new Empleado("Sam", "456789123", 27);
		Empleado e4 = new Empleado("James", "515465413", 19);
		Empleado e5 = new Empleado("Nat","965136713",29);
		
		Empresa empresa = new Empresa();
		
		empresa.agregarEmpleados(e1);
		empresa.agregarEmpleados(e2);
		empresa.agregarEmpleados(e3);
		empresa.agregarEmpleados(e4);
		empresa.agregarEmpleados(e5);
		
		
		Assert.assertEquals(4, Empresa.obtenerDatosDeEmpleadosMenosDe30(empresa.getLosEmpleados()).size());
		
	}
	

}
