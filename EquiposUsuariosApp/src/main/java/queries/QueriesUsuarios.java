package queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import conexion.Conexion;
import entidades.Usuario;

public class QueriesUsuarios {

    public static List<Usuario> obtenerUsuariosOrdenadosPorCategoria() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario ORDER BY categoria DESC";
        
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getInt("id_equipo"), rs.getInt("categoria")));
            }
        }
        
        return usuarios;
    }

    public static List<String> obtenerLideresAlfabeticamente() throws SQLException {
        List<String> lideres = new ArrayList<>();
        String sql = "SELECT SUBSTRING_INDEX(nombre, ' ', -1) AS apellido FROM usuario WHERE categoria = 1 ORDER BY apellido";
        
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                lideres.add(rs.getString("apellido"));
            }
        }
        
        return lideres;
    }

    public static void insertarUsuario(String nombre, int idEquipo, int categoria) throws SQLException {
        String sql = "INSERT INTO usuario (nombre, id_equipo, categoria) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            pstmt.setInt(2, idEquipo);
            pstmt.setInt(3, categoria);
            pstmt.executeUpdate();
        }
    }

    public static void eliminarUsuariosPorCategoria(int categoria) throws SQLException {
        String sqlEliminar = "DELETE FROM usuario WHERE categoria = ?";
        String sqlActualizar = "UPDATE usuario SET categoria = categoria - 1 WHERE categoria > ?";
        
        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmtEliminar = conn.prepareStatement(sqlEliminar);
             PreparedStatement pstmtActualizar = conn.prepareStatement(sqlActualizar)) {
            
            pstmtEliminar.setInt(1, categoria);
            pstmtEliminar.executeUpdate();

            pstmtActualizar.setInt(1, categoria);
            pstmtActualizar.executeUpdate();
        }
    }
}