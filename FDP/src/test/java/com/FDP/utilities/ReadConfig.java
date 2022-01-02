package com.FDP.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig() 
	{
		File src= new File("./configuration//cofig.properties");
		FileInputStream filein;
		
		try {
			filein = new FileInputStream(src);
			pro=new Properties();
			pro.load(filein);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception e"+e.getMessage());
		}
		
	}
	
	public String getAppUrl() 
	{
		String URL=pro.getProperty("baseUrl");
		return URL;
	}
	public String getAppUserName() 
	{
		String userName=pro.getProperty("userName");
		return userName;
	}
	public String getAppPass() 
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getChroPath() 
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getGeckoPath() 
	{
		String chromepath=pro.getProperty("firefoxpath");
		return chromepath;
	}
}
