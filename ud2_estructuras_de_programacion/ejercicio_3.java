package estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dame un numero: ");
		num1 = scanner.nextInt();
		
		System.out.println("Dame otro numero: ");
		num2 = scanner.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("Es multiplo");
		}else {
			System.out.print("No es multiplo");
		}
		scanner.close();
	}
}
