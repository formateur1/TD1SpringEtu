package com.inti.service;

import org.springframework.stereotype.Service;

import com.inti.model.Professeur;

@Service
public interface IProfesseurService {
	
	public void saveProfesseur(Professeur p);

}
