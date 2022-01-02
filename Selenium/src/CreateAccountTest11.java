/*
 * 
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTest11 {

	public static void main(String[] args) throws InterruptedException {

		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("http://automationpractice.com/index.php");
	    	driver.findElement(By.cssSelector("a.login")).click();
	    	driver.findElement(By.cssSelector("input#email_create")).sendKeys("vanijadhav2010@gmail.com");
	    	driver.findElement(By.xpath("//button[@id=\'SubmitCreate\']")).click();
	    	Thread.sleep(3000);
	    	//select gender
	    	WebElement Gender=driver.findElement(By.cssSelector("input#id_gender2"));
	    	Gender.click();
	    	System.out.println(Gender.isSelected());
	    	driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Vani");
	    	driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("Jadhav");
	    	driver.findElement(By.cssSelector("input#passwd")).sendKeys("Dec@2021");
	    	
	    	WebElement Day=driver.findElement(By.cssSelector("select#days"));
	    	Select day=new Select(Day);
	    	day.selectByValue("27");
	    	
	    	WebElement Months=driver.findElement(By.cssSelector("select#months"));
	    	Select months=new Select(Months);
	    	months.selectByIndex(1);
	    	
	    	WebElement Years=driver.findElement(By.cssSelector("select#years"));
	    	Select years=new Select(Years);
	    	years.selectByValue("1994");
	    	
	    	//CheckBox
	    	
	    	driver.findElement(By.xpath("//input[@id=\'newsletter\']")).click();
	    	driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("Abc");
	    	
	    	driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Xyz");
	    	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Xyz");
	    	driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("abc,xyz");
	    	
	    	driver.findElement(By.cssSelector("input#city")).sendKeys("Bangalore");
	    	
	    	WebElement State=driver.findElement(By.cssSelector("select#id_state"));
	    	Select state=new Select(State);
	    	state.selectByVisibleText("California"); 
	    	
	    	driver.findElement(By.cssSelector("input#postcode")).sendKeys("12345");
	    	
	    	WebElement Country=driver.findElement(By.cssSelector("select#id_state"));
	    	Select country=new Select(Country);
	    	country.selectByVisibleText("California"); 
	    	
	    	driver.findElement(By.cssSelector("input#phone_mobile")).sendKeys("8792162885");
	    	
	    	WebElement address=driver.findElement(By.id("alias"));
	    	address.clear();
	    	address.sendKeys("Hubli");
	    	
	    	driver.findElement(By.id("submitAccount")).click();
	    	
	    	
	    	
	    	

	}

}
