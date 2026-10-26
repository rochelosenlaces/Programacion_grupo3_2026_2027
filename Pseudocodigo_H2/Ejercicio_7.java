package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, cont_impar, cont_par, posicion;

		cont_impar = 0;
		cont_par = 0;
		posicion = 1;
		
		do {
			System.out.print("Introduce numeros (0 para terminar): ");
			numero = sc.nextInt();
			
			if(numero != 0) {
				if(posicion % 2 == 0) {
					cont_par += numero;
				}else {
					cont_impar += numero;
				}
				posicion++;
			}
		}while(numero != 0);
		System.out.println("Suma pares: " + cont_par);
		System.out.println("Suma impares: " + cont_impar);
	}
}