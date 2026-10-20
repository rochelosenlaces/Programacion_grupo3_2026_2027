package bucles_anidados;

public class Ejercicio_4 {

	public static void main(String[] args) {
		char letra;
		
		for (int fila = 0; fila < 5; fila++) {
            letra = (char) ('A' + fila);
            for (int butaca = 1; butaca <= 8; butaca++) {
                if (letra == 'C' && butaca >= 3 && butaca <= 6) {
                    System.out.print("XX ");
                } else {
                    System.out.print("" + letra + butaca + " ");
                }
                if (butaca == 4) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
	}
}