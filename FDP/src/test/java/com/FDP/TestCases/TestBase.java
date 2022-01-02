package com.FDP.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.FDP.utilities.ReadConfig;



public class TestBase 
{
	
	ReadConfig readcon= new ReadConfig();
	
public String baseUrl=readcon.getAppUrl();
public String username=readcon.getAppUserName();
public String password=readcon.getAppPass();
public static WebDriver driver;
public static Logger log;


@Parameters("browser")
@BeforeClass
public void setUp(String br)
{
	//Log
		 log=Logger.getLogger("TestBase");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) 
		{
	System.setProperty("webdriver.chrome.driver", readcon.getChroPath());
	driver= new ChromeDriver();
		}
	   else if(br.equals("firefox")) 
				{
			System.setProperty("webdriver.gecko.driver", readcon.getGeckoPath());
			driver= new FirefoxDriver();
				}
		driver.get(baseUrl);
	
}

@AfterClass
public void tearDown()
{
	driver.quit();
}

	
}
