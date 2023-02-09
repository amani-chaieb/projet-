package tn.enig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.enig.dao.IGestion;
import tn.enig.model.Affectation;
import tn.enig.model.Enseignant;
import tn.enig.model.Matiere;

@Controller
public class AppController {
	@Autowired
	IGestion dao;
	
	@GetMapping("/enseignants")
	public String f1(Model m) {
		List<Enseignant> lens=dao.getAllEnseignants();
		m.addAttribute("list_enseignants",lens);
		return "enseignants";
		
	}
	@GetMapping ("/matiere")
		public String f2(Model f) {
			List<Matiere> liste_matiere=dao.getAllMatieres();
			f.addAttribute("liste_matiere", liste_matiere);
			return "matiere";
		}
	@GetMapping("/Affectations")
	public String f3(Model m) {
		List<Affectation> list_affectation=dao.getAllAffectation();
		m.addAttribute("liste_affectation",list_affectation);
		return "Affectations";
	}
	@GetMapping("/addEnseignants")
	public String f5(Model m) {
		Enseignant ens=new Enseignant();
		m.addAttribute("e",ens);
		List<Enseignant> listEns=dao.getAllEnseignants();
		m.addAttribute("ls_ens",listEns);
		return "ajout_ens";
		}
	@GetMapping("/save")
	public String f4(Model m, @ModelAttribute("e") Enseignant e) {
		dao.addEnseignant(e);
		return "redirect:/enseignants";


		
	}
	
	
	

}
