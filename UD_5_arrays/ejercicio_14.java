package UD_5_arrays;
import java.util.Arrays;

public class ejercicio_14 {
	public static int[] eliminarRepetidos(int[] original) {
		//1. Temporal
		int[] temp = new int[original.length];
		boolean esDuplicado;
		int cont = 0;
		
		//2. Recorrer y filtrar
		for(int i=0; i < original.length; i++) {
			esDuplicado = false;
			for(int j=0; j < cont; j++) {
				if(original[i] == temp[j]) {
					esDuplicado = true;
					break;
				}
			}
			
			if(!esDuplicado) {
				temp[cont] = original[i];
				cont++;
			}
		}
		
		//3. Crear result
		int[] result = new int[cont];
		for(int i=0; i < cont; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
        int[] original = {1, 2, 2, 3, 1, 4, 2};
        int[] sin_repetidos = eliminarRepetidos(original);
        
		System.out.println("Original: " + Arrays.toString(original));
		System.out.println("Sin repes: " + Arrays.toString(sin_repetidos));
	}
}
