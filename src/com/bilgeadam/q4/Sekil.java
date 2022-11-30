package com.bilgeadam.q4;

public class Sekil {
	public IHesaplaDaire iHesaplaDaire;
	
public Sekil(IHesaplaDaire iHesaplaDaire) 
{
	this.iHesaplaDaire=iHesaplaDaire;
}
public double sekDaire(int n)
{
	return iHesaplaDaire.AlanHesabi(n);
}	
	
	public IHesaplaKare iHesaplaKare;
	
public Sekil(IHesaplaKare iHesaplaKare)
{
	this.iHesaplaKare=iHesaplaKare;
			
}
public double sekKare(int n)
{
	return iHesaplaKare.AlanHesabi(n);
}
	public IHesaplaDD iHesaplaDD;
	public Sekil(IHesaplaDD iHesaplaDD)
	{
		this.iHesaplaDD=iHesaplaDD;
	}


}
