package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_5 {
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
		String frase;
		StringBuilder par = new StringBuilder();
		StringBuilder impar = new StringBuilder();
		
		frase = LeerFrase();
		for(int i=0; i<frase.length(); i++) {
			if(i % 2 == 0) {
				par.append(frase.charAt(i));
			}else {
				impar.append(frase.charAt(i));
			}
		}
		System.out.println("Posicion par: " + par);
		System.out.println("Posicion impar: " + impar);
		sc.close();
	}
}