package ud2_estructuras_de_programacion;
import java.util.Scanner;


public class ejercicio_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota;
		
		System.out.print("Dime tu nota: ");
		nota = scanner.nextDouble();
		
		if(nota < 0 || nota > 10) {
			System.out.print("Nota no valida");
		}else if(nota < 5) {
			System.out.print("Insuficiente");
		}else if(nota < 6){
			System.out.print("Suficiente");
		}else if(nota < 7) {
			System.out.print("Bien");
		}else if(nota < 9) {
			System.out.print("Notable");
		}else {
			System.out.print("Sobresaliente");
		}
		scanner.close();
	}
}
