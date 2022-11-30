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

public class HesaplayiciDikdortgen {

	private JFrame frame;
	private JTextField txtKenar1;
	private JTextField txtKenar2;
	private JLabel lblSonuc;
	private JComboBox cmbSecim;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesaplayiciDikdortgen window = new HesaplayiciDikdortgen();
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
	public HesaplayiciDikdortgen() {
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
		
		JLabel lblNewLabel = new JLabel("kenar uzunlugu giriniz");
		lblNewLabel.setBounds(47, 36, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("kenar uzunlugu giriniz");
		lblNewLabel_1.setBounds(47, 73, 108, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKenar1 = new JTextField();
		txtKenar1.setBounds(203, 33, 86, 20);
		frame.getContentPane().add(txtKenar1);
		txtKenar1.setColumns(10);
		
		txtKenar2 = new JTextField();
		txtKenar2.setColumns(10);
		txtKenar2.setBounds(203, 70, 86, 20);
		frame.getContentPane().add(txtKenar2);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cmbSecim.getSelectedItem().toString()=="Alan") {
					
					String alan=Dikdortgen.alan(Double.valueOf(txtKenar1.getText()),Double.valueOf(txtKenar2.getText()));
					
					lblSonuc.setText(alan);
					}
					if(cmbSecim.getSelectedItem().toString()=="Cevre") {
					String cevre=Dikdortgen.cevre(Double.valueOf(txtKenar1.getText()),Double.valueOf(txtKenar2.getText()));
					
					lblSonuc.setText(cevre);
					}
			}
		});
		btnHesapla.setBounds(203, 127, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(47, 183, 108, 32);
		frame.getContentPane().add(lblSonuc);
		
		cmbSecim = new JComboBox();
		cmbSecim.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "Alan", "Cevre"}));
		cmbSecim.setBounds(67, 127, 88, 22);
		frame.getContentPane().add(cmbSecim);
	}

}
