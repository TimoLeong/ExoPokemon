package pokemon.concrete;

import pokemon.abstracts.PokemonTerrestre;

public class PokemonCasanier extends PokemonTerrestre {
	private int tempsTV;

	public PokemonCasanier(String nom, int poids, int nbPattes, double taille, int tempsTV) {
		super(nom, poids, nbPattes, taille);
		this.tempsTV = tempsTV;
	}

	@Override
	public String activite() {
		return "je regarde la télé " + tempsTV + "h par jour";
	}

}
