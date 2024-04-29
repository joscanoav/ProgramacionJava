

import java.util.Scanner;

public class Ej2_Main {
    public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        
        Ej2_Material arcilla = new Ej2_Material("Arcilla","Gramos");
        Ej2_Material pintura = new Ej2_Material("Pintura","Litros");
        Ej2_Material varia = arcilla; // Inicializamos la variable varia (La cual permite elegir comodamente el producto)

                    

        double cantidad;
        int eleccion;
        int conNumeros;
        int jarras = 0;
            // Con NUMEROS, bucle de forma nueva, y cerrar teclado de forma nueva
        while (true) { //Boolean para terminar el programa 
            System.out.println("\n Por fabor elija: 1 Obtener productos, 2 Hacer una jarra, 3 Ver datos, 4 Salir");
        conNumeros = teclado.nextInt();
        
            switch (conNumeros){
                case 1:
                        System.out.println("\n Obtener Materia Prima 1 arcilla, 2 pintura");

                        eleccion = teclado.nextInt();
                        switch (eleccion ) {
                            case 1:
                            varia = arcilla;
                                break;
                            case 2:
                            varia = pintura;
                                break;
                            default: 
                                System.out.println("Error");
                                break;
                        }

                        if(eleccion >= 1 && eleccion <= 2){
                        System.out.println("Elija cantidad de: " + varia.getNombreMaterial() +" en "+ varia.getTipoMaterial());
                            cantidad = teclado.nextDouble();
                                varia.setProducto(cantidad);
                                System.out.println("Materia obtenida: " + varia.getNombreMaterial() + " Cantidad: " + cantidad + " " + varia.getTipoMaterial());
                        }else{
                            System.out.println("Error producto no disponible");
                        }
                        break;
                case 2:
                    System.out.println("Hacer una Jarra");
                    double arcUsar = 3.14;
                    double pintUsar = 1.2;

                    System.out.println("Elija cuantas quiere hacer: " + "\nCada jarra consume: Arcilla: " + arcUsar +" Pintura: " + pintUsar);
                    int nuevas = teclado.nextInt();
                    
                    arcUsar = nuevas * arcUsar;
                    pintUsar = nuevas * pintUsar;

                    if(arcilla.getProducto() < arcUsar || pintura.getProducto() < pintUsar){
                        System.out.println("Faltan materiales: (false)\n" +
                        "Pintura "+ pintura.getProducto() + " " + pintura.getTipoMaterial() +
                        "\n " + "Arcilla "+arcilla.getProducto() + " " + arcilla.getTipoMaterial());
                    }else{
                        arcilla.usarProducto(arcUsar);
                        pintura.usarProducto(pintUsar);
                        jarras += nuevas;
                        System.out.println("Jarras echas: (true)" + nuevas);
                    }

                    break;
                case 3:
                System.out.println("Cantidad arcilla: " + arcilla.getProducto() + "\nCantidad pintura: " +pintura.getProducto() + "\n Cantidad de jarras que hemos echo: " + jarras);
                    break;
                case 4:
                System.exit(0);
                    teclado.close();
                    break;
                default:
                        System.out.println("Error");
                    break;
            }

        }
        
	}
}


/*
Desarrolla un programa que permita gestionar una tienda de dulces.

La tienda vende 3 productos distintos: gofres (3,5 €/unidad), crepes (2,1 €unidad) y tortitas (2,8 €/unidad).

Cuando se arranca la aplicación comenzamos con 10 unidades de cada uno.

La persona que usa nuestro programa es el empleado de la tienda.

Tiene un menú con opciones:
Vender producto: el usuario nos dice cuál quiere y cuántas unidades.
Comprar producto: cuando se queden sin existencias en la tienda, 
pueden indicar qué producto reponer y cuántas unidades. 
El coste de compra es de 2.5 €/unidad para los gofres, 1.1 €/unidad para los crepes y 1.8 €/unidad para las tortitas.
Ver el dinero acumulado en la tienda: se suma cuando se vende y se resta cuando se compra stock.
Ver cuántas ventas y cuántas compras se han realizado (recuentos).
 */