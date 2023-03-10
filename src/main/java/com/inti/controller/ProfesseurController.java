package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inti.model.Etudiant;
import com.inti.model.Professeur;
import com.inti.service.IProfesseurService;

@Controller
@RequestMapping("professeur")
public class ProfesseurController {
	
	@Autowired
	IProfesseurService ips;
	
	@GetMapping("inscriptionP")
	public String inscriptionProfesseur()
	{
		return "inscriptionP";
	}
	
	@PostMapping("saveProfAvecForm")
	public String enregistrerProf(@ModelAttribute("prof") Professeur p)
	{
		ips.saveProfesseur(p);
		
		return "redirect:/professeur/inscriptionP";
	}

}
