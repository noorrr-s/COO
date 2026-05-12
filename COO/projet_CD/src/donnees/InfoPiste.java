package donnees;
public class InfoPiste {
	private String nomPiste;
	private int dureeMillisecondes;

	public InfoPiste(String nom, int duree) {
		this.nomPiste = nom;
		this.dureeMillisecondes = duree;
	}

	public String getNomPiste() {
		return nomPiste;
	}

	public int getDureeMillisecondes() {
		return dureeMillisecondes;
	}

	public String dureeEnMinutes(int millisecondes) {
		int totalSecondes = millisecondes / 1000;
		int minutes = totalSecondes / 60;
		int secondes = totalSecondes % 60;
		return minutes + " min " + secondes + " s";
	}

	@Override
	public String toString() {
		return nomPiste + " (" + dureeEnMinutes(dureeMillisecondes) + ")";
	}
}