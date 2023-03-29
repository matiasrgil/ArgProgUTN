package Clase5;

public class Producto {
	public double Precio;
	public int idProducto;
	public int cantidad;
	public String Descripcion;
	
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	/*
	public boolean hayStock() {
		boolean Resultado = cantidad > 0 ? true : false;
		return Resultado;
	}
*/
}
