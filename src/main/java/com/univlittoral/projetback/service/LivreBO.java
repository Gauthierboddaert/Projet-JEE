package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.univlittoral.projetback.model.LivreDO;
import com.univlittoral.projetback.repository.*;


@Service
public class LivreBO {
	@Autowired
	private LivreDAO repo;
	
	public List<LivreDO> findAll() {
		return repo.findAllbLivres();
	}
	
	
	public LivreDO findOne(Long id) {
		return repo.getById(id);
	}
	
	
	public LivreDO saveOne(LivreDO livredo) {
		return repo.save(livredo);
	}
	
	public void deleteOne(Long id) {
		repo.deleteById(id);
	}
	
	public List<LivreDO> findByParam(String param) {
		return repo.findAllbyGenre(param);
	}
}

