package ejercicio3Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoSalida {

	String Txt;
	String Path;
	
	public ArchivoSalida(String Texto, String Ruta) {
		this.Txt=Texto;
		this.Path=Ruta;
	} 
	
	public void EscribirArchivos()
	{
	try {
	Files.writeString(Paths.get(Path), Txt);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
}
	
	
