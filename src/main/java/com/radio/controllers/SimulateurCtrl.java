package com.radio.controllers;

import org.apache.log4j.Logger;

import com.radio.beans.Radio;
import com.radio.beans.Station;
import com.radio.mocks.StationMocks;


public class SimulateurCtrl {

	private Logger LOGGER = Logger.getLogger(SimulateurCtrl.class);
	private Radio radio = new Radio();
	private StationMocks stationMocks = new StationMocks();
	
	public void allumerAction() {
		LOGGER.debug("debut AllumerAction()");
		if(!radio.isEtat()) {
			radio.setEtat(true);
			radio.getMemoire().chargerMemoire();
		}else {
			radio.setEtat(false);
		}
		LOGGER.debug("fin AllumerAction()");
		
	}

	public void nextStation(Station s) {

		if (radio.isEtat()) {
			if (stationMocks.getStations().isEmpty()) {
				// Pas de réseau
				// TODO gérer ce cas comme panne
				//return null;
			}
			if (s == null) {
				this.radio.setStation(stationMocks.getStations().get(0));

			} else {
				int indexSelectStation = stationMocks.getStations().indexOf(s);
				if (indexSelectStation == stationMocks.getStations().size() - 1) {
					this.radio.setStation(stationMocks.getStations().get(0));
				} else {
					this.radio.setStation(stationMocks.getStations().get(indexSelectStation + 1));
				}
			}

		} 

	}
	
	public void previouStation(Station s) {
		if (radio.isEtat()) {
			if (stationMocks.getStations().isEmpty()) {
				// Pas de réseau
				// TODO gérer ce cas comme panne
				//return null;
			}
			if (s == null) {
				this.radio.setStation(stationMocks.getStations().get(0));

			} else {
				int indexSelectStation = stationMocks.getStations().indexOf(s);
				if (indexSelectStation == 0) {
					this.radio.setStation(stationMocks.getStations().get(stationMocks.getStations().size()-1));
				} else {
					this.radio.setStation(stationMocks.getStations().get(indexSelectStation - 1));
				}
			}

		} 
	}
	//TODO cas typique JUNIT
	public void augmenteVolume() {
		if(radio.isEtat()) {
			if(radio.getHp().getVolume()<20) {
				radio.getHp().setVolume(radio.getHp().getVolume()+1);
			}
		}
	}
	//TODO cas typique JUNIT
	public void diminueVolume() {
		if(radio.isEtat()) {
			if(radio.getHp().getVolume()>0) {
				radio.getHp().setVolume(radio.getHp().getVolume()-1);
			}
		}
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}
	
	
}
