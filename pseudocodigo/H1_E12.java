package pseudocodigo;
import java.util.Scanner;

public class H1_E12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		String result;
		
		System.out.print("Dame un numero: ");
		num = scanner.nextInt();
		
		if(num % 2 == 0) {
			result = "PAR";
		}else {
			result = "IMPAR";
		}
		System.out.print("El numero es " + result);
	}

}
