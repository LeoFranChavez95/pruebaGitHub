package Laboratorio2;
/*
 * Construir un vector de enteros llamado vecNumeros
 * e inicializarlo con los números 11, -22, 33, -44, 55, -66, 77, -88, 99.
 * Construir un vector de enteros llamados vecPositivos, de longitud 10,
 * que contenga los números positivos de vecNumeros.
 *
 */
public class Vectores {

	public static void main(String[] args) {
		
		final int vecNumeros[] = {11, -22, 33, -44, 55, -66, 77, -88, 99};
		final int vecPositivos[] =  new int[10];
		final int vecNegativos[] =  new int[10];
		
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
		
	}
	
	public static int sumaTotal(int vec[]) {
		
		int sumaTotal = 0;
		for (int i = 0; i < vec.length; i++) {
			sumaTotal += vec[i];
		}
		return sumaTotal;
	}
	/*
	public static int sumaTotal(int[] vecPositivos) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
}
