package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import conexion.Conexion;

import queries.Queries;

public class MainSelect {

    public static void main(String[] args) {
            try (Connection conexion = ConexionBD.conectar()) {
                Scanner scanner = new Scanner(System.in);

                // Muestra los equipos y el n�mero de usuarios por equipo
                QueriesEquipo.mostrarEquiposYNumeroUsuarios(conexion);

                // Muestra los apellidos de los l�deres de equipo
                QueriesEquipo.mostrarLideresPorApellido(conexion);

                // Muestra los usuarios ordenados por categor�a de mayor a menor
                QueriesUsuarios.mostrarUsuariosPorCategoria(conexion);

                // Inserta un nuevo equipo
                System.out.print("Ingrese el nombre del nuevo equipo: ");
                String nombreEquipo = scanner.nextLine();
                Equipo.insertarNuevoEquipo(conexion, nombreEquipo);

                // Inserta un nuevo usuario
                System.out.print("Ingrese el nombre del nuevo usuario: ");
                String nombreUsuario = scanner.nextLine();
                System.out.print("Ingrese el id del equipo del nuevo usuario: ");
                int idEquipoUsuario = scanner.nextInt();
                System.out.print("Ingrese la categor�a del nuevo usuario: ");
                int categoriaUsuario = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva l�nea pendiente
                Usuario.insertarNuevoUsuario(conexion, nombreUsuario, idEquipoUsuario, categoriaUsuario);

                // Elimina usuarios por categor�a y ajusta las categor�as de los usuarios restantes
                System.out.print("Ingrese la categor�a de los usuarios que desea eliminar: ");
                int categoriaEliminar = scanner.nextInt();
                QueriesUsuarios.eliminarUsuariosPorCategoria(conexion, categoriaEliminar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }