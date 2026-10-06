package estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_2 {
	public static void main(String[] args) {
		// ax^2 + bx + c = 0
		Scanner scanner = new Scanner(System.in);
		double a, b, c, cte, result1, result2;
		
		System.out.println("Introduce a: ");
		a = scanner.nextDouble();
		System.out.println("Introduce b: ");
		b = scanner.nextDouble();
		System.out.println("Introduce c: ");
		c = scanner.nextDouble();
		
		cte = Math.sqrt((b*b) - (4*a*c));
		result1 = (-b + cte) / (2*a);
		result2 = (-b - cte) / (2*a);
		System.out.println("Solucion 1: " + result1);
		System.out.print("Solucion 2: " + result2);
		
		scanner.close();
	}
}
