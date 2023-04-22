package clase13;

import java.sql.*;

public class Conexion {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String servidor = "jdbc:mysql://localhost:3306/";
	private String bbdd = "Qatar2022";
	private String usuario = "root";
	private String clave = "31080205";

	private Connection con;

	public void Conexion() {

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(servidor + bbdd, usuario, clave);

			System.out.println("La coonexion fue exitosa \n");

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Error, la conexion fallo");

		}
	}

	public Connection getConnection() {
		Conexion();

		return con;
	}
}