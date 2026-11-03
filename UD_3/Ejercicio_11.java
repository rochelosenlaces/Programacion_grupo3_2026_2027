package UD_3;

public class Ejercicio_11 {
	public static double area(double lado) {
		return lado * lado;
	}
	
	public static double area(double base, double altura) {
		return base * altura;
	}
	
	public static double areaTriangulo(double base, double altura) {
		return (base * altura)/2;
	}
	
	public static double perimetro(double lado) {
		return lado * 4;
	}
	
	public static double perimetro(double base, double altura) {
		return 2*(base + altura);
	}
	
	public static double perimetro(double a, double b, double c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		double lado_cuadrado = 4.0;
		System.out.println("Area cuadrado: " + area(lado_cuadrado) + " Perimetro: " + perimetro(lado_cuadrado));
		
		double base_rect, alt_rect;
		base_rect = 3.0;
		alt_rect = 5.0;
		System.out.println("Area rect: " + area(base_rect, alt_rect) + " Perimetro: " + perimetro(base_rect, alt_rect));
		
		double l1, l2, l3;
		l1 = 3.0;
		l2 = 4.0;
		l3 = 5.0;
		System.out.println("Area tri: " + area(l1, l2) + " Perimetro: " + perimetro(l1, l2, l3));
	}
}
