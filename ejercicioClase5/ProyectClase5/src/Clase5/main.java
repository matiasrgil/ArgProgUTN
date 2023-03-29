package Clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		LeerArchivo();
		
		List<Producto> ListaProducto = new ArrayList<>();
		
		Producto Alfajor = new Producto();
		Alfajor.setIdProducto(1);
		Alfajor.setCantidad(0);
		Alfajor.setPrecio(149.99);
		Alfajor.setDescripcion("Alfajor");
		
		ListaProducto.add(Alfajor);
		
		Producto Jugo = new Producto();
		Jugo.setIdProducto(2);
		Jugo.setCantidad(1);
		Jugo.setPrecio(249.99);
		Jugo.setDescripcion("Jugo");
		
		ListaProducto.add(Jugo);
		
		Producto Chicle = new Producto();
		Chicle.setIdProducto(3);
		Chicle.setCantidad(3);
		Chicle.setPrecio(99.99);
		Chicle.setDescripcion("Chicle");
		
		ListaProducto.add(Chicle);
		
		Menu MenuProducto = new Menu();
		MenuProducto.SelectProd(ListaProducto);
		Scanner Lectura = new Scanner(System.in);
		int OpcionElegida= Lectura.nextInt();
		
		for(Producto p: ListaProducto) {
			if (p.idProducto==MenuProducto.LeeOpcProd(OpcionElegida)) {
				MenuProducto.GetProd(p);
				break;
			}
		}
		
		Scanner LectCant =  new Scanner(System.in);
		int Cantidad = Integer.parseInt(LectCant.nextLine());
		

	}

}
