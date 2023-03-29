package ejerciciosClase4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Clase4_ejercicio1c {

	public static void main(String[] args) {
		
		String orden = "";
	    
	    Integer numArray[]= new Integer[3];
	    
	    
	    //numArray [0] = 3;
	    //numArray [1] = 9;
	    //numArray [2] = 8;
	    
	    try {
	    System.out.print("Su vector es : \n");
	    //segundo for muestra el array ya cargado
	    for (int x : numArray){
	        System.out.print(x + " ");
	    }
	    
	    System.out.print("\n");
	    
	    } catch(Exception e){
	    	System.out.print("No hay Array de enteros, generaremos uno\n");
	    	
	    	for(int i = 0; i < numArray.length; i++) { 
		    	System.out.print("Ingrese el valor " + (i+1) + "\n");
		    	Scanner numArrayScn = new Scanner(System.in);
				int num = numArrayScn.nextInt();
		    	numArray[i] = num;              
		    }
	    	
	    }
	    
		System.out.print("Defina el orden creciente o decreciente para el array. 'C' o 'D' segun corresponda\n");
		do {
		    Scanner ordenScn = new Scanner(System.in);
			orden = ordenScn.nextLine().toUpperCase();
			if (!(orden.equals("C")) && !(orden.equals("D"))){
				System.out.print("Debe ingresar 'C' si desea creciente o 'D' si desea decreciente\n");
			}
		    }
		while((!orden.equals("C")) && !(orden.equals("D")));
		
		//informa el orden
		if (orden.equals("C")){
			System.out.print("orden es : Creciente\n");	
		}else {
			System.out.print("orden es : Decreciente\n");
		}
		
	    
	    //Libreria Arrays me permite ordenar creciente. Collections decreciente. Integer para decreciente por que 
	    //solo funciona para arrayas de objetos
	    if (orden.equals("C")) {
	    	Arrays.sort(numArray);
	    }else if (orden.equals("D")){
	    	Arrays.sort(numArray, Collections.reverseOrder());
	    }
	    
	    System.out.print("\nSu vector es : \n");
	    //segundo for muestra el array ya cargado
	    for (int x : numArray){
	        System.out.print(x + " ");
	    }
		
	}
}


