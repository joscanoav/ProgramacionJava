package compraEntradasCine;
import java.util.Scanner;
public class Cine {
	//Se crean los atributos para la clase nombre aforo y sala
	private String nombre;
	private int aforo;
	private Sala[] salas;
	
	// Se generan los constructores con los valores para inicializar los valores
	// nombre del cine, el aforo total y un arreglo de salas como par�metros
	public Cine(String nombre, int aforo, Sala[] salas) {
		this.nombre = nombre;
		this.aforo = aforo;
		this.salas = salas;
	}
	// Se registra el primer metodo void ya que no devuelve ningun
	//valor, solo es imprimir informacion
	// En este caso no es static lo que implica que 
	// debe ser llamado a traves de la instancia cine
	//Si fuera estatico se llamaria directamente
	//Cine miCine = new Cine("Cine Ejemplo", 100, salas);
	//miCine.visualizarInformacion();
	// Llamada directa a un m�todo est�tico
	//Cine.visualizarInformacion();
	//Como visializarInformacion necesita acceder atributos
	//Necesita que no sea estatico
	
	public void visualizarInformacion() {
		System.out.println("Nombre del cine: " + nombre);
		System.out.println("Aforo total " + aforo);
		
		for (Sala sala : salas) {
			System.out.println("Sala " + sala.getId() + ":");
			System.out.println("Pelicula: " + sala.getPelicula().getTitulo());
			System.out.println("Duracion: " + sala.getPelicula().getDuracion() + " minutos");
			System.out.println("Precio de entrada: $" + sala.getPelicula().getPrecioEntrada());
	        System.out.println("Horario: " + sala.getPelicula().getHorario());
		}

	}
	
	//Este metodo permite al usuario la disponibilidad
	//de asientos en una sala
	
	public void realizarCompra() {
		Scanner scanner = new Scanner(System.in);
		visualizarInformacion();
	       System.out.println("\n=== Realizar Compra ===");
	        System.out.println("1. Ver salas y datos de pel�culas");
	        System.out.println("2. Elegir sala y butaca para reservar");
	        System.out.println("3. Ver la matriz con asientos libres/ocupados de una sala concreta");
	        System.out.println("4. Salir");
	        System.out.print("Ingrese la opci�n deseada: ");
	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	               visualizarInformacion();
	                break;
	            case 2:
	            	System.out.println("Ingrese el n�mero de la sala:");
	                int salaId = scanner.nextInt();

	                Sala salaSeleccionada = getSalaById(salaId);

	                if (salaSeleccionada == null) {
	                    System.out.println("Sala no encontrada. Reserva cancelada.");
	                    return;
	                }

	                salaSeleccionada.mostrarAsientos();

	                System.out.println("Ingrese la fila de la butaca:");
	                int fila = scanner.nextInt();

	                System.out.println("Ingrese la columna de la butaca:");
	                int columna = scanner.nextInt();

	                // Verificar disponibilidad y realizar reserva
	                if (salaSeleccionada.reservarButaca(fila, columna, "correo@ejemplo.com")) {
	                    System.out.println("Reserva exitosa. �Disfrute de la pel�cula!");
	                } else {
	                    System.out.println("La butaca no est� disponible para reserva. Int�ntelo de nuevo.");
	                }
	                break;
	            case 3:
	                consultarDisponibilidad();
	                // L�gica para ver la matriz con asientos libres/ocupados de una sala concreta
	                break;
	            case 4:
	                System.out.println("Compra cancelada. �Hasta luego!");
	                return;
	            default:
	                System.out.println("Opci�n no v�lida. Int�ntelo de nuevo.");
	                break;
	    }
	}
	
		//Metodo para que un usuario consulte la disponibilidad de asiento
	
	public void consultarDisponibilidad() {
		Scanner scanner = new Scanner(System.in);
		visualizarInformacion();
		//seleccionar sala
		System.out.println("Ingrese el numero de la sala");
		int salaId = scanner.nextInt();
		
		Sala salaSeleccionada = getSalaById(salaId);
		
		if(salaSeleccionada == null) {
			System.out.println("Sala no encontrada. Consulta cancelada");
			return;
		}
		
		// Mostrar matriz de asientos
		salaSeleccionada.mostrarAsientos();
	}
	
	//Metodo para obtener una sala por su ID
	
	private Sala getSalaById(int id) {
		for (Sala sala : salas) {
			if(sala.getId()==id) {
				return sala;
			}
		}
		return null;
	}
	
}
