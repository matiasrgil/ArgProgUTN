package Chat;


import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		File archivo= new File("chat.txt");
		
		
		while(true) {
			
			System.out.println("ingrese una opcion: \n1-Excribir un mensaje \n2-Leer mensajes anteriores\n3-Para salir");
			
			int opcion= scanner.nextInt();
			scanner.nextLine();
			
			if(opcion == 1 ) {
				
				System.out.println("Ingrese su nombre: ");
				
				String nombre= scanner.nextLine();
				
				System.out.println("ingrese el mensaje: ");
				
				String mensaje= scanner.nextLine();
				
				FileWriter escribir= new FileWriter(archivo, true);
				
				escribir.write(nombre + ": " + mensaje + "\n");
				
				escribir.close();
				
			}
			else if (opcion == 2 ) {
				
				if(!archivo.exists()) {
					
					System.out.println("no hay mensajes anteriores");
					
				}
				else {
					Scanner leer = new Scanner(archivo);
					
					while(leer.hasNextLine()) {
						
						System.out.println(leer.nextLine());		
						
					}
					leer.close();
			}				
				
			}else if (opcion == 3 ) {
				System.out.println("Gracias por utilizar nuestro chat");
				break;
			}
			else {
				System.out.println("la opcion ingresada no es correcta");
				
				archivo.delete();
				
				break;
			}
			
			
		}
		
		
	}

}
