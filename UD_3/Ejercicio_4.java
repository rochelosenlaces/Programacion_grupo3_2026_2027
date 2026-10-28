package UD_3;

public class Ejercicio_4 {
	public static void mostrarProgreso(int porcentaje) {
		int hash = porcentaje/5;
		if(porcentaje < 0 || porcentaje > 100) {
			System.out.print("No se puede ejecutar");
			return;
		}
		
		System.out.print("[");
		for(int i=0; i<20; i++) {
			if(i<hash) {
				System.out.print("#");
			}else {
				System.out.print(".");
			}
		}
		System.out.println("]" + porcentaje + "%");
	}
	
	public static void main(String[] args) {
		for(int porc=0; porc<=100; porc+=10) {
			mostrarProgreso(porc);
		}
	}
}