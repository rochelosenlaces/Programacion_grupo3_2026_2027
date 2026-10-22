package bucles_anidados;
import java.util.Scanner;

public class Ejercicio_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_alumnos;
		
		System.out.print("Dame el numero de alumnos: ");
		num_alumnos = sc.nextInt();
		
		for(int grupos = 1; (grupos*grupos)<=num_alumnos; grupos++)
			if(num_alumnos % grupos == 0) {
				System.out.println(grupos + " X " + (num_alumnos/grupos));
			}
		sc.close();
	}
}