package Laboratorio3;

/*
 *  Armar la clase Persona con los siguientes atributos:

     	nombre, de tipo String
        apellido, de tipo String
        numeroDocumento, de tipo String

	Construir los setters y los getters de forma automática

	Armar un constructor que espere como parámetros los valores
 	correspondientes a nombre, apellido y numeroDocumento
 * */

public class Persona {

	private String nombre;
	private String apellido;
	private String numeroDocumento;
	
	public Persona(String nombre, String apellido, String numeroDocumento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	@Override
	public boolean equals(Object Persona) {
		
		Persona otraPersona = (Persona) Persona;
		
		return this.nombre == otraPersona.getNombre() && this.apellido == otraPersona.getApellido() && this.numeroDocumento == otraPersona.getNumeroDocumento();
		
	}
	
}

