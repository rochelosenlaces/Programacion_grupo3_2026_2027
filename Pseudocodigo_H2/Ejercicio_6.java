package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, suma, contador;
		
		suma = 0;
		contador = 0;
		
		do {
			System.out.print("Introduce numeros (0 para terminar): ");
			numero = sc.nextInt();
			
			if(numero != 0) {
				contador++;
				if(numero % 5 == 0) {
					suma = suma + numero;
				}
			}
			
		}while(numero != 0);
		System.out.println("Total de numeros: " + contador);
		System.out.println("Suma de multiplos de 5: " + suma);
		sc.close();
	}

}
