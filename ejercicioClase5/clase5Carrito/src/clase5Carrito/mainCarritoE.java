package clase5Carrito;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class mainCarritoE {

	public static void main(String[] args) {
  
				
   String ruta="C:\\\\Users\\\\Matias\\\\OneDrive\\\\Escritorio\\\\Mati\\\\cursos\\\\6.UTNArgProg\\\\clase5\\\\clase5.txt";
    	
   ScannerClass(ruta);
	}     
      
    public static void ScannerClass(String ruta)
    { 
    	int Id=1;
    	String DescProducto;
        Double Cantidad;
        Double Precio;
        File file = new File(ruta);
        carritoComprasE Carrito= new carritoComprasE();   
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
        {
        	System.out.println("cant	precioUnitario	producto	\n");
        	
            while (sc.hasNextLine()) 
            {
            	
         	   String[] VectorString= (sc.nextLine()).split(",");
         
         	   DescProducto=VectorString[2];
         	   Cantidad=Double.parseDouble(VectorString[0]);
         	   Precio=Double.parseDouble(VectorString[1]);
         	
         	   productoE obj= new productoE();
         	   obj.Descripcion=DescProducto;
         	   obj.idProducto=Id;
         	   obj.PrecioUnitario=Precio;
         	   Id+=1;
         	  
         	  itemCarritoE obj2= new itemCarritoE();
         	   obj2.Leer_Cargar(obj, Cantidad);
         	   
         	   Carrito.precio(obj2);
         	   	System.out.println(obj2.Cantidad + "	" + obj.PrecioUnitario + "		" + obj.Descripcion);
         	   //System.out.println("\n "+ obj.idProducto + " - " + obj.Descripcion + " x " + obj2.Cantidad);
         	   //System.out.println("Precio unitario: $" + obj.PrecioUnitario + " Precio x " + obj2.Cantidad + ": $" + (obj.PrecioUnitario*obj2.Cantidad));
            }
            System.out.println("	carrito.precio()=="+ Carrito.Total);
          //System.out.println("\nTotalCarrito:                         $"+ Carrito.Total);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    	
}
 