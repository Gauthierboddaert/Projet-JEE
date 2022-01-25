package com.univlittoral.projetback.model;

import java.util.Date;

import javax.persistence.*;

import com.univlittoral.projetback.enums.*;


@Entity
@Table(name="livres") public class LivreDO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="EDITEUR")
	private String editeur;
	
	@Column(name="NBPAGES")
	private Integer NbPages;
	
	
	@Column(name="DATEPARUTION")
	private Date dateParution;
	
	@Column(name="LIEUXPARUTION")
	private String lieuParution;
	
	@Column(name="GENRE")
	@Enumerated(EnumType.STRING)
	private EnumGenre genre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_auteur", referencedColumnName="id")
	private AuteurDO auteur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Integer getNbPages() {
		return NbPages;
	}

	public void setNbPages(Integer nbPages) {
		NbPages = nbPages;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public String getLieuParution() {
		return lieuParution;
	}

	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}

	public EnumGenre getGenre() {
		return genre;
	}

	public void setGenre(EnumGenre genre) {
		this.genre = genre;
	}

	public AuteurDO getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurDO auteur) {
		this.auteur = auteur;
	}

	//public void setAuteur(AuteurDTO auteur2) {
		// TODO Auto-generated method stub
		
	//}

	
	

	
	
	
	
}
