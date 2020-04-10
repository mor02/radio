package com.radio.vues;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.radio.controllers.SimulateurCtrl;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioGui {

	private JFrame frame;
	private SimulateurCtrl simCtrl = new SimulateurCtrl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioGui window = new RadioGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Allumer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simCtrl.AllumerAction();
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
	}

}
