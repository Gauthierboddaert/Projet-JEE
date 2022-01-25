package com.univlittoral.projetback.dto;

import java.util.List;

public class HomeDTO {
	List<LivreDTO> livres;
    IndicateursDTO indicateurs;
    GraphDTO datasGraph;
    CategorieDTO genres;
	public List<LivreDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}
	public IndicateursDTO getIndicateurs() {
		return indicateurs;
	}
	public void setIndicateurs(IndicateursDTO indicateur) {
		indicateurs = indicateur;
	}
	
	public CategorieDTO getGenres() {
		return genres;
	}
	public void setGenres(CategorieDTO genres) {
		this.genres = genres;
	}
	public GraphDTO getDatasGraph() {
		return datasGraph;
	}
	public void setDatasGraph(GraphDTO datasGraph) {
		this.datasGraph = datasGraph;
	}
	
	
	
	
	
    
    
    
}