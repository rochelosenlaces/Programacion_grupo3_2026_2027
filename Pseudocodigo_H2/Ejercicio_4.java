package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Dame un numero: ");
		numero = sc.nextInt();
		
		for(int div = 1; div <= numero; div++) {
			if(numero % div == 0) {
				System.out.print(div + " ");
			}
		}
		sc.close();
	}

}
