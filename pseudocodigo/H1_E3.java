package pseudocodigo;
import java.util.Scanner;

public class H1_E3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, suma;
		
		System.out.print("Dame un numero: ");
		numero = entrada.nextInt();
		suma = numero + 10;
		System.out.print(suma);
		entrada.close();
	}

}
