package com.radio.beans;

public class Station {

	private int numberStation;
	private String nomStation;
	private String imgStation;
	private float frequenceStation;
	private String programme;
	
	

	public int getNumberStation() {
		return numberStation;
	}
	public void setNumberStation(int numberStation) {
		this.numberStation = numberStation;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String getNomStation() {
		return nomStation;
	}
	public void setNomStation(String nomStation) {
		this.nomStation = nomStation;
	}
	public String getImgStation() {
		return imgStation;
	}
	public void setImgStation(String imgStation) {
		this.imgStation = imgStation;
	}
	public float getFrequenceStation() {
		return frequenceStation;
	}
	public void setFrequenceStation(float frequenceStation) {
		this.frequenceStation = frequenceStation;
	}
	public Station(int numberStation, String nomStation, String imgStation, float frequenceStation, String programme) {
		super();
		this.numberStation = numberStation;
		this.nomStation = nomStation;
		this.imgStation = imgStation;
		this.frequenceStation = frequenceStation;
		this.programme = programme;
	}
	
	
}
