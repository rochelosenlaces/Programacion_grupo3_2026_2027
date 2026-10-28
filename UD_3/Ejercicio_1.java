package UD_3;

public class Ejercicio_1 {

	public static void dibujarLinea() {
		int repeat = 40;
		for(int i=0; i<repeat; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		dibujarLinea();
		System.out.println(" LISTADO DE ALUMNOS");
		dibujarLinea();
        System.out.println("Ana García");
        System.out.println("Luis Martín");
        System.out.println("Marta López");
        dibujarLinea();
	}
}