package sobrecarga;

import java.util.Random;

public class PokemonRayo extends Pokemon {
	

	public PokemonRayo(String nombre, String tipo, int vida) {
		super(nombre, tipo, vida);
		// TODO Auto-generated constructor stub
	}


	
	//lama el metodo madre y se utilza oara definir el metodo a atacar
	public void atacar(Pokemon objetivo) {
		Random r = new Random();
		if(r.nextInt(4) == 0) {
			System.out.println("Fallo");
		} else {
			System.out.println("Ataco");
			objetivo.recibirAtaque(100);
		}
		
	}

}
