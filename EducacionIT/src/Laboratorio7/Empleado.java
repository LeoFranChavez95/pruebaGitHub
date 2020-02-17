package Laboratorio7;

/*
atributos nombre y dni de tipo String
atributo edad de tipo int
un constructor de que soporte pasar el nombre, dni y edad
respetar el concepto de encapsulamiento
*/

public class Empleado {

	private String nombre;
	private String DNI;
	private int edad;
	
	
	
	public Empleado(String nombre, String dNI, int edad) {
		this.nombre = nombre;
		DNI = dNI;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
			
		return "Nombre : " + this.nombre + " DNI : " + this.DNI + " Edad: " + this.edad;
			
	}
	
}
