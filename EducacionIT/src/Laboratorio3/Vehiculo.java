package Laboratorio3;

/*
 * 
 * Armar la clase Vehículo con los siguientes atributos:

      alto, de tipo int
      ancho, de tipo int
      largo, de tipo int

  Construir los setters y los getters de forma automática

  Armar un constructor que reciba como parámetros los valores 
  correspondientes a alto, ancho y largo
 * 
 * */


public class Vehiculo {
	
	private int alto;
	private int ancho;
	private int largo;
	
	public Vehiculo(int alto,int ancho,int largo) {
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	@Override
	public boolean equals(Object coche) {
		
		Vehiculo otroCoche = (Vehiculo) coche;
		
		return this.alto == otroCoche.getAlto() && this.ancho == otroCoche.getAncho() && this.largo == otroCoche.getLargo();
		
	}
}
