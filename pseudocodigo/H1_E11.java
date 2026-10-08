package pseudocodigo;
import java.util.Scanner;

public class H1_E11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, n3, result;
		
		System.out.println("Dame el 1º numero: ");
		n1 = scanner.nextInt();
		System.out.println("Dame el 2º numero: ");
		n2 = scanner.nextInt();
		System.out.println("Dame el 3º numero: ");
		n3 = scanner.nextInt();	
		
		if(n1 < 0) {
			result = n1 * n2 * n3;
		}else {
			result = n1 + n2 + n3;
		}
		System.out.print("Resultado: "+ result);
		scanner.close();
	}
}
