package UD_5_arrays;
import java.util.Arrays;
import java.util.Random;

public class ejercicio_16 {

	public static void main(String[] args) {
		Random rand = new Random();
		int filas = 3;
		int col = 4;
		int[][] matriz = new int[filas][col];
		int[] sumaFilas = new int[filas];
		int[] sumaCol = new int[col];
		
		//1º Poblar la matriz
		for (int i=0; i<filas; i++) {
			for(int j=0; j<col; j++) {
				matriz[i][j] = rand.nextInt(50) + 1;
				sumaFilas[i] += matriz[i][j];
				sumaCol[j] += matriz[i][j];
			}
		}
		// 2º Mostrar
		for(int i=0; i<filas; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(matriz));
		System.out.print("Suma filas: " + Arrays.toString(sumaFilas));
		System.out.print("Suma cols: " + Arrays.toString(sumaCol));
	}
}
