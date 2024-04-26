package inventario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void imprimirInventario(String rutaCarpeta) throws IOException {
        String archivo = rutaCarpeta + "/inventario.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            double valorTotalInventario = 0;
            for (Producto producto : productos) {
                writer.write(producto.toString());
                writer.write("\n");
                valorTotalInventario += producto.obtenerValorTotal();
            }
            writer.write("Valor Total del Inventario: $" + String.format("%.2f", valorTotalInventario));
        }
    }
}
