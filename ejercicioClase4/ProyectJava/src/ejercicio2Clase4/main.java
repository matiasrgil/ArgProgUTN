package ejercicio2Clase4;

import java.util.Scanner;

public class main {	
	
		public static void main(String[] args) {
			
			RutaArchivos rutaArchivos = new RutaArchivos();
			Operacion operacion = new Operacion();
			
			String lectura = rutaArchivos.LeerArchivos();
			String op = ""; 
			
			System.out.println("Numeros en el archivo: " + lectura);
			
			int suma=0, multi=1; //a
			
			
			do { 
				
			}while((!op.equals("+")) && !(op.equals("*")));
			
			if (op.equals("+")) {
				for (int i=0; i<lectura.length();i++) {
					//System.out.println("charAt(i): " + lectura.charAt(i));
					int num = lectura.charAt(i);
					//System.out.println("\nsuma: "+ suma);
					//System.out.println("\nnum: "+ (num - 48));
					suma = suma + (num -48);
				}
				System.out.println("\nLa suma de los numeros del archivo es: " + suma);
			} else {
				for (int i=0; i<lectura.length();i++) {
					//System.out.println("charAt(i): " + lectura.charAt(i));
					int num = lectura.charAt(i);
					System.out.println("\nmulti: "+ multi);
					System.out.println("\nnum: "+ (num - 48));
					multi = multi * (num -48);
				}
				System.out.println("\nLa multiplicacion de los numeros del archivo es: " + multi);
			}

		}

	}
