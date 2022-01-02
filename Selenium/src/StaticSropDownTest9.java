import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticSropDownTest9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/newtours/register.php");
    	WebElement country=driver.findElement(By.name("country"));
    	Select select= new Select(country);
    	select.selectByVisibleText("ANDORRA");
    	System.out.println("isMultiple() "+	select.isMultiple());
    	
    	List<WebElement> values=driver.findElements(By.cssSelector("select[name=\"country\"]>option"));
    	
    	Iterator<WebElement> it= values.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().getText());
    		
    	}
	}

}
