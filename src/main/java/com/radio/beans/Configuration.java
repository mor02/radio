package com.radio.beans;

public class Configuration {

	private RechercheAuto rechercheAuto;
	private HauteParleurSecondaire hauteParleurSecondaire;
	private SortieAudioExterne sortieAudioExterne;
	private EntreeAudioExterne entreeAudioExterne;
	private Horloge horloge;
	private Reveil reveil;
	private BreakingNews breakingNews;
	private RadioFM radioFM;
	private int tailleMemoire=10;
	
	public Configuration() {
		super();
		this.rechercheAuto = new RechercheAuto();
		this.hauteParleurSecondaire = new HauteParleurSecondaire();
		this.sortieAudioExterne = new SortieAudioExterne();
		this.entreeAudioExterne = new EntreeAudioExterne();
		this.horloge = new Horloge();
		this.reveil = new Reveil();
		this.breakingNews = new BreakingNews();
		this.radioFM = new RadioFM();
	}
	public RechercheAuto getRechercheAuto() {
		return rechercheAuto;
	}
	public void setRechercheAuto(RechercheAuto rechercheAuto) {
		this.rechercheAuto = rechercheAuto;
	}
	public HauteParleurSecondaire getHauteParleurSecondaire() {
		return hauteParleurSecondaire;
	}
	public void setHauteParleurSecondaire(HauteParleurSecondaire hauteParleurSecondaire) {
		this.hauteParleurSecondaire = hauteParleurSecondaire;
	}
	public SortieAudioExterne getSortieAudioExterne() {
		return sortieAudioExterne;
	}
	public void setSortieAudioExterne(SortieAudioExterne sortieAudioExterne) {
		this.sortieAudioExterne = sortieAudioExterne;
	}
	public EntreeAudioExterne getEntreeAudioExterne() {
		return entreeAudioExterne;
	}
	public void setEntreeAudioExterne(EntreeAudioExterne entreeAudioExterne) {
		this.entreeAudioExterne = entreeAudioExterne;
	}
	public Horloge getHorloge() {
		return horloge;
	}
	public void setHorloge(Horloge horloge) {
		this.horloge = horloge;
	}
	public Reveil getReveil() {
		return reveil;
	}
	public void setReveil(Reveil reveil) {
		this.reveil = reveil;
	}
	public BreakingNews getBreakingNews() {
		return breakingNews;
	}
	public void setBreakingNews(BreakingNews breakingNews) {
		this.breakingNews = breakingNews;
	}
	public RadioFM getRadioFM() {
		return radioFM;
	}
	public void setRadioFM(RadioFM radioFM) {
		this.radioFM = radioFM;
	}
	public int getTailleMemoire() {
		return tailleMemoire;
	}
	public void setTailleMemoire(int tailleMemoire) {
		this.tailleMemoire = tailleMemoire;
	}
	
	
	
}
