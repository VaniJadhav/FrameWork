import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeTest4 {

	public static void main(String[] args) {
	int count=0;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
List<WebElement> link=driver.findElements(By.tagName("a"));
for(WebElement lin:link) {
	String text=lin.getText();
	System.out.println(text);
	//System.out.println(lin.getAttribute(text));
	count++;
}
System.out.println(count);
driver.close();
	}

}
