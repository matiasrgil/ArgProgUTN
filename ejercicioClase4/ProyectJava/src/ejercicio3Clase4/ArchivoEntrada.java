package ejercicio3Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoEntrada {
	
	String Path;
	
	public ArchivoEntrada(String Ruta){
		this.Path=Ruta;
	}
	
	public String LeerArchivos() 
	{
		try {
			for (String linea : Files.readAllLines(Paths.get(Path)))
			{
				return linea;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}


}	
