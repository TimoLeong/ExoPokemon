package pokemon.test;

import pokemon.collection.CollectionPokemons;
import pokemon.concrete.PokemonCroisiere;
import pokemon.concrete.PokemonSportif;

public class Launcher {
	
	public static void main(String[] args) {
		PokemonSportif pikachu = new PokemonSportif("Pikachu", 18, 2, 0.85, 120);
		System.out.println(pikachu);
		
		PokemonCroisiere bulbizarre = new PokemonCroisiere("Bulbizarre", 15, 3);
		System.out.println(bulbizarre);
		
		CollectionPokemons collec = new CollectionPokemons();
		collec.inserer(pikachu);
		collec.inserer(bulbizarre);
		
		System.out.println(collec);
		System.out.println(collec.moyenneVitesse());
	}
}
