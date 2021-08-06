package pokemon.abstracts;

public abstract class Pokemon {
	private String nom;
	private int poids;

	public Pokemon(String nom, int poids) {
		this.nom = nom;
		this.poids = poids;
	}

	public int getPoids() {
		return poids;
	}
	
	public abstract double vitesse();
	
	@Override
	public String toString() {
		return String.format("Je suis le Pokémon %s, mon poids est de %s kg, ma vitesse est de %s km/h", nom, poids, vitesse());
	}
}
