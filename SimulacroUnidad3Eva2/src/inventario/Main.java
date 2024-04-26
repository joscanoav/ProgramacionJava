package inventario;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto manzanas = new Producto("Manzanas", 10, 0.50);
        Producto naranjas = new Producto("Naranjas", 20, 0.75);
        Producto platanos = new Producto("Plátanos", 15, 0.40);

        inventario.agregarProducto(manzanas);
        inventario.agregarProducto(naranjas);
        inventario.agregarProducto(platanos);

        try {
            inventario.imprimirInventario("C:\\DAN\\DAM\\ProgramacionJava\\SimulacroUnidad3Eva2");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

