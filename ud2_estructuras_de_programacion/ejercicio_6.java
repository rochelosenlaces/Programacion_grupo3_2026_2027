package ud2_estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		String result;
		
		result = "";
		System.out.print("Dame un numero: ");	
		numero = scanner.nextInt();
		while(numero >=10) {
			result = result + " " + (numero%10);
			numero = numero / 10;
		}
		result = result + " " + numero;
		System.out.print(result);
		
		scanner.close();
	}

}
