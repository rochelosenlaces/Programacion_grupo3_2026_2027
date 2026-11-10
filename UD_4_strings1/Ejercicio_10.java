package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre1, nombre2;
		
		System.out.println("Dame un nombre: ");
		nombre1 = sc.nextLine();
		System.out.println("Dame otro nombre: ");
		nombre2 = sc.nextLine();
		
		if(nombre1.equals(nombre2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
			if(nombre1.compareTo(nombre2) < 0) {
				System.out.println(nombre1 + " " + nombre2);
			}else {
				System.out.println(nombre2 + " " + nombre1);
			}
		}
		
		System.out.println("En mayusc: " + nombre1.toUpperCase() + " " + nombre2.toUpperCase());
		System.out.println("En minusc: " + nombre1.toLowerCase() + " " + nombre2.toLowerCase());
	}
}
