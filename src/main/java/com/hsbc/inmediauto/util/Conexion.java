package com.hsbc.inmediauto.util;
import java.sql.*;

public class Conexion {
    public void connectDatabase() {
        try {
            // Registramos el driver de PostgresSQL
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection conex = null;
            // Conectamos con la base de datos
            conex = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/",
                    "postgres", "Mauricio1022");
 
            boolean valid = conex.isValid(50000);
            System.out.println(valid ? "Conexion exitosa" : "Conexion fallida");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    } 
    
}
