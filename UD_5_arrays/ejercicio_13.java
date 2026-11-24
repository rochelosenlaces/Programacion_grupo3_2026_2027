package UD_5_arrays;
import java.util.Arrays;

public class ejercicio_13 {
	public static int[] invertir(int[] arr) {
		int[] result = new int[arr.length];
		for(int i=0; i < arr.length; i++) {
			result[i] = arr[arr.length -1 -i];
		}
		return result;
	}
	
	public static boolean IsCapicua(int[] arr) {
		int[] invertido = invertir(arr);
		return Arrays.equals(arr, invertido);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.print("¿Es capicua?: " + IsCapicua(arr));
	}
}