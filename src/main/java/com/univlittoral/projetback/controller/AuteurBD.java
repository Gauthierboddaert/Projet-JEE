package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.model.AuteurDO;
import com.univlittoral.projetback.service.AuteurBO;


@RestController
@RequestMapping(value ="/rest/bd/auteurs")
@Transactional
public class AuteurBD {
	@Autowired 
	private AuteurBO auteurBO;
	
	 @GetMapping
	    public List<AuteurDTO> getAuteursPage() {
	    	final List<AuteurDO> entities = auteurBO.findAll();
			List<AuteurDTO> test = new ArrayList<AuteurDTO>();
			test = new ArrayList<>(AuteurMapper.map(entities));
			
			return test;
	    }
	
	@GetMapping(value= "{id}")
	public AuteurDTO getAuteurId(@PathVariable Long id) {
		final AuteurDO entities = auteurBO.findOne(id);
		
		return AuteurMapper.map(entities);
	}
}
