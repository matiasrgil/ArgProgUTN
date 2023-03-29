package Clase5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

public class LeerArchivo {
	leerArchivo = new LeerArchivo();	
	String archivo;
	
	archivo = "C:\\Users\\Matias\\OneDrive\\Escritorio\\Mati\\cursos\\6.UTNArgProg\\clase5\\clase5";
	
	try {
		for (String linea : Files.readAllLines(Paths.get(archivo))){
				
			String arrayStr[] = linea.split(",");

			for (int i=0; i<arrayStr.length; i++) {
				if (i==0) {
					System.out.println("Mi array con la lista del carrito: ");
					System.out.print("{ " + arrayStr[i]);
				} else if (i==(arrayStr.length -1)) {
					System.out.print(" " + arrayStr[i] + " }");			
				} else {
					System.out.print(" " + arrayStr[i]);
					}
				}
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
}

	

