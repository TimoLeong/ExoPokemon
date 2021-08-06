package pokemon.concrete;

import pokemon.abstracts.PokemonTerrestre;

public class PokemonSportifs extends PokemonTerrestre {
	
	private int pulsations;
	
	public PokemonSportifs(String nom, int poids, int nbPattes, double taille, int pulsations) {
		super(nom, poids, nbPattes, taille);
		this.pulsations = pulsations;
	}

	@Override
	public String activite() {
		return " ma fréquence cardiaque est de " + pulsations + " pulsations à la minute";
	}
}
