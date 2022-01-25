package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.model.LivreDO;

@Component
public class LivreMapper {
	public final static LivreDTO map(final LivreDO source) {
        final LivreDTO livredto = new LivreDTO();
        if (null == source) {
            return livredto;
        }
        livredto.setId(source.getId());
        livredto.setNom(source.getNom());
        livredto.setEditeur(source.getEditeur());
        livredto.setNbPages(source.getNbPages());
        livredto.setDateParution(source.getDateParution());
        livredto.setLieuParution(source.getLieuParution());
        livredto.setGenre(source.getGenre());
        livredto.setAuteur(AuteurMapper.map(source.getAuteur()));
        
        
        return livredto;
    }
    
    public final static List<LivreDTO> map(List<LivreDO> source){
        List<LivreDTO> listLivreDTO = new ArrayList<LivreDTO>();
        for (LivreDO livreDO :source) {
            listLivreDTO.add(map(livreDO));
        }
        
        
        
        return listLivreDTO;
    }
    
    
    
    
    public final static LivreDO map(final LivreDTO source) {
    	final  LivreDO livredo = new LivreDO();
    	if (null == source) {
            return livredo;
        }
    	livredo.setId(source.getId());
        livredo.setNom(source.getNom());
        livredo.setEditeur(source.getEditeur());
        livredo.setNbPages(source.getNbPages());
        livredo.setLieuParution(source.getLieuParution());
        livredo.setDateParution(source.getDateParution());
        livredo.setGenre(source.getGenre());
        livredo.setAuteur(AuteurMapper.map(source.getAuteur()));
        return livredo;
    }
}
