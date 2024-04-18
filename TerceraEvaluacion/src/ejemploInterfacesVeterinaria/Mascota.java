package ejemploInterfacesVeterinaria;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public abstract class Mascota {
	private String nombre;
	private String especie;
	private int edad;
	private LocalDate fechaNacimiento;
	
	/*Se utiliza un Set<Vacuna> por las siguientes razones:
	Evitar duplicados: Cada vacuna debe ser �nica para una mascota. Un Set garantiza que no se a�adan dos vacunas iguales, lo que evita confusiones y errores en la gesti�n de las vacunas.
	Eficiencia de b�squeda: El uso de un Set permite buscar r�pidamente una vacuna espec�fica en la colecci�n utilizando la operaci�n contains().
	Orden no relevante: Las vacunas no tienen un orden espec�fico en la colecci�n. Un Set no garantiza ning�n orden espec�fico para los elementos.*/
	
	private Set<Vacuna> vacunas;

	public Mascota(String nombre, String especie, int edad, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
/*Se utiliza una implementaci�n HashSet<>() por las siguientes razones:

Rendimiento: HashSet es una de las implementaciones de Set m�s eficientes en Java, especialmente para operaciones de b�squeda y adici�n.
Simplicidad: HashSet es una implementaci�n simple y f�cil de usar.
Ausencia de orden: Dado que el orden de las vacunas no es relevante en este caso, HashSet es una opci�n adecuada.*/
		
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

	
	
	
}
