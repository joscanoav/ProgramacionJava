package queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import conexion.Conexion;
import entidades.Equipo;

public class QueriesEquipo {

    public static List<Equipo> obtenerEquipos() throws SQLException {
        List<Equipo> equipos = new ArrayList<>();
        String sql = "SELECT * FROM equipo";
        
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                equipos.add(new Equipo(rs.getInt("id"), rs.getString("nombre")));
            }
        }
        
        return equipos;
    }

    public static void insertarEquipo(String nombre) throws SQLException {
        String sql = "INSERT INTO equipo (nombre) VALUES (?)";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
        }
    }
}