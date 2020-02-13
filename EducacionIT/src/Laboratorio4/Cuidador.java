package Laboratorio4;

import java.util.Date;
import Laboratorio4.Zoologico;
/*
 *  Es el responsable de alimentar a los animales
   	Es una subclase de Persona
  	Posee un atributo entero privado cantidadDeRaciones que se setea cuando se construye el objeto
 	Método alimentarAnimales() que informará si la cantidad de raciones que le entregaron al cuidador
 	fue suficiente para alimentar a todos los animales
  
 * */

public class Cuidador extends Persona{

	private int cantidadDeRaciones;
	
	public Cuidador(int cantidadDeRaciones) {
		super();
		this.cantidadDeRaciones = cantidadDeRaciones;
		
	}

	public boolean alimentarAnimales() {
		
		return cantidadDeRaciones > Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMAL;
		
	}
	
	
}
