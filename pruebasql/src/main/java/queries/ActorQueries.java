package queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;
import entidades.Actor;

public class ActorQueries {

	public static ArrayList<Actor> getAllActores(){
		ArrayList<Actor> actores = new ArrayList<Actor>();

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
						String nombre = rs.getString("first_name");
						String apellido = rs.getString("last_name");
						String ultimaActualizacion = rs.getString("last_update");
						
						Actor newActor = new Actor(id, nombre, apellido, ultimaActualizacion);
						
						System.out.println(newActor);
						actores.add(newActor);
					}
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return actores;
	}

	
	//static para que siga siendo estico y publico
	
	public static ArrayList<Actor> getActorBySearch(String pattern){
		
		ArrayList<Actor> actores = new ArrayList<Actor>();

		try (Connection connection = Conexion.open()) {
			String query = "SELECT * FROM actor WHERE first_name LIKE ?";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				ps.setString(1, "%" + pattern + "%"); // Sustituye la primera ? (1 -> 1ª desde la izquierda) por pattern

				try(ResultSet rs = ps.executeQuery()){
					
					while(rs.next()) {
						int id = rs.getInt("actor_id"); // rs.getInt(1)
						String nombre = rs.getString("first_name");
						String apellido = rs.getString("last_name");
						String ultimaActualizacion = rs.getString("last_update");
						
						Actor newActor = new Actor(id, nombre, apellido, ultimaActualizacion);
						
						System.out.println(newActor);
						actores.add(newActor);
					}
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return actores;
		
	}
	
	public static Actor getActorByID(int id) {
		
		Actor actor = null;

		try (Connection connection = Conexion.open()) {
			String query = "SELECT * FROM actor WHERE actor_id=?";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				ps.setInt(1, id); // Sustituye la primera ? (1 -> 1ª desde la izquierda) por pattern

				try(ResultSet rs = ps.executeQuery()){
					
					if(rs.next()) {
						int idKey = rs.getInt("actor_id"); // rs.getInt(1)
						String nombre = rs.getString("first_name");
						String apellido = rs.getString("last_name");
						String ultimaActualizacion = rs.getString("last_update");
						
						actor = new Actor (idKey, nombre, apellido, ultimaActualizacion);
						
					}
					
				}
			}
			
		} catch (SQLException e) {
			System.err.println("ERROR:");
			e.printStackTrace();
		}
		
		return actor;
		
	}
	
	public static boolean insertActor(Actor newActor) {
		boolean flag= false;
		
		try (Connection connection = Conexion.open()) {
		String query = "INSERT INTO actor VALUES(NULL, ?,?,?)";
		
		try (PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){ //.JAVA.SQL
			ps.setString(1, newActor.getNombre());
			ps.setString(2, newActor.getApellido());
			ps.setString(3, newActor.getUltimaActualizacion());
			
			int nRows = ps.executeUpdate();// devuelve en filas a insertar.
			
			flag = nRows == 1;// Si nos da un uno estaria bien
			
			// Esta parte es para obtener la clave primaria del nuevo actor.
			ResultSet generatedKeys = ps.getGeneratedKeys();
			
			if(generatedKeys.next()) {
				int newActorKey = generatedKeys.getInt(1);
				System.out.println("Clave del Actor insertado: " + newActorKey);
			}
			
		}
		
		} catch (SQLException e) {
			System.err.println("ERROR:");
			e.printStackTrace();
		}
		
		return flag;
	}
	
	//-------
	
	public static Actor deleteActorByID(int id) {
		
		Actor actor = null;

		try (Connection connection = Conexion.open()) {
			String query = "DELETE * FROM actor WHERE actor_id=?";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				ps.setInt(1, id); // Sustituye la primera ? (1 -> 1ª desde la izquierda) por pattern


			}
			
		} catch (SQLException e) {
			System.err.println("ERROR:");
			e.printStackTrace();
		}
		
		return actor;
		
	}
	
	
	
	
}
