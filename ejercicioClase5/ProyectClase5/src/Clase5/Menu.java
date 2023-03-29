package Clase5;

import java.util.List;

public class Menu {

	public void SelectProd(List<Producto> ListaProducto) {
		System.out.println("#################################################");
		System.out.println("#####INGRESE OPCION PARA AGREGAR AL CARRITO######");
		System.out.println("#################################################");
		
		for (Producto p : ListaProducto) {
			System.out.println("##### Ingrese: " + p.getIdProducto() + " Para: " + p.getDescripcion() + "       Precio: " + p.getPrecio() + "######");
		}
		
		System.out.println("#################################################");
		}
	
		public int LeeOpcProd(int lectura) {
			return lectura;
		}
		
		public String GetProd(Producto p) {
			String OpcionElegida="Selecciono: " + p.getDescripcion() + "   Precio: " + p.getPrecio();
			System.out.println(OpcionElegida);
			System.out.println("Ingrese cantidad: ");
			return OpcionElegida;
		}
	}


