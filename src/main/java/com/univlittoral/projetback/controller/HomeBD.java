package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.CategorieDTO;
import com.univlittoral.projetback.dto.GraphDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateursDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.enums.EnumGenre;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.model.AuteurDO;
import com.univlittoral.projetback.model.LivreDO;
import com.univlittoral.projetback.service.AuteurBO;
import com.univlittoral.projetback.service.LivreBO;

@RestController
@RequestMapping(value ="/rest/bd/home")
@Transactional
public class HomeBD {
	
	@Autowired 
	private LivreBO livreBO;
	@Autowired 
	private AuteurBO auteurBO;
	
	@GetMapping
	public HomeDTO getHomePage() {
		HomeDTO home = new HomeDTO();
		List<LivreDO> livreDo = livreBO.findAll();
		List<LivreDTO> livres = new ArrayList<LivreDTO>();
		livres = new ArrayList<>(LivreMapper.map(livreDo));
		home.setLivres(livres);
		
		List<AuteurDO> auteurDo = auteurBO.findAll();
		List<AuteurDTO> auteurs = new ArrayList<AuteurDTO>();
		auteurs = new ArrayList<>(AuteurMapper.map(auteurDo));
		
		IndicateursDTO indicateurs = new IndicateursDTO();
		indicateurs.setNbLivres(livres.size());
        indicateurs.setNbAuteurs(auteurs.size());
        indicateurs.setNbGenres(getNbGenres(livres));
		home.setIndicateurs(indicateurs);
		
		
		
		return home;
		
		
		
	}
	
	public Integer getNbGenres(List<LivreDTO> livres) {
        int nbGenres = 0;
        EnumGenre tab[] = new EnumGenre[livres.size()];
        for (int i=0;i<livres.size();i++) {
            tab[i]=livres.get(i).getGenre();//POESIE,BD,BD
            int compteur=0;
            for(int j=0;j<tab.length;j++) {
                if(tab[i]==tab[j]) {
                    compteur+=1;
                    if(compteur>=2) {
                        nbGenres-=1;
                        break;
                    }
                    nbGenres+=1;
                }
            }
        }
        
        return nbGenres;
    }
	
}
