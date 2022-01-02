package com.FDP.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;

	public void setUserName(String name)
	{
		txtUserName.sendKeys(name);
	}
	
	public void setUserPass(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		loginBtn.click();
	}
}
