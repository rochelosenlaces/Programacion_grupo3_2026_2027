package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int opt;
        
        do {
        	System.out.print("Dame una frase: ");
        	frase = sc.nextLine();
        }while(frase.length() > 80);
        
        System.out.println("Quieres convertir a mayus (1) o a minus (2)");
        opt = sc.nextInt();
        if(opt == 1) {
        	System.out.println(frase.toUpperCase());
        }else if(opt == 2) {
        	System.out.println(frase.toLowerCase());
        }
        sc.close();
	}
}
