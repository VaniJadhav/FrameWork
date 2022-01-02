import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethodsTest2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement check=driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily"));
		
		check.click();
		System.out.println(check.isSelected());
		WebElement Currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sel= new Select(Currency);
		sel.selectByIndex(2);		
		System.out.println(sel.getFirstSelectedOption().getText());
		driver.close();
	}

}
