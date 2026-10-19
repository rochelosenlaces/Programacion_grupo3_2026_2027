package bucles_anidados;

public class Ejercicio_2 {

	public static void main(String[] args) {

		int total_etiquetas, num_pasillos, num_estanterias, num_baldas;
		
		total_etiquetas = 0;
		num_pasillos = 3;
		num_estanterias = 4;
		num_baldas = 3;
		
	        for (int p = 1; p <= num_pasillos; p++) {
	            for (int e = 1; e <= num_estanterias; e++) {
	                for (int b = 1; b <= num_baldas; b++) {
	                    System.out.println("P" + p + "-E" + e + "-B" + b);
	                    total_etiquetas++;
	                }
	            }
	        }
	        System.out.println("Etiquetas generadas: " + total_etiquetas);
	}
}