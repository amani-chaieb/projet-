package tn.enig.model;

public class Affectation {
	private int id;
	private Matiere mat;
	private Enseignant ens;
	private int NBheure;
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Affectation(int id, Matiere mat, Enseignant ens,int nb) {
		super();
		this.id = id;
		this.mat = mat;
		this.ens = ens;
		this.NBheure=nb;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Matiere getMat() {
		return mat;
	}
	public void setMat(Matiere mat) {
		this.mat = mat;
	}
	public Enseignant getEns() {
		return ens;
	}
	public void setEns(Enseignant ens) {
		this.ens = ens;
	}
	public int getNBheure() {
		return NBheure;
	}
	public void setNBheure(int nBheure) {
		NBheure = nBheure;
	}
	
	

}
