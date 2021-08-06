package pokemon.concrete;

import pokemon.abstracts.PokemonTerrestre;

public class PokemonSportif extends PokemonTerrestre {
	private int puls;
	
	public PokemonSportif(String nom, int poids, int nbPattes, double taille, int puls) {
		super(nom, poids, nbPattes, taille);
		this.puls = puls;
	}

	@Override
	public String activite() {
		return "ma fréquence cardiaque est de " + puls +" pulsations à la minute";
	}

}
