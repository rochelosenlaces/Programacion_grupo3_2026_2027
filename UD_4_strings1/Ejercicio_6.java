package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra, result;
		
		System.out.print("Dame una palabra: ");
		palabra = sc.nextLine();
		
		if(palabra.length() > 1) {
			result = palabra.charAt(palabra.length()-1) + palabra.substring(1, palabra.length()-1) + palabra.charAt(0);
		}else {
			result = palabra;
		}
		System.out.println(result);
		
		sc.close();
	}
}
