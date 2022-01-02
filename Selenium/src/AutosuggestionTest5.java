import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionTest5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element=driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
		element.sendKeys("Sel");
		List<WebElement> elements=driver.findElements(By.cssSelector("div.wM6W7d"));
		
			for(WebElement elemnts:elements) {
				if(elemnts.getText().equalsIgnoreCase("selenium")) {
					elemnts.click();
					break;
				}
			}
			
		}
		
		

	}


