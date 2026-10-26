package Pseudocodigo_H2;
import java.util.Scanner;

public class Ejercicio_8 {
	public static int contarDivisores(int numero){
		int contador = 0;
		for(int i=1; i<=numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, q, total_div_p, total_div_q;
		
		do {
			System.out.print("Dame p: ");
			p = sc.nextInt();
		}while(p<=0);
		
		do {
			System.out.print("Dame q: ");
			q = sc.nextInt();
		}while(q<=0);
		total_div_p = contarDivisores(p);
		total_div_q = contarDivisores(q);
		if(total_div_p > total_div_q) {
			System.out.print("P tiene más divisores que Q");
		}else if(total_div_q > total_div_p) {
			System.out.print("Q tiene más divisores que P");
		}else {
			System.out.print("Tienen los mismos divisores");
		}
	}
}
