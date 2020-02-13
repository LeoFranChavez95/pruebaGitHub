package Laboratorio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestLaboratorio2 {

	
	@Test
	void sumaTotalVectores() {
		int vecNumeros[] = {11, -22, 33, -44, 55, -66, 77, -88, 99};
	    int vecPositivos[] =  new int[10];
	    int vecNegativos[] =  new int[10];
		
		for (int i = 0,j = 0; i < vecNumeros.length; i++) {
			if(vecNumeros[i]>0){
				vecPositivos[j] = vecNumeros[i];
				j++;
			}
		}
		
		for (int i = 0,j = 0; i < vecNumeros.length; i++) {
			if(vecNumeros[i]<0){
				vecNegativos[j] = vecNumeros[i];
				System.out.println(vecNegativos[j]);
				j++;
			}
		}	
			
		//System.out.println(Vectores.sumaTotal(vecNegativos)+" y "+Vectores.sumaTotal(vecPositivos));	
		assertEquals(275, Vectores.sumaTotal(vecPositivos));
		assertEquals(-220, Vectores.sumaTotal(vecNegativos));
		}
		
	}
		


