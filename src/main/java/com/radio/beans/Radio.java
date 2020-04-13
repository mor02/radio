package com.radio.beans;

import com.radio.services.IRadioServices;

public class Radio implements IRadioServices{

	private boolean etat;
	private Station station;
	private HauteParleur hp;
	private Ecran ecran;
	private Memoire memoire;
	
	
	public Radio() {
		super();
		hp=new HauteParleur();
		memoire = new Memoire(3);
	}
	public boolean arreterRadio() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean demarrerRadio() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public HauteParleur getHp() {
		return hp;
	}
	public void setHp(HauteParleur hp) {
		this.hp = hp;
	}
	public Ecran getEcran() {
		return ecran;
	}
	public void setEcran(Ecran ecran) {
		this.ecran = ecran;
	}
	public Memoire getMemoire() {
		return memoire;
	}
	public void setMemoire(Memoire memoire) {
		this.memoire = memoire;
	}
	
	
}
