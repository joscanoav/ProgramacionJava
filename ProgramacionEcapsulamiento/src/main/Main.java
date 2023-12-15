package main;

import java.util.Scanner;

import objeto.Pokemon;
import objeto.TipoPokemon;

public class Main {

	public static void main(String[] args) {

		Pokemon pokemon1 = new Pokemon("Charmander",TipoPokemon.FUEGO,1,-100);
		Pokemon pokemon2 = new Pokemon("Pikachu",TipoPokemon.ELECTRICO,10,300);
		Scanner scanner = new Scanner(System.in);
		Pokemon pokemon3 = new Pokemon();
		
		System.out.println("Introduce el nombre: ");
		
		/*
		System.out.println(pokemon1.getHP());
		System.out.println(pokemon2.getHP());
		
		pokemon1.setHP(150);
		System.out.println(pokemon1.getHP());
		System.out.println();*/
		
		pokemon3.setNombre(scanner.nextLine());
		
	}

}

