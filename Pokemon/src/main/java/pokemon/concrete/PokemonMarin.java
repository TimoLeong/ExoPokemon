package pokemon.concrete;

import pokemon.abstracts.Pokemon;

public class PokemonMarin extends Pokemon {
	private int Nageoires;	
	
	public PokemonMarin(String nom, int poids, int Nageoires) {
		super(nom, poids);
		this.Nageoires = Nageoires;
	}
	
	public int getNageoires() {
		return Nageoires;
	}

	public double vitesse() {
		return (double) getPoids()/25*Nageoires;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", j'ai %s nageoires", Nageoires);
	}
}
