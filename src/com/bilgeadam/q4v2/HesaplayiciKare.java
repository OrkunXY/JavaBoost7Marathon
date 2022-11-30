package com.bilgeadam.q4v2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HesaplayiciKare {

	private JFrame frame;
	private JTextField txt_genislik;
	private JLabel lblSonuc;
	private Double uzunluk;
	private Double genislik;
	private Double sonuc;
	private JComboBox cmbSecim;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesaplayiciKare window = new HesaplayiciKare();
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
	public HesaplayiciKare() {
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
		
		JLabel lblGenislikGiriniz = new JLabel("Genislik Giriniz");
		lblGenislikGiriniz.setBounds(48, 75, 110, 14);
		frame.getContentPane().add(lblGenislikGiriniz);
		
		txt_genislik = new JTextField();
		txt_genislik.setBounds(154, 72, 86, 20);
		frame.getContentPane().add(txt_genislik);
		txt_genislik.setColumns(10);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(48, 144, 95, 31);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(cmbSecim.getSelectedItem().toString()=="Alan") {
				String alan=Kare.alan(Double.valueOf(txt_genislik.getText()));
				
				lblSonuc.setText(alan);
				}
				if(cmbSecim.getSelectedItem().toString()=="Cevre") {
				String cevre=Kare.cevre(Double.valueOf(txt_genislik.getText()));
				
				lblSonuc.setText(cevre);
				}
			}
		});
		btnHesapla.setBounds(154, 115, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		cmbSecim = new JComboBox();
		cmbSecim.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "Alan", "Cevre"}));
		cmbSecim.setBounds(285, 71, 71, 22);
		frame.getContentPane().add(cmbSecim);
	}

}
