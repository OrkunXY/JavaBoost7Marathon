package com.bilgeadam.q3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
	List<Hayvan> list=new ArrayList<Hayvan>();
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) 
	{
		list.add(m);
	} 
	public void bahceyeSurungenEkle(Surungen s) 
	{
		list.add(s);
	}
	public void hayvanSesCikarsin(Hayvan h) 
	{
		System.out.println(h+"ses cikariyor.");
	}

	public void hayvaninCinsiniBul(String hayvanAdi) 
	{
		if(hayvanAdi=="kermit") 
		{
			System.out.println("kermit bir surungen");
		}
		if(hayvanAdi=="simba") 
		{
			System.out.println("Simba bir memeli hayvan");
		}
		if(hayvanAdi=="ciko") 
		{
			System.out.println("ciko bir memeli hayvan");
		}
		if(hayvanAdi=="cobra") 
		{
			System.out.println("cobra bir surungen");
		}
		if(hayvanAdi=="tomy") 
		{
			System.out.println("tomy hayvanat bahcesinde yok");
		}
		else
			System.out.println("hatali giris yaptiniz.");
		
		
	}
	public void hayvaninBilgileriniYazdir(String hayvanAdi) 
	{
		
	}
	public void hayvaniHareketEttir(String hayvanAdi) 
	{
		
	}

}
