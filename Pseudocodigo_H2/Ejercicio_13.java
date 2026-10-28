package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_13 {
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
		int n, result, contador;
		boolean repetir = true;
		
		System.out.print("Dame un numero: ");
		n = sc.nextInt();
		contador = n + 1;
		result = 0;
		
		while(repetir) {
			if(IsPrimo(contador)) {
				result = contador;
				repetir = false;
			}else {
				contador++;
			}
		}
		System.out.print("Resultado: " + result);
		sc.close();
	}
}
