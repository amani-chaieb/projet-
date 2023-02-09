package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@Repository
public class GestionImp implements IGestion {
	
	@Autowired
	@Qualifier("dataSource")
	DataSource base;

	public List<Enseignant> getAllEnseignants() {
		List<Enseignant> engs=null;
		try {
			engs=new ArrayList<Enseignant>();
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select* from enseignant");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Enseignant e=new Enseignant (rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),rs.getInt("charge"));
				engs.add(e);
			}
			
		}catch(Exception e) {
			
		}
		
		return engs;
	}

	public List<Matiere> getAllMatieres() {
		List<Matiere> mat=new ArrayList<Matiere>();
		try {
		 
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select* from matiere");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Matiere m=new Matiere (rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4));
				mat.add(m);
			}
			
		}catch(Exception e) {
			
		}
		
		return mat;
	}

	public List<Affectation> getAllAffectation() {
		List<Affectation> affect=new ArrayList<Affectation>();
		try {
		     
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select* from affectation");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				 Affectation a=new Affectation (rs.getInt(1),this.getMatiereById(rs.getInt(2)),this.getEnseignantById(rs.getInt(3)),rs.getInt(4));
				
			
			     affect.add(a);
			}
			
		}catch(Exception e) {
			
		}
		
		return affect ;
	}

	public void addEnseignant(Enseignant e) {
		
		try {
			Connection cn=base.getConnection();
			PreparedStatement ps=cn.prepareStatement("insert into enseignant values (null,?,?,?)");
			ps.setString(1,e.getNom());
			ps.setString(2, e.getPrenom());
			ps.setInt(3, e.getCharge());
			
			
		}catch(Exception E) {
			
		}
		
	}

	public void addMatiere(Matiere m) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAffectation(int id) {
		// TODO Auto-generated method stub
		
	}

	public void affectMatiereToEns(Matiere m) {
		// TODO Auto-generated method stub
		
	}

	public Matiere getMatiereById(int id) {
		Matiere m=new Matiere();
		try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select * from matiere where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				m.setId(rs.getInt(1));
				m.setTitre(rs.getString(2));
				m.setNiveau(rs.getString(3));
				m.setNbHeure(rs.getInt(4));}
				
			
		}catch(Exception e) {
			
		}
		return m;
	}

	public Enseignant getEnseignantById(int id) {
		Enseignant enseignant=null;
		try {
			Connection cnx=base.getConnection();
			PreparedStatement ps=cnx.prepareStatement("select * from enseignant where id= ?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				enseignant=new Enseignant (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
			
		}catch(Exception e) {
			
		}
		return enseignant;
	}
	
	

	

}
