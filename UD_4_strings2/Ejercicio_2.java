package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
		int mayus, minus;
		mayus = 0;
		minus = 0;
        char c;
        
        do {
        	System.out.print("Dame una frase: ");
        	frase = sc.nextLine();
        }while(frase.length() > 80);
        
        for(int i=0; i<frase.length(); i++) {
        	c = frase.charAt(i);
        	if(Character.isUpperCase(c)) {
        		mayus++;
        	}else if(Character.isLowerCase(c)) {
        		minus++;
        	}
        }
        System.out.println("Mayusculas: " + mayus + " Minusculas: " + minus);
        sc.close();
	}
}