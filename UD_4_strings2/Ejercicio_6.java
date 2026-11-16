package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_6 {
	static Scanner sc = new Scanner(System.in);
	
	public static String LeerFrase() {
		String frase;
		
        do {
        	System.out.print("Dame una frase: ");
        	frase = sc.nextLine();
        }while(frase.length() > 80);
        
		return frase;
	}
	
	public static void main(String[] args) {
		String frase, listaVocales;
		char c;
		int numero = 0, vocal = 0, cons = 0;
		frase = LeerFrase();
		listaVocales = "aeiou";
		
		for(int i=0; i<frase.length(); i++) {
			c = frase.charAt(i);
			
			if(Character.isDigit(c)) {
				numero++;
			}else if(Character.isLetter(c)) {
				if(listaVocales.indexOf(c) != -1) {
					vocal++;
				}else {
					cons++;
				}
			}
		}
		System.out.println("Vocales: " + vocal);
		System.out.println("Consonantes: " + cons);
		System.out.println("Numeros: " + numero);
		sc.close();
	}
}
