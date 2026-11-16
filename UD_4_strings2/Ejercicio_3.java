package UD_4_strings2;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int pos;
        
        System.out.print("Dame la frase: ");
        frase = sc.nextLine();
        System.out.print("Dame una palabra: ");
        palabra = sc.nextLine();
        
        pos = frase.indexOf(palabra);
        if(pos == -1) {
        	System.out.println("No existe: Resultado 0");
        }else {
        	System.out.println("Posicion: " + (pos + 1));
        }
        
        sc.close();
	}
}
