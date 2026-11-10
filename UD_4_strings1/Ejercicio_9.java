package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_aleatorio;
		String result;
		
		result = "";
		
		for(int i=0; i<=10; i++) {
			num_aleatorio = (int) (Math.random()*100); //Numeros entre 0 y 99
			result = result + num_aleatorio + " ";
		}
		System.out.print(result);
	}
}