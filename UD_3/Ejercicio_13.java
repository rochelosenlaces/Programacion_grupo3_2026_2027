package UD_3;
import java.util.Scanner;

public class Ejercicio_13 {
	public static int leerEnteroRango(Scanner sc, String mensaje, int min, int max) {
		int result;
		while(true) {
			System.out.print(mensaje + " (" + min + " - " + max + ")");
			result = sc.nextInt();
			if(result >= min && result <= max) {
				return result;
			}else {
				System.out.print("Valor fuera de rango");
			}
		}
	}
	
	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
	
	public static int diasDelMes(int mes, int anio) {
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return esBisiesto(anio) ? 29 : 28;
		default:
			return 0;
		}
	}
	
	public static boolean esFechaValida(int dia, int mes, int anio) {
		if(anio < 1 || mes < 1 || mes > 12) {
			return false;
		}
		int maxDias = diasDelMes(mes, anio);
		return (dia >= 1 && dia <= maxDias);
	}
	
	public static void mostrarDiaSiguiente(int dia, int mes, int anio) {
		if(!esFechaValida(dia, mes, anio)) {
			System.out.printf(" %d/%d/%d -> La fecha no existe: ", dia, mes, anio);
			System.out.println();
		}else {
			int d, m, a;
			d = dia + 1;
			m = mes;
			a = anio;
			
			if(d > diasDelMes(m, a)) {
				d = 1;
				m++;
				if(m > 12) {
					m = 1;
					a++;
				}
			}
			System.out.printf("Dia siguiente: %d/%d/%d", d, m, a);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anio;
		dia = leerEnteroRango(sc, "Dia", 1, 31);
		mes = leerEnteroRango(sc, "Mes", 1, 12);
		anio = leerEnteroRango(sc, "Anio", 1, 3000);
		mostrarDiaSiguiente(dia, mes, anio);
		
	    mostrarDiaSiguiente(29, 2, 2024);
	    mostrarDiaSiguiente(29, 2, 2023);
	    mostrarDiaSiguiente(31, 4, 2026);
	    mostrarDiaSiguiente(31, 12, 2026);
	    mostrarDiaSiguiente(28, 2, 1900);
	}
}