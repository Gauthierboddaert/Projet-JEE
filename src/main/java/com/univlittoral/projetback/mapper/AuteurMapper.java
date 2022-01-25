package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.model.AuteurDO;

@Component
public class AuteurMapper {
	public final static AuteurDTO map(final AuteurDO source) {
        final AuteurDTO auteurdto = new AuteurDTO();
        if (null == source) {
            return auteurdto;
        }
        auteurdto.setId(source.getId());
        auteurdto.setNom(source.getNom());
        auteurdto.setPrenom(source.getPrenom());
        auteurdto.setDateNaissance(source.getDateNaissance());
        
        
        return auteurdto;
    }
    
    public final static List<AuteurDTO> map(final List<AuteurDO> source){
        List<AuteurDTO> listAuteurDTO = new ArrayList<AuteurDTO>();
        
        for (AuteurDO auteurDO :source) {
            listAuteurDTO.add(map(auteurDO));
        }
        return listAuteurDTO;
    }
    
    public final static AuteurDO map(final AuteurDTO source) {
    	final  AuteurDO auteurdo = new AuteurDO();
    	if (null == source) {
            return auteurdo;
        }
        
    	auteurdo.setId(source.getId());
    	auteurdo.setNom(source.getNom());
    	auteurdo.setPrenom(source.getPrenom());
    	auteurdo.setDateNaissance(source.getDateNaissance());
        return auteurdo;
    }
}
