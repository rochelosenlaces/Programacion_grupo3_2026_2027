package UD_5_arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ejercicio_7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;			
		}
		System.out.println("Original: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Ordenado: " + Arrays.toString(arr));
		
		//BinarySearch
		System.out.println("Que numero quieres buscar?: ");
		int num = sc.nextInt();
		int pos = Arrays.binarySearch(arr, num);
		
		if(pos>=0) {
			System.out.println("Si existe en la pos: " + pos);
		}else {
			System.out.print("No existe. Valor de pos: " + pos);
		}
		sc.close();
	}
}
