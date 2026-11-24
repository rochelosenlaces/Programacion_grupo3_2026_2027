package UD_5_arrays;
import java.util.Arrays;
import java.util.Scanner;


public class ejercicio_19 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numGrupos;
	    System.out.print("¿Cuantos grupos hay?");
	    numGrupos = sc.nextInt();
	    double[][] grupos = new double[numGrupos][];
	    
	    double mejorMedia = -1;
	    int mejorGrupo = -1;
	    
	    for(int i=0; i < numGrupos; i++) {
	    	System.out.print("¿Cuantos alumnos tiene el grupo: " + (i+1) + " :");
	    	int numAlumnos = sc.nextInt();
	    	grupos[i] = new double[numAlumnos];
	    	
	    	double suma = 0;
		    for(int j=0; j<numAlumnos; j++) {
		    	System.out.print("Dame la nota del alumno " + (j + 1) + " :");
		    	grupos[i][j] = sc.nextDouble();
		    	suma += grupos[i][j];
		    }
		    double media = suma / numAlumnos;
		    if(media > mejorMedia) {
		    	mejorMedia = media;
		    	mejorGrupo = i+1;
		    }
	    }
	    System.out.println("El grupo con mejor media es: " + mejorGrupo + " Media: " + mejorMedia);
		System.out.println(Arrays.deepToString(grupos));
	}
}
