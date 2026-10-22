package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, suma_div;
		
		System.out.print("Dame un numero: ");
		numero = sc.nextInt();
		
		suma_div = 0;
		
		for(int div = 1; div < numero; div++) {
			if(numero % div == 0) {
				suma_div = suma_div + div;
			}
		}
		if(numero == suma_div) {
			System.out.print("Es perfecto");
		}else {
			System.out.print("No es perfecto");
		}
		sc.close();
	}
}