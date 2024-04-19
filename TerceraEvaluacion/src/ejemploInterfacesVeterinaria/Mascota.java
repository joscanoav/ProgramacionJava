package ejemploInterfacesVeterinaria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Mascota {
	private String nombre;
	private String especie;
	private int edad;
	private LocalDate fechaNacimiento;
	
	/*Se utiliza un Set<Vacuna> por las siguientes razones:
	Evitar duplicados: Cada vacuna debe ser única para una mascota. Un Set garantiza que no se añadan dos vacunas iguales, lo que evita confusiones y errores en la gestión de las vacunas.
	Eficiencia de búsqueda: El uso de un Set permite buscar rápidamente una vacuna específica en la colección utilizando la operación contains().
	Orden no relevante: Las vacunas no tienen un orden específico en la colección. Un Set no garantiza ningún orden específico para los elementos.*/
	
	protected Set<Vacuna> vacunas;

	public Mascota(String nombre, String especie, int edad, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
/*Se utiliza una implementación HashSet<>() por las siguientes razones:

Rendimiento: HashSet es una de las implementaciones de Set más eficientes en Java, especialmente para operaciones de búsqueda y adición.
Simplicidad: HashSet es una implementación simple y fácil de usar.
Ausencia de orden: Dado que el orden de las vacunas no es relevante en este caso, HashSet es una opción adecuada.*/
		
		this.vacunas = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	
	   public Set<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(Set<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public void agregarVacuna(String nombreVacuna, LocalDate fechaAplicacion, String fabricante, int numeroDosis, List<String> contraindicaciones, boolean isRefuerzo) {
	        Vacuna vacuna = new Vacuna() {
	            @Override
	            public String getNombre() {
	                return nombreVacuna;
	            }

	            @Override
	            public LocalDate getFechaAplicacion() {
	                return fechaAplicacion;
	            }

	            @Override
	            public LocalDate getFechaProximaDosis() {
	                return null;
	            }

	            @Override
	            public String getFabricante() {
	                return fabricante;
	            }

	            @Override
	            public int getNumeroDosis() {
	                return numeroDosis;
	            }

	            @Override
	            public List<String> getContraindicaciones() {
	                return contraindicaciones;
	            }

	            @Override
	            public boolean isRefuerzo() {
	                return isRefuerzo;
	            }
	        };
	        vacunas.add(vacuna);
	    }

	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Especie: " + especie);
	        System.out.println("Edad: " + edad);
	        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
	        System.out.println("Vacunas:");
	        for (Vacuna vacuna : vacunas) {
	            System.out.println(" - " + vacuna.getNombre());
	        }
	    }

	    public Set<Vacuna> getVacunasVencidas() {
	        // Implementar la lógica para identificar y devolver las vacunas vencidas
	        return new HashSet<>();
	    }

	    abstract public void mostrarInformacionEspecifica();
	}
	