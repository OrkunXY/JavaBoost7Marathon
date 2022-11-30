package com.bilgeadam.q4;

public class SekilF {
	public static IHesaplaDaire create(String className)
	{
		Class c;
		IHesaplaDaire iHesaplaDaire=null;
		try
		{
			c=Class.forName("com.bilgeadam.q4"+className);
					iHesaplaDaire=(IHesaplaDaire)c.newInstance();
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return iHesaplaDaire;
	}
	public IHesaplaKare create1(String className)
	{
		Class d;
		IHesaplaKare iHesaplaKare=null;
		try
		{
			d=Class.forName("com.bilgeadam.q4"+className);
			iHesaplaKare=(IHesaplaKare)d.newInstance();
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return iHesaplaKare;
	}
	public IHesaplaDD create2(String className)
	{
		Class e;
		IHesaplaDD iHesaplaDD=null;
		try
		{
			e=Class.forName("com.bilgeadam.q4."+className);
			iHesaplaDD=(IHesaplaDD)e.newInstance();
			
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		return iHesaplaDD;
	}

}
	
