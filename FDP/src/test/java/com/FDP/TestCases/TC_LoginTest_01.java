package com.FDP.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FDP.pageObject.LoginPage;



public class TC_LoginTest_01 extends TestBase{
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		log.info("URL get open");
		
		LoginPage logobj= new LoginPage(driver);
		
		logobj.setUserName(username);
		log.info("Entered user name");
		
		logobj.setUserPass(password);
		log.info("Entered password");
		
		logobj.clickSubmit();
		log.error("Login Button clicked ");
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			log.info("Title is matching");
		}
		else 
		{
			Assert.assertTrue(false);
			log.error("Title is not matching");
		}
		
		
	}

}
