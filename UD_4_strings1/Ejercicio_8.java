package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		char vocalMax = ' ';
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		int cont, contMax;

		contMax = -1;		
		System.out.print("Dame una palabra: ");
		palabra = sc.nextLine();
		
		for(char v : vocales) {
			cont = 0;
			for(int i=0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == v) {
					cont++;
				}
			}
			if (cont > contMax) {
				contMax = cont;
				vocalMax = v;
			}
		}
		
		if(contMax > 0) {
			System.out.print("La vocal mas repetida es " + vocalMax + " con " + contMax + " apariciones");
		}
		sc.close();
	}
}
