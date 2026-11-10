package UD_4_strings1;
import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		char letraDni, letraCalculada;
		String dni, letrasValidas;
	    letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

		System.out.print("Introduce un DNI (8 números y una letra): ");
	    dni = sc.nextLine().trim(); //eliminar espacios de antes y después

        // Expresión regular: 8 dígitos seguidos de una letra (mayúscula o minúscula)
        if (dni.matches("\\d{8}[A-Za-z]")) {
            String numerosStr = dni.substring(0, 8);
            letraDni = Character.toUpperCase(dni.charAt(8));
            num = Integer.parseInt(numerosStr);
            
            letraCalculada = letrasValidas.charAt(num % 23);
            if (letraCalculada == letraDni) {
                System.out.println("¡El DNI es correcto!");
            } else {
                System.out.println("El DNI es incorrecto. La letra debería ser: " + letraCalculada);
            }
        } else {
            System.out.println("Error: El formato no es válido. Debe tener exactamente 8 números y una letra.");
        }
        sc.close();
	}
}
