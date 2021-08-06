package pokemon.collection;

import java.util.ArrayList;

import pokemon.abstracts.Pokemon;

public class CollectionPokemons {
	private ArrayList<Pokemon> collection;
	
	public CollectionPokemons() {
		collection = new ArrayList<Pokemon>(0);
	}

	public void inserer(Pokemon pokemon) {
		collection.add(pokemon);
	}

	public double moyenneVitesse() {
		double moy = 0.;
		int compteur = 0;
		for (Pokemon pokemon : collection) {
			moy += pokemon.vitesse();
			compteur++;
		}
		moy = (double) moy/compteur;
		return moy;
	}
	
	@Override
	public String toString() {
		return collection.toString();
	}
}
