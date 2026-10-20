package bucles_anidados;
import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano;
		
		System.out.println("Dame la longitud: ");
		tamano = sc.nextInt();
		
		for(int fila=0; fila<tamano; fila++) {
			for(int col=0; col<tamano; col++) {
				if((fila+col) % 2 == 0) {
					System.out.print("# ");
				}else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
