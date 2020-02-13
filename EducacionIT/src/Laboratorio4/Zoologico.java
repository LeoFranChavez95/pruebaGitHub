package Laboratorio4;

/*
 *  Atributos de clase p�blicos y constantes  CANTIDAD_ANIMALES = 25 y RACIONES_POR_ANIMAL = 5 del tipo entero
 	Atributo privado abierto del tipo boolean representando si el zool�gico est� abierto o cerrado
 	M�todo abrir() para abrir el zool�gico
 	M�todo alimentarAnimales(int unaCantidadDeRaciones) � deber� instanciar a un Cuidador pas�ndole
 	la cantidad de raciones en el constructor del mismo
 	M�todo cerrar() para cerrar el zool�gico
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

