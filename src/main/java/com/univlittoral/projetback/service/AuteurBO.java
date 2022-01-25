package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.model.AuteurDO;
import com.univlittoral.projetback.repository.AuteurDAO;

@Service
public class AuteurBO {
	@Autowired
	private AuteurDAO repo;
	
	public List<AuteurDO> findAll() {
		return repo.findAllbAuteurs();
	}
	
	
	public AuteurDO findOne(Long id) {
		return repo.getById(id);
	}
	
	
	public AuteurDO saveOne(AuteurDO auteurdo) {
		return repo.save(auteurdo);
	}
	
	public void deleteOne(Long id) {
		repo.deleteById(id);
	}
}
