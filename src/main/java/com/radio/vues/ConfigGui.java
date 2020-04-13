/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.radio.vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.apache.log4j.Logger;

import com.radio.beans.Configuration;
import com.radio.controllers.SimulateurCtrl;

import javax.swing.JTextField;
import javax.swing.GroupLayout;

/**
 *
 * @author amgharm
 */
public class ConfigGui extends javax.swing.JFrame {

	private Logger LOGGER = Logger.getLogger(ConfigGui.class);
	public static Configuration configurationRadio = new Configuration();
	private JTextField radioMemoire;
	JRadioButton radioButtonUSB;
	
	//private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Creates new form NewJFrame
	 */
	public ConfigGui() {
		setType(Type.UTILITY);
		setTitle("Configuration");
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		

		//buttonGroup.add(radioButtonRHOn);
		

		JLabel lblNewLabel = new JLabel("R�glage automatique");

		JLabel lblNewLabel_1 = new JLabel("Haut-parleur secondaire");

		JLabel lblNewLabel_4 = new JLabel("Sortie audio externe");

		JLabel lblNewLabel_5 = new JLabel("Entr�e audio externe");

		JLabel lblNewLabel_6 = new JLabel("Date et Heure automatique");

		JLabel lblNewLabel_7 = new JLabel("R\u00E9veil");

		JLabel lblNewLabel_8 = new JLabel("Breaking news");

		JLabel lblNewLabel_9 = new JLabel("Radio FM");

		final JRadioButton radioButtonRHOn = new JRadioButton("");
		radioButtonRHOn.setSelected(ConfigGui.configurationRadio.getRechercheAuto().isEtat());
		
		final JRadioButton radioButtonHTOn = new JRadioButton("");
		radioButtonHTOn.setSelected(ConfigGui.configurationRadio.getHauteParleurSecondaire().isEtat());

		final JRadioButton radioButtonSEOn = new JRadioButton("");
		radioButtonSEOn.setSelected(ConfigGui.configurationRadio.getSortieAudioExterne().isEtat());

		final JRadioButton radioButtonEEOn = new JRadioButton("");
		radioButtonEEOn.setSelected(ConfigGui.configurationRadio.getEntreeAudioExterne().isEtat());

		final JRadioButton radioButtonHorlogeOn = new JRadioButton("");
		radioButtonHorlogeOn.setSelected(ConfigGui.configurationRadio.getHorloge().isEtat());

		final JRadioButton radioButtonReveilOn = new JRadioButton("");
		radioButtonReveilOn.setSelected(ConfigGui.configurationRadio.getReveil().isEtat());

		final JRadioButton radioButtonBNOn = new JRadioButton("");
		radioButtonBNOn.setSelected(ConfigGui.configurationRadio.getBreakingNews().isEtat());

		final JRadioButton radioButtonRMOn = new JRadioButton("");
		radioButtonRMOn.setSelected(ConfigGui.configurationRadio.getRadioFM().isEtat());

		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigGui.configurationRadio.getRechercheAuto().setEtat(radioButtonRHOn.isSelected());
				ConfigGui.configurationRadio.getHauteParleurSecondaire().setEtat(radioButtonHTOn.isSelected());
				ConfigGui.configurationRadio.getSortieAudioExterne().setEtat(radioButtonSEOn.isSelected());
				ConfigGui.configurationRadio.getEntreeAudioExterne().setEtat(radioButtonEEOn.isSelected());
				ConfigGui.configurationRadio.getHorloge().setEtat(radioButtonHorlogeOn.isSelected());
				ConfigGui.configurationRadio.getReveil().setEtat(radioButtonReveilOn.isSelected());
				ConfigGui.configurationRadio.getBreakingNews().setEtat(radioButtonBNOn.isSelected());
				ConfigGui.configurationRadio.getRadioFM().setEtat(radioButtonRMOn.isSelected());
				ConfigGui.configurationRadio.getUsb().setEtat(radioButtonUSB.isSelected());
				try {
					ConfigGui.configurationRadio.setTailleMemoire(Integer.parseInt(radioMemoire.getText()));
				}catch (NumberFormatException e5) {
					LOGGER.error("La taille m�moire doit etre un nombre");
				}finally {
					ConfigGui.configurationRadio.setTailleMemoire(3);
				}
				
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("m\u00E9moire");
		
		radioMemoire = new JTextField();
		radioMemoire.setText("3");
		radioMemoire.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("USB");
		
		 radioButtonUSB = new JRadioButton("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(87)
					.addComponent(btnNewButton)
					.addContainerGap(104, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_9)
								.addComponent(lblNewLabel_2))
							.addGap(60)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(radioMemoire, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(radioButtonRHOn)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
									.addComponent(radioButtonSEOn)
									.addComponent(radioButtonHTOn)
									.addComponent(radioButtonHorlogeOn)
									.addComponent(radioButtonEEOn)
									.addComponent(radioButtonReveilOn)
									.addComponent(radioButtonBNOn)
									.addComponent(radioButtonRMOn)
									.addComponent(radioButtonUSB)))))
					.addGap(34))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(radioButtonRHOn)
						.addComponent(lblNewLabel))
					.addGap(13)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(radioButtonHTOn))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(radioButtonSEOn)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(radioButtonEEOn)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_6)
						.addComponent(radioButtonHorlogeOn))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButtonReveilOn)
						.addGroup(layout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_7)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_9)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(radioButtonBNOn)
								.addGroup(layout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_8)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(radioButtonRMOn)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(radioButtonUSB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(radioMemoire, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(btnNewButton))
						.addComponent(lblNewLabel_2))
					.addGap(156))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ConfigGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ConfigGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ConfigGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ConfigGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ConfigGui().setVisible(true);
			}
		});
	}
}
