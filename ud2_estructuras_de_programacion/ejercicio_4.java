package estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		String result;
		System.out.println("Dame el primer numero: ");
		a = scanner.nextInt();
		System.out.println("Dame el segundo numero: ");
		b = scanner.nextInt();
		System.out.println("Dame el tercer numero: ");
		c = scanner.nextInt();
		
		if(a > b && a > c) {
			if(b > c) {
				result = a + " " + b + " " + c;
			} else {
			result = a + " " + c + " " + b;
			}
			
		}else if(b > a && b > c) {
			if(a > c) {
				result = b + " " + a + " " + c;
			}else {
				result = b + " " + c + " " + a;
			}
		}else {
			if(a > b) {
				result = c + " " + a + " " + b;
			}else {
				result = c + " " + b + " " + a;
			}
		}
		System.out.print(result);
		scanner.close();
	}
}
