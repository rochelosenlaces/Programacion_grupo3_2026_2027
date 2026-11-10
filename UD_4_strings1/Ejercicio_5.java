package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String persona1, persona2;
		String[] persona_tro_1, persona_tro_2;
		
		System.out.print("Dame un nombre: ");
		persona1 = sc.nextLine();
		System.out.print("Dame otro nombre: ");
		persona2 = sc.nextLine();
		
		persona_tro_1 = persona1.split(" ");
		persona_tro_2 = persona2.split(" ");
		
		System.out.println(persona_tro_1[0] + " " + persona_tro_2[1]);
		System.out.println(String.join(" ", persona_tro_2[0], persona_tro_1[1]));
		
		sc.close();
	}
}
