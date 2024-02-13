package compraEntradasCine;

public class Butaca {
	private boolean ocupada;
	
	// Se genera el costructor de la clase Butaca
	// Se llama cuando se crea una nueva Butaca
	// Se genera un constructor sin parametros
	// Proporciona una forma predeterminada de inicializar una butaca sin tener que especificar su estado de ocupación
	// Butaca butaca = new Butaca(); Es util para espeficar desocuapada por defecto
	public Butaca() {
		//Al principio la butaca esta desocupada
		this.ocupada = false;
	}
	
	// Se crea el metodo para verificar si la butaca esta ocupada
	// A diferencia de una variable, los metodos realizan tareas o operaciones especificas
	//Este metodo no almacena datos, si no consulta si esta ocupada
	//Retorna un tipo booleano(True si esta ocupada o false si no lo esta)
	/*Butaca butaca = new Butaca();
	  boolean estaOcupada = butaca.isOcupada();
	  if (estaOcupada) {
      System.out.println("La butaca está ocupada.");
      } else {
      System.out.println("La butaca está desocupada.");
      }*/
	// este metodo devuelve un valor booleano
	public boolean isOcupada() {
		return ocupada;
	}
	
	//Se aplica metodo void para no delver un valor
	// Solo para al llamarlo cumplir la accion que tienen 
	
	public void ocupar() {
	 this.ocupada = true; // marcar ocupada	
	}
	
	public void desocupar() {
	  this.ocupada = false;// marcar desocupada
	}

	
	
	
	
	
	
}

