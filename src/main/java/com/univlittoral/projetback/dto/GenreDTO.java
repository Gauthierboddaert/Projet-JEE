package com.univlittoral.projetback.dto;

import com.univlittoral.projetback.enums.EnumGenre;

public class GenreDTO {
	private Integer values;
	private String color;
	private EnumGenre labels;
	
	
	public Integer getValues() {
		return values;
	}
	public void setValues(Integer values) {
		this.values = values;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public EnumGenre getLabels() {
		return labels;
	}
	public void setLabels(EnumGenre labels) {
		this.labels = labels;
	}
	
	
}
