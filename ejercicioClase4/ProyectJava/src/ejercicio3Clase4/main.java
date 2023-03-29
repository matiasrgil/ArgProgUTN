package ejercicio3Clase4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// Variables Rutas de Archivos
		String PathEntrada="C:\\Users\\Matias\\OneDrive\\Escritorio\\Mati\\cursos\\6.UTNArgProg\\clase3\\ejercicios3\\Entrada.txt";	
		String PathSalida="C:\\Users\\Matias\\OneDrive\\Escritorio\\Mati\\cursos\\6.UTNArgProg\\clase3\\ejercicios3\\Salida.txt";
		String PathCodificado="C:\\Users\\Matias\\OneDrive\\Escritorio\\Mati\\cursos\\6.UTNArgProg\\clase3\\ejercicios3\\Codificado.txt";

		// Variables para toma de deciciones
		String OpcCodificar;
		
		// Variables para ingreso de datos
		String IngresoTxt;
		int IngresoDesp;
		
		// Interactuo con el usuario y seteo la variable de OpcCodificador
		System.out.println("*********** Clase 4 - Ejecicio 3 *************");
		System.out.println("Ingrese: 1 para Codificar | 2 para Decodificar");
		Scanner Lectura1 = new Scanner(System.in); 
		OpcCodificar=Lectura1.nextLine();
		
		// Uso variable OpcCodificador para tomar decision a traves de un swith
		// Interactuo con el usuario y seteo la variable de IngresoDesp
		System.out.println("Ingrese Desplazamiento:");
		Scanner Lectura3 = new Scanner(System.in);
		IngresoDesp=Integer.parseInt(Lectura3.nextLine());
		
		switch(OpcCodificar) {
			case "1": 
				System.out.println("Ingrese texto a codificar:");// Interactuo con el usuario y seteo la variable de IngresoTxt
				Scanner Lectura2 = new Scanner(System.in);
				IngresoTxt=Lectura2.nextLine();
				
				ArchivoSalida EscriboArchivo = new ArchivoSalida(IngresoTxt,PathEntrada);// Instancio clase ArcSalida, por medio de uno de sus constructores 
				EscriboArchivo.EscribirArchivos(); // uso el objeto y su metodo para escribir en el archivo de entrada
				
				Codificador ClassCod = new Codificador(IngresoTxt,IngresoDesp);// Instancio clase DeCodificador, por medio de uno de sus constructores 
				
				ArchivoSalida EscriboArchCod=new ArchivoSalida(ClassCod.Codificar(),PathCodificado);/*uso el objeto ClassCod y escribo el parametro que devuelve */
				EscriboArchCod.EscribirArchivos();/* en un Archivo Creo otro objeto ArcSalida para escribir en el Archivo Codificado */
				break;
		case "2":
			try {
				ArchivoEntrada LeoArchivo=new ArchivoEntrada(PathCodificado);
				
				Codificador ClassDeco=new Codificador(LeoArchivo.LeerArchivos(),IngresoDesp);
				
				ArchivoSalida EscriboArcDeco=new ArchivoSalida(ClassDeco.Decodificar(),PathSalida);
				EscriboArcDeco.EscribirArchivos();
				
				System.out.println("Exito - Se ejecutó correctamente");
			
				}catch(Exception e){
					
					System.out.println("Error - Hubo problemas y no se ejecutó correctamente: " + e);
				}
				break;
				default: System.out.println("No existe esa opción");
			}
		}
}


