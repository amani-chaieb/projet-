package tn.enig.model;

/**
 * @author LENOVO
 *
 */
public class Enseignant {
	private int id;
	private String nom;
	private String prenom;
	private int charge;
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(int id, String nom, String prenom, int charge) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.charge = charge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	

}
