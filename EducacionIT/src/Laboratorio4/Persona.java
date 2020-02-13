package Laboratorio4;

import java.util.Date;

/*
 *  nombre (privado y de la clase java.lang.String)
	fechaDeNacimiento (privado y de la clase java.util.Date)
	métodos de acceso (setters y getters) correspondientes
 * 
 * */

public abstract class Persona {

	private String nombre;
	private Date fechaDeNacimiento ;
	
	
	
	public Persona(String nombre,Date fechaNacimiento) {
		
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaNacimiento;
		
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
