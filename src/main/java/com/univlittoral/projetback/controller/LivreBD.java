package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.model.LivreDO;
import com.univlittoral.projetback.service.LivreBO;

@RestController
@RequestMapping(value ="/rest/bd/livres")
@Transactional

public class LivreBD {
	@Autowired 
	private LivreBO livreBO;
	
	@GetMapping(value ="{id}")
	public LivreDTO getLivreId(@PathVariable Long id) {
		final LivreDO entities = livreBO.findOne(id);
		
		return LivreMapper.map(entities);
	}
	
	
	@PostMapping	
	public LivreDTO postLivre(@RequestBody LivreDTO livredo) {
		LivreDO livredop = livreBO.saveOne(LivreMapper.map(livredo));
		return LivreMapper.map(livredop);
	}
	
	@PutMapping(value ="{id}")
	public LivreDTO getLivreId(@PathVariable Long id, @RequestBody LivreDO livredo) {
		final LivreDO entities = livreBO.findOne(id);
		entities.setNom(livredo.getNom());
		entities.setNbPages(livredo.getNbPages());
		entities.setLieuParution(livredo.getLieuParution());
		entities.setId(livredo.getId());
		entities.setGenre(livredo.getGenre());
		entities.setEditeur(livredo.getEditeur());
		entities.setDateParution(livredo.getDateParution());
		entities.setAuteur(livredo.getAuteur());
		return LivreMapper.map(entities);
	
	}
	
    @DeleteMapping(value="{id}")
    public void deleteLivre(@PathVariable Long id) {
    	livreBO.deleteOne(id);
    }   
    
    @GetMapping
    public List<LivreDTO> getLivreByGenre(@RequestParam("genre") String param){
	List<LivreDO> livreDo = livreBO.findByParam(param);
	List<LivreDTO> livres = new ArrayList<LivreDTO>();
	livres = new ArrayList<>(LivreMapper.map(livreDo));
	return livres;
    }
    
    
}
