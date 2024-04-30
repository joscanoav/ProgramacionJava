package queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import entidades.Cliente;

public class ClienteQueries {

	public static ArrayList<Cliente> getAllClientes(){
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		// Para una consulta SELECT
		try (Connection connection = Conexion.open()) {
			// Connection connection = Conexion.open() - Si se hace la conexion de esta manera
			// connection.close(); si encaso ocurre un problema la conexion no se cierra y se hace manualmente
			String query = "SELECT * FROM cliente";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				// PreparedStatement ps = connection.prepareStatement(query) - En formato Objeto
				// no se pone catch porque  ya esta catch
				
				try(ResultSet rs = ps.executeQuery()){
					
					while(rs.next()) {
						int id = rs.getInt("id"); // rs.getInt(1)
						String nombre = rs.getString("nombre");
						Cliente newCliente = new Cliente(id, nombre);
						System.out.println(newCliente);
						clientes.add(newCliente);
					}
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return clientes;
	}

}

