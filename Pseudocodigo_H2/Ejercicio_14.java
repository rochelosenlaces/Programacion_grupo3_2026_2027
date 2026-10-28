package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_14 {
	public static boolean IsPrimo(int num) {
		boolean result;
		result = true;
		
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				result = false;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Dame un numero: ");
		n = sc.nextInt();
		
		for(int i=2; i<n; i++) {
			if(IsPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
