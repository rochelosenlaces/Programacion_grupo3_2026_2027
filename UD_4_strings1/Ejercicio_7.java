package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, result;
		
		
		System.out.print("Dame una frase: ");
		frase = sc.nextLine();
		
		result = frase.replace("si", "no").replace("SI", "NO").replace("Si", "No").replace("sI", "nO");
		
		System.out.println(result);
		sc.close();
	}
}