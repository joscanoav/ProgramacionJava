package compraEntradasCine;
import java.util.Scanner;

public class CineMain {

	public static void main(String[] args) {
		
		Pelicula pelicula1 = new Pelicula("Titanic",180,10.0,"18:00");
		Pelicula pelicula2 = new Pelicula("Matrix",150,12.0,"20:30");
		
		Butaca[][] butacasSala1 = new Butaca[5][10];
		Butaca[][] butacasSala2 = new Butaca[5][10];
		
		
		// Recorrer cada butaca y crean nuevo objeto butaca para inicializar
		for(int i= 0; i < 5; i++) {
			for(int j=0;j<10;j++) {
				butacasSala1[i][j] = new Butaca();
			}
		}
		
		for( int i=0; i < 6; i++) {
			for(int j=0; j<12; j++) {
				butacasSala2[i][j]=new Butaca();
			}
		}
		
		Sala sala1 = new Sala(1,pelicula1,butacasSala1);
		Sala sala2 = new Sala(2, pelicula2, butacasSala2);
		
		// Se crea array llamado cine para crear dos salas 
		
		Sala[] salas = {sala1, sala2};
		
		Cine cine = new Cine("Cine Planet",50,salas);
		//Realizar operaciones en el cine
		Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== Men� Principal ===");
            System.out.println("1. Visualizar informaci�n del cine");
            System.out.println("2. Realizar compra de entradas");
            System.out.println("3. Consultar disponibilidad");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opci�n deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cine.visualizarInformacion();
                    break;
                case 2:
                    cine.realizarCompra();
                    break;
                case 3:
                    cine.consultarDisponibilidad();
                    break;
                case 4:
                    System.out.println("�Hasta luego!");
                    break;
                default:
                    System.out.println("Opci�n no v�lida. Int�ntelo de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}