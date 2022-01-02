import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileTest8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/upload/");
    	long starttime=System.currentTimeMillis();
    	String path="C:\\Users\\vanij\\Downloads\\Automation Documents\\Test.txt";
    	driver.findElement(By.cssSelector("input.upload_txt")).sendKeys(path);
    	driver.findElement(By.id("terms")).click();
    	driver.findElement(By.id("submitbutton")).click();
    	System.out.println(driver.findElement(By.xpath("//h3[@id=\"res\"]/center/br")).getText());
    	
    	long EndTime=System.currentTimeMillis();
    	long timetaken=EndTime-starttime;
    	System.out.println("Total time taken to upload file"+timetaken/1000);
    	//driver.close();

	}

}
