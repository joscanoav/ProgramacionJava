package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
	//Estatico porque todos comparten el mismo URL si cambio algo todos cambias
	// Coche 1 = A Coche 2 = B si cambio letra todos cambias
	// Final porque es constante.
	// //127.0.0.1:3306 localhost se puede conectar a cualquier base de dato
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/sakila";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "1964564651";
	
	public static Connection open() throws SQLException {
		Properties props = new Properties();
		props.setProperty("user", USUARIO);
		props.setProperty("password", PASSWORD);
		//props.setProperty("ssl", "true");
		// getConnection() devuelve un objeto Connection
		// Connection nos permite establecer conexion y hacer consultas
		return DriverManager.getConnection(URL, props);
	}
	
}
