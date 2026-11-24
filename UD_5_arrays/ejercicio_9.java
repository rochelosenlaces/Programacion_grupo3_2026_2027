package UD_5_arrays;
import java.util.Arrays;

public class ejercicio_9 {
	
	public static int contarApariciones(int[] arr, int valor) {
		int result;
		result = 0;
		for(int i:arr) {
			if(i == valor) result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 1, 1};
		int valor = 1;
		System.out.print("Apariciones: " + contarApariciones(arr, valor));
	}
}