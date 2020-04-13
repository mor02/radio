package com.radio.vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.Timer;

class HorlogeLabel extends JLabel implements ActionListener {

	public HorlogeLabel() {
		super("" + Calendar.getInstance());
		Timer t = new Timer(1000, this);
		t.start();
	}

	public void actionPerformed(ActionEvent ae) {
		setText(String.format("%tT", Calendar.getInstance()));
	}
}