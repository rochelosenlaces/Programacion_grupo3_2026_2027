package ud2_estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, p1, p2, p4, p5;
		
		System.out.print("Dame un numero: ");
		numero = scanner.nextInt();
		
		if(numero >= 10000 && numero <= 99999) {
			p1 = numero / 10000; 		// Primera cifra
			p2 = (numero / 1000) % 10; 	// Segunda cifra
			p4 = (numero / 10) % 10; 	// Cuarta cifra
			p5 = numero % 10;			//Quinta cifra
			
			if(p1 == p5 && p2 == p4) {
				System.out.print("Es capicua");
			}else {
				System.out.print("No es capicua");
			}
		}
		
	
		scanner.close();
	}

}
