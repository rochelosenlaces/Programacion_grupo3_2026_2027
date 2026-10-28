package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_10 {
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
		int n, result;
		
		result = 0;
		System.out.print("Dame un numero: ");
		n = sc.nextInt();
		for(int i=2; i<n; i++) {
			if(IsPrimo(i)) {
				result = i;
			}
		}
		System.out.print("El numero primo mas mayor es: " + result);
		sc.close();
	}
}
