package Pseudocodigo_H2;

import java.util.Scanner;

public class ejemplo {

	public static boolean IsPrimo(int numero) {
		
		numero = numero + 5;
		System.out.println("Numero isprimo " + numero);
		boolean result;
		result = true;		
		return result;
	}
	
	public static void main(String[] args) {
		boolean primo;
		
		int numero = 1;
		primo = IsPrimo(numero);
		
		System.out.println(numero);
		
		
		

	}
}
