package com.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String URL = "jdbc:postgresql://localhost:5432/";
	static String USER = "postgres" ;
	static String PASS = "Mauricio1022";
	
	public Connection crearConexion() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conexion = DriverManager.getConnection(URL, USER, PASS);
		if (conexion != null){
		System.out.print("Conexion establecida...");
		return conexion;
		}else {
			System.out.println("Aun no se a creado posible");
			return null;	
		}
		} 

}
