import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPupUpTest7 {

	 public static void main(String[] args) {
	        
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("http://output.jsbin.com/usidix/1");
	    	driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
	    	
	    	String message=driver.switchTo().alert().getText();
	    	
	    	if(message.equals("This is an alert box.")) {
	    		
	    		driver.switchTo().alert().accept();
	    		System.out.println(message);
	    	}
	    	else {
	    		System.out.println("Message is not matching");
	    	}
	    	driver.close();
	 
}
}