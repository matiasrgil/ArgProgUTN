package ejercicio2Clase4;

import java.util.Scanner;

public class Operacion {
	
	public Operacion() {
		
	}
	
	public String ElegirOperacion() {
		
		String op = "";
		do {
			System.out.println("\nEscriba '+' si desea sumar o '*' si desea multiplicar ");
		
			Scanner opScn = new Scanner (System.in);
			op = opScn.nextLine();
		}while((!op.equals("+")) && !(op.equals("*")));
		
		return op;
	}
}


			
						
					

		
		

