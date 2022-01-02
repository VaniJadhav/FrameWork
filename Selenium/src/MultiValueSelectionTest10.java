import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiValueSelectionTest10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://jsbin.com/osebed/2");
    	WebElement value=driver.findElement(By.id("fruits"));
    	Select sel= new Select(value);
    	sel.selectByIndex(0);
    	sel.selectByValue("apple");
    	sel.selectByVisibleText("Orange");
    	System.out.println(sel.isMultiple());

	}

}
