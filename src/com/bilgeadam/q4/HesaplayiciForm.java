package com.bilgeadam.q4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HesaplayiciForm {

	private JFrame frame;
	private JTextField txt_uzunluk;
	private JTextField txt_genislik;
	private JLabel lblSonuc;
	private SekilF sekilF;
	private Kare kare;
	private Dikdortgen dikdortgen;
	private Daire daire;
	private IHesaplaDD iHesaplaDD;
	private IHesaplaKare iHesaplaKare;
	private IHesaplaDaire iHesaplaDaire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesaplayiciForm window = new HesaplayiciForm();
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
	public HesaplayiciForm() {
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
		
		JLabel lblNewLabel = new JLabel("Şekil:");
		lblNewLabel.setBounds(32, 31, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cmb_sekil = new JComboBox();
		cmb_sekil.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "Kare", "Dikdortgen", "Daire"}));
		cmb_sekil.setBounds(200, 27, 97, 22);
		frame.getContentPane().add(cmb_sekil);
		
		JLabel lblNewLabel_1 = new JLabel("Yapacaginiz İslem");
		lblNewLabel_1.setBounds(32, 67, 91, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt_uzunluk = new JTextField();
		txt_uzunluk.setBounds(211, 123, 86, 20);
		frame.getContentPane().add(txt_uzunluk);
		txt_uzunluk.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Uzunluk Giriniz");
		lblNewLabel_2.setBounds(32, 126, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genislik Griniz(yalnızcaDDicin calilsir)");
		lblNewLabel_3.setBounds(32, 154, 181, 52);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cmb_islem = new JComboBox();
		cmb_islem.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "AlanHesabi", "CevreHesabi"}));
		cmb_islem.setBounds(200, 70, 97, 22);
		frame.getContentPane().add(cmb_islem);
		
		txt_genislik = new JTextField();
		txt_genislik.setColumns(10);
		txt_genislik.setBounds(211, 170, 86, 20);
		frame.getContentPane().add(txt_genislik);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sekilF= new SekilF();
				try
				{
					iHesaplaDaire=SekilF.create(cmb_sekil.getSelectedItem().toString());
					/*Sekil= new Sekil()//*/
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				
				
				
				
			}
		});
		btnHesapla.setBounds(335, 122, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(32, 217, 265, 33);
		frame.getContentPane().add(lblSonuc);
	}
}
