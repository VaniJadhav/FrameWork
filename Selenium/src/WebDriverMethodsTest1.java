import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsTest1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.guru.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
				
		driver.findElement(By.cssSelector("input#searchQuery")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("button#Search-Freelancers")).click();
		List<WebElement> elements=driver.findElements(By.tagName("img"));
		int len=elements.size();
		System.out.println("number of links on page"+len);
		driver.close();
	}

}
