package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_5 {

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
		int numero;
		boolean primo;
		
		System.out.print("Dame un numero: ");
		numero = sc.nextInt();
		
		primo = IsPrimo(numero);
		
		if (primo) {
			System.out.print("Es primo");
		}else {
			System.out.print("No es primo");
		}
		sc.close();
	}
}
