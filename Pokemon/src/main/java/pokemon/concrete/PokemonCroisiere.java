package pokemon.concrete;

public class PokemonCroisiere extends PokemonMarin {

	public PokemonCroisiere(String nom, int poids, int Nageoires) {
		super(nom, poids, Nageoires);
	}

	@Override
	public double vitesse() {
		return (double) super.vitesse()/ 2;
	}
}
