package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, limpia;
		
		System.out.print("Dame una palabra: ");
		frase = sc.nextLine();
		
		limpia = frase.replace(" ", "");
		
		String inversa = new StringBuilder(limpia).reverse().toString();
		
		if (limpia.equalsIgnoreCase(inversa)) {
			System.out.print("Es un palindromo");
		}else {
			System.out.print("No es un palindromo");
		}
		sc.close();
	}
}