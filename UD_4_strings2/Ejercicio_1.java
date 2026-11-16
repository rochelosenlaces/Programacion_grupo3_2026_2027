package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String frase;
        
        do {
        	System.out.print("Dame una frase: ");
        	frase = sc.nextLine();
        }while(frase.length() > 80);
        
        for(int i=0; i<=frase.length(); i++) {
        	System.out.println(frase.substring(0, i));
        }
        sc.close();
	}
}
