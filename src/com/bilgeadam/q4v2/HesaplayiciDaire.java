package com.bilgeadam.q4v2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HesaplayiciDaire {

	private JFrame frame;
	private JTextField txtYaricap;
	private JLabel lblSonuc;
	private JComboBox cmbSecim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesaplayiciDaire window = new HesaplayiciDaire();
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
	public HesaplayiciDaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yari Cap giriniz");
		lblNewLabel.setBounds(51, 56, 110, 31);
		frame.getContentPane().add(lblNewLabel);
		
		txtYaricap = new JTextField();
		txtYaricap.setBounds(171, 61, 86, 20);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cmbSecim.getSelectedItem().toString()=="Alan") {
				
				String alan=Daire.alan(Double.valueOf(txtYaricap.getText()));
				
				lblSonuc.setText(alan);
				}
				if(cmbSecim.getSelectedItem().toString()=="Cevre") {
				String cevre=Daire.cevre(Double.valueOf(txtYaricap.getText()));
				
				lblSonuc.setText(cevre);
				}
			}});
		btnHesapla.setBounds(171, 137, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(51, 197, 140, 23);
		frame.getContentPane().add(lblSonuc);
		
		cmbSecim = new JComboBox();
		cmbSecim.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "Alan", "Cevre"}));
		cmbSecim.setBounds(295, 60, 70, 22);
		frame.getContentPane().add(cmbSecim);
	}

}
