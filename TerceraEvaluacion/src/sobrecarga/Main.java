package sobrecarga;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemonGenerico = new Pokemon("juan","planta",200);
		PokemonRayo pikachu = new PokemonRayo("Pikachu","rayo",200);
	
		pokemonGenerico.atacar(pikachu);// Ataca con 0
		//2 atacaques de pikachi ala pokemon generico (prob.2)
		pikachu.atacar(pokemonGenerico);
		
		pikachu.atacar(pokemonGenerico);
	
	}

}
