package Laboratorio4;

/*
 *  Atributos de clase públicos y constantes  CANTIDAD_ANIMALES = 25 y RACIONES_POR_ANIMAL = 5 del tipo entero
 	Atributo privado abierto del tipo boolean representando si el zoológico está abierto o cerrado
 	Método abrir() para abrir el zoológico
 	Método alimentarAnimales(int unaCantidadDeRaciones) à deberá instanciar a un Cuidador pasándole
 	la cantidad de raciones en el constructor del mismo
 	Método cerrar() para cerrar el zoológico
 */

public class Zoologico {

	public static final int CANTIDAD_ANIMALES = 25;
	public static final int RACIONES_POR_ANIMAL = 5;
	
	private boolean zoologicoAbierto = false; 
	
	public void abrir(){
		
		zoologicoAbierto = true;
		
	}

	public void cerrar(){
		
		zoologicoAbierto = false;
		
	}
	
	public void alimentarAnimales(int unaCantidadDeRaciones) {
		
		
	}
	
	public boolean zoologicoAbierto() {
		
		return zoologicoAbierto;
		
	}
	
}

