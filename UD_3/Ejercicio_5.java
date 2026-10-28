package UD_3;
import java.util.Scanner;

public class Ejercicio_5 {
	public static double celsiusAFahrenheit(double celsius) {
		return celsius  * 9.0 / 5.0 + 32;
	}
	
	public static double fharenheitACelsius(double fahrenheit) {
		double result;
		result = (fahrenheit - 32) * 5.0 / 9.0;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp_user, temp_conv;
		int opt;
		
		System.out.println("Quieres convertir:\n1-celcius a farh\n2-farh a celsius");
		opt = sc.nextInt();
		
		System.out.println("Dame la temperatura: ");
		temp_user = sc.nextDouble();
		
		if(opt == 1) {
			temp_conv = celsiusAFahrenheit(temp_user);
			System.out.print(temp_conv);
		}else if(opt == 2) {
			temp_conv = fharenheitACelsius(temp_user);
			System.out.print(temp_conv);
		}
		sc.close();
	}
}