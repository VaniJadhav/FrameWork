import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodTest3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}

}
