package com.inti.service;

import org.springframework.stereotype.Service;

import com.inti.model.Professeur;

@Service
public class ProfesseurServiceImpl implements IProfesseurService {

	@Override
	public void saveProfesseur(Professeur p) {
		try
		{
			EtudiantServiceImpl.session.beginTransaction();
			
			EtudiantServiceImpl.session.save(p);
			
			EtudiantServiceImpl.session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
			EtudiantServiceImpl.session.getTransaction().rollback();
		}

	}

}
