package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		
		System.out.print("Dame una palabra: ");
		palabra = sc.nextLine();
		String inversa = new StringBuilder(palabra).reverse().toString();
		
		if (palabra.equalsIgnoreCase(inversa)) {
			System.out.print("Es un palindromo");
		}else {
			System.out.print("No es un palindromo");
		}
		sc.close();
	}
}
