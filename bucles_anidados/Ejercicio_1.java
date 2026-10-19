package bucles_anidados;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int total, max_fila, max_butaca;
		
		total = 0;
		max_fila = 5;
		max_butaca = 8;
		for (int fila=1; fila<=max_fila; fila++) {
			for (int butaca=1; butaca<=max_butaca; butaca++) {
				System.out.print("[" + fila + "-" + butaca + "]" + "\t");
				total++;
			}
			System.out.println();
		}
		System.out.print("Total de butacas: " + total);
	}
}