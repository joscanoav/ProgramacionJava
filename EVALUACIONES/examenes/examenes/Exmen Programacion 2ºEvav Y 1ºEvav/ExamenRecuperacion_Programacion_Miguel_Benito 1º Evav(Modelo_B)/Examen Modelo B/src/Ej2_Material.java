

public class Ej2_Material {
    String nombre;
    String tipo;

    double cantidad = 0;  // De basee la cantidad de los productos sera 10

    public Ej2_Material(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getProducto(){
        return cantidad;
    }

    public void setProducto(double Valor){
        cantidad = Valor + cantidad;
        
    }
    public void usarProducto(double Valor){
        cantidad = Valor - cantidad;
        
    }

    public String getNombreMaterial(){
        return nombre;
    }

    public String getTipoMaterial(){
        return tipo;
    }
}
