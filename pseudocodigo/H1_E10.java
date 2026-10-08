package pseudocodigo;
import java.util.Scanner;

public class H1_E10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, n3, result;
		
		//Checkeo de que sean distintos
		do {
			System.out.println("Dame el 1º numero: ");
			n1 = scanner.nextInt();
			System.out.println("Dame el 2º numero: ");
			n2 = scanner.nextInt();
			System.out.println("Dame el 3º numero: ");
			n3 = scanner.nextInt();	
		} while (n1 == n2 || n1 == n3 || n2 == n3);

		//Comprobacion mayor
		if(n1 > n2 && n1 > n3) {
			result = n1;
		}else if(n2 > n3) {
			result = n2;
		}else {
			result = n3;
		}
		System.out.print(result);
		scanner.close();
	}

}
