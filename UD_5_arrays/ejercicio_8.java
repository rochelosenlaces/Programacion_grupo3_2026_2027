package UD_5_arrays;
import java.util.Arrays;

public class ejercicio_8 {

	public static void main(String[] args) {
		int[] original = {10, 20, 30};
		int[] copia = new int[original.length];
		
		for(int i=0; i<original.length; i++) {
			copia[i] = original[i];
		}
		
        System.out.println("--- ANTES DE MODIFICAR ---");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia:    " + Arrays.toString(copia));
        System.out.println("original == copia: " + (original == copia) + " (distinta referencia en memoria)");
        System.out.println("Arrays.equals:     " + Arrays.equals(original, copia) + " (mismo contenido)");
        
        copia[0] = 100;
        copia[2] = 300;
        
        System.out.println("\n--- DESPUÉS DE MODIFICAR LA COPIA ---");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia:    " + Arrays.toString(copia));
        System.out.println("original == copia: " + (original == copia));
        System.out.println("Arrays.equals:     " + Arrays.equals(original, copia));
	}
}
