package ejercicio2Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RutaArchivos {
	
	public RutaArchivos() {
		
	}
	
	String Archivo = "C:\\\\Users\\\\Matias\\\\OneDrive\\\\Escritorio\\\\Mati\\\\cursos\\\\6.UTNArgProg\\\\clase4\\\\ejercicios4\\\\archivo_txt_ejercico2\\\\numero.txt";
	
	public String getArchivo() {
		return Archivo;
	}
	
	public void setArchivo(String archivo) {
		Archivo = archivo;
	}
	
	public String LeerArchivos(){
		
		String linea = "";
		
		try {
			for (String linea1 : Files.readAllLines(Paths.get(Archivo))){
				linea = linea1;
				//cont = linea1.length();
				//for (int i=0; i < lineaStr1.length; i++ ) {
				//	lineaStr[i] = lineaStr1[i];
				//}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return linea;
		
	}
}
