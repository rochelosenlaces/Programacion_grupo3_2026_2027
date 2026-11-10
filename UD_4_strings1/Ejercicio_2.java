package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		char letra, c;
		int contador = 0;
		StringBuilder result = new StringBuilder();
		
		System.out.println("Dame una palabra: ");
		palabra = sc.nextLine();
		System.out.println("Dame una letra: ");
		letra = sc.nextLine().charAt(0);
		
		for(int i = 0; i < palabra.length(); i++) {
			c = palabra.charAt(i);
			if(c == letra && contador < 3) {
				contador++;
			}else {
				result.append(c);
			}
		}
		System.out.print("Resultado: " + result.toString());
		sc.close();
	}
}
