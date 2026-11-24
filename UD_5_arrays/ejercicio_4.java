package UD_5_arrays;
import java.util.Arrays;
import java.util.Scanner;


public class ejercicio_4 {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num;
	    double suma;
	    
	    System.out.println("Introduce el nº de notas: ");
	    num = sc.nextInt();
	    
	    double[] notas = new double[num];
	    
	    suma = 0;
	    for(int i=0; i<num; i++) {
	    	System.out.print("Introduce la nota: ");
	    	notas[i] = sc.nextDouble();
	    	suma += notas[i];
	    }
	    
	    double nota_min = notas[0];
	    double nota_max = notas[0];
	    
	    for(double nota : notas) {
	    	if(nota > nota_max) {
	    		nota_max = nota;
	    	}
	    	if(nota < nota_min) {
	    		nota_min = nota;
	    	}
	    }
	    
	    double media = suma / num;
        System.out.printf("Media: %.2f | Más alta: %.2f | Más baja: %.2f%n", media, nota_max, nota_min);

	    sc.close();
	}
}
