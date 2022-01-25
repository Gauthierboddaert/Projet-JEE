package com.univlittoral.projetback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.univlittoral.projetback.model.AuteurDO;

public interface AuteurDAO extends JpaRepository<AuteurDO, Long>{
	@Query(value="SELECT * FROM auteurs order by prenom ASC", nativeQuery=true)
	public List<AuteurDO> findAllbAuteurs();
}
