package UD_5_arrays;
import java.util.Arrays;
import java.util.Scanner;


public class ejercicio_6 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num, pos;	    
        int[] arr = {14, 7, 23, 7, 42, 9, 15, 7};
        
        System.out.print("Introduce un número a buscar: ");
        num = sc.nextInt();
        
        pos = -1;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == num) {
        		pos = i;
        		break;
        	}
        }
        
        if(pos == -1) {
            System.out.print("No existe");
        }else {
            System.out.print("Si existe en la posicion: " + pos);

        }
        sc.close();
	}
}
