package UD_3;

public class Ejercicio_7 {
	public static boolean esMultiplo(int numero, int divisor) {
		return (divisor != 0 && numero % divisor == 0);
	}
	
	public static boolean terminaEn(int numero, int cifra) {
		boolean result;
		result = numero % 10 == cifra;
		return result;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(esMultiplo(i, 7) || terminaEn(i, 7)) {
				System.out.print("¡plof ");
			}else {
				System.out.print(i + " ");
			}
		}
	}

}
