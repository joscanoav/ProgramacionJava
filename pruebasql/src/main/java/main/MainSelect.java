package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conexion;
import entidades.Actor;

public class MainSelect {

	public static void main(String[] args) {

		// Para una consulta SELECT
		try (Connection connection = Conexion.open()) {
			// Connection connection = Conexion.open() - Si se hace la conexion de esta manera
			// connection.close(); si encaso ocurre un problema la conexion no se cierra y se hace manualmente
			String query = "SELECT * FROM actor";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				// PreparedStatement ps = connection.prepareStatement(query) - En formato Objeto
				// no se pone catch porque  ya esta catch
				
				try(ResultSet rs = ps.executeQuery()){
					
					while(rs.next()) {
						int id = rs.getInt("actor_id"); // rs.getInt(1)
						String nombre = rs.getString("actor_id");
						String apellido = rs.getString("last_name");
						String ultimaActualizacion = rs.getString("last_update");
						
						Actor newActor = new Actor(id, nombre, apellido, ultimaActualizacion);
						
						System.out.println(newActor.toString());
					}
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
