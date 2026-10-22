package bucles_anidados;
import java.util.Scanner;

public class Ejercicio_8 {

	public static void mostrarPlano(int total_plantas, int total_plazas) {
		for(int planta=1; planta <= total_plantas; planta++) {
			System.out.print("Planta "+ planta + ": ");
			for(int plaza=1; plaza <= total_plazas; plaza++) {
				System.out.print("[" + plaza + "] ");
			}System.out.println();
		}
	}
	
	public static int pedirNumero(Scanner sc, String mensaje) {
		int result;
			do {
				System.out.println("Dame nº de" + mensaje + "(1-10)");
				result = sc.nextInt();		
			}while(result < 1 || result > 10);
			
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_plantas, total_plazas, repetir;
		
		do {

			total_plantas = pedirNumero(sc, "plantas");
			total_plazas = pedirNumero(sc, "plazas");
			
			mostrarPlano(total_plantas, total_plazas);

			System.out.print("¿Repetimos? (1 = Si, 0 = No");
			repetir = sc.nextInt();
		}while(repetir == 1);

		sc.close();
	}
}
