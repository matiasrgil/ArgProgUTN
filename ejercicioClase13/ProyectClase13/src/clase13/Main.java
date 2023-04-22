package clase13;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class Main {

	private static final String PrepareStatement  = null;

	public static void main(String[] args) {

		Conexion1();
		
	}
	
	public static void Conexion1() { 
		
		try {
			Conexion conexion2= new Conexion();
			Connection conexion= conexion2.getConnection();
			
			String insertar= "INSERT INTO empleados (dni, nombre, apellido, nacionalidad, depto)\n "+ "VALUES" + "(?,?,?,?,?)";
			
			PreparedStatement ps= conexion.prepareStatement(insertar);
			
			ps.setInt(1, 36563241);
			ps.setString(2, "Emilse");
			ps.setString(3, "Yanstensqui");
			ps.setString(4, "Ucraniana");
			ps.setString(5,"logistica");
			
			String modNacionalidad= "update empleados\r\n"
					+ "set nacionalidad= 'Brasil'\r\n"
					+ "where idEmpleado= '2'";
			
			PreparedStatement ps1= conexion.prepareStatement(modNacionalidad);
			
			String borrarDato = "DELETE from Empleado\r\n"+ "WHERE depto=mantenimiento";
			
			PreparedStatement ps2= conexion.prepareStatement(borrarDato);
			
			String empleadosCompra= "select nombre, apellido\r\n"
					+ "from Empleado\r\n"
					+ "where depto= 'logistica'";
			
			Statement ps3 = conexion.createStatement();
			
			String mostrarDepartamentos= "select * from Empleado\r\n" ;
			
			Statement ps4 = conexion.createStatement();
			
			ResultSet res1 = ps4.executeQuery(mostrarDepartamentos);
			
			while(res1.next()) {
				
				System.out.println("El empleado " + res1.getString("Nombre") + " "+ res1.getString("apellido")+ " se encuentra en el departamento de "+ res1.getString("depto"));
			}		
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
			
			
		}
			
	}
}
