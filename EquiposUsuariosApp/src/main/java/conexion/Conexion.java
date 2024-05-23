package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/equipos"; // Cambia 'sakila' a 'equipos' si es necesario
    private static final String USUARIO = "root";
    private static final String PASSWORD = "1964564651";

    public static Connection open() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", USUARIO);
        props.setProperty("password", PASSWORD);
        return DriverManager.getConnection(URL, props);
    }
}