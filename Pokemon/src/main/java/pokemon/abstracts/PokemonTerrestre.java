package pokemon.abstracts;

public abstract class PokemonTerrestre extends Pokemon {
	private int nbPattes;
	private double taille;
	
	public PokemonTerrestre(String nom, int poids, int nbPattes, double taille) {
		super(nom, poids);
		this.nbPattes = nbPattes;
		this.taille = taille;
	}

	public abstract String activite();
	
	@Override
	public double vitesse() {
		return (double) nbPattes * taille * 3;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(", j'ai %s pattes, ma taille est de %s m et %s", nbPattes, taille, activite());
	}
}
