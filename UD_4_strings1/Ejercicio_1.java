package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena, result;
		char letra;
		
		System.out.print("Dame una cadena: ");
		cadena = sc.nextLine();
		
		System.out.print("Dame una letra: ");
		letra = sc.nextLine().charAt(0);
		
		result = cadena.replace(letra, Character.toUpperCase(letra));
		System.out.print(result);
	}
}
