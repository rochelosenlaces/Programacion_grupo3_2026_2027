package pseudocodigo;
import java.util.Scanner;


public class H1_E4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, sum, rest, mult, div;
		
		System.out.print("Dame un numero: ");
		num1 = entrada.nextInt();
		System.out.print("Dame un numero: ");
		num2 = entrada.nextInt();
		
		sum = num1 + num2;
		rest = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Suma: " + sum);
		System.out.println("Resta: " + rest);
		System.out.println("Multiplicacion: " + mult);
		System.out.println("Division: " + div);
		entrada.close();
	}

}
