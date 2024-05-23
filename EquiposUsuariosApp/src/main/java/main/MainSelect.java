package main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import entidades.Equipo;
import entidades.Usuario;
import queries.QueriesEquipo;
import queries.QueriesUsuarios;

public class MainSelect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Mostrar equipos y n�mero de usuarios
            List<Equipo> equipos = QueriesEquipo.obtenerEquipos();
            for (Equipo equipo : equipos) {
                System.out.println("Equipo: " + equipo.getNombre());
                // Contar usuarios por equipo
                long count = QueriesUsuarios.obtenerUsuariosOrdenadosPorCategoria().stream()
                        .filter(usuario -> usuario.getIdEquipo() == equipo.getId())
                        .count();
                System.out.println("N�mero de usuarios: " + count);
            }

            // Mostrar l�deres ordenados por apellido
            System.out.println("L�deres de equipo (apellidos ordenados alfab�ticamente):");
            List<String> lideres = QueriesUsuarios.obtenerLideresAlfabeticamente();
            for (String apellido : lideres) {
                System.out.println(apellido);
            }

            // Mostrar todos los usuarios ordenados por categor�a
            System.out.println("Usuarios ordenados por categor�a (de mayor a menor):");
            List<Usuario> usuarios = QueriesUsuarios.obtenerUsuariosOrdenadosPorCategoria();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }

            // Insertar un nuevo equipo
            System.out.print("Introduce el nombre del nuevo equipo: ");
            String nuevoEquipo = scanner.nextLine();
            QueriesEquipo.insertarEquipo(nuevoEquipo);

            // Insertar un nuevo usuario
            System.out.print("Introduce el nombre del nuevo usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Introduce el ID del equipo del nuevo usuario: ");
            int idEquipo = scanner.nextInt();
            System.out.print("Introduce la categor�a del nuevo usuario: ");
            int categoriaUsuario = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de l�nea
            QueriesUsuarios.insertarUsuario(nombreUsuario, idEquipo, categoriaUsuario);

            // Eliminar usuarios por categor�a y actualizar categor�as
            System.out.print("Introduce la categor�a a eliminar: ");
            int categoriaEliminar = scanner.nextInt();
            QueriesUsuarios.eliminarUsuariosPorCategoria(categoriaEliminar);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
