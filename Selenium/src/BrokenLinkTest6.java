import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest6 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
String url=null;
int respCode=0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> it=list.iterator();
		int count=0;
		while(it.hasNext()) {
			 url=it.next().getAttribute("href");

		System.out.println(url);
		
		
		if(url==null||url.isEmpty()) {
			System.out.println("URL is broken");
			continue;
			}
		}
		try {
			HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
			respCode = huc.getResponseCode();
			if(respCode>=400) {
				System.out.println(url+"is broken");
			}
			else{
                System.out.println(url+" is a valid link");
            }
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
