package Clase14;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String ruta = "C:\\\\Users\\\\Matias\\\\eclipse-workspace\\\\ProyectClase14\\\\archivoClase14.txt";
		String dni = "";
		int dniInt = 0;
		
		validarDni validar = new validarDni();

		//System.out.println("3348037L: " + validar.validarDNI("3348037L"));
		//System.out.println("Holis: " + validar.validarDNI("Holis"));
		//System.out.println("334803762: " + validar.validarDNI("33480376"));

		File file = new File(ruta);

		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {

			while (sc.hasNextLine()) {
				String[] archivoScn = (sc.nextLine()).split(";");
				dni = archivoScn[0];
				dniInt = Integer.parseInt(archivoScn[0]);

				System.out.println(dniInt + " corresponde con la expresion regular? --> " + validar.validarDNI(dni,"[0-9]{6,8}"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
