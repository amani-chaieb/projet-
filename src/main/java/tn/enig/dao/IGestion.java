package tn.enig.dao;

import java.util.List;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

public interface IGestion {
	public List <Enseignant>getAllEnseignants();
	public List<Matiere>getAllMatieres();
	public List<Affectation>getAllAffectation();
	public void addEnseignant(Enseignant e);
	public void addMatiere(Matiere m);
	public void deleteAffectation(int id);
	public void affectMatiereToEns(Matiere m);
	public Matiere getMatiereById(int id);
	public Enseignant getEnseignantById(int id);

	

}
