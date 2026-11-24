package UD_5_arrays;
import java.util.Arrays;

public class ejercicio_10 {
	public static int[] invertir(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0; i < arr.length; i++) {
			result[i] = arr[arr.length -1 -i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
		int[] invertido = invertir(original);
		System.out.println("Original: " + Arrays.toString(original));
		System.out.println("Inverso: " + Arrays.toString(invertido));
	}
}
