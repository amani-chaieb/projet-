package tn.enig.model;

public class Matiere {
	private int id;
	private String titre;
	private String niveau;
	private int NbHeure;
	public Matiere() {
		super();
	
	}
	public Matiere(int id, String matiere, String niveau, int nbHeure) {
		super();
		this.id = id;
		this.titre = matiere;
		this.niveau = niveau;
		this.NbHeure = nbHeure;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String matiere) {
		this.titre = matiere;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public int getNbHeure() {
		return NbHeure;
	}
	public void setNbHeure(int nbHeure) {
		this.NbHeure = nbHeure;
	}
	

}
