package estructuras_de_programacion;
import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numero;
	String valor;
	System.out.print("Dame un numero: ");
	numero = scanner.nextInt();
	
	if (numero > 0) {
		valor = "positivo";
	}else if(numero < 0) {
		valor = "negativo";
	}else {
		valor = "cero";
	}
	System.out.print(numero + " es " + valor);

	scanner.close();
	}
}
