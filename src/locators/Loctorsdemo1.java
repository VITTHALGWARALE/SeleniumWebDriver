package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctorsdemo1 {
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
       driver.findElement(By.id("search_query_top"));
       //id & name
      driver.findElement(By.id("search_query_top")).sendKeys("T.shirt");
      driver.findElement(By.name("submit_search")).click();
	
     // linktext & partial linktext
      
      driver.findElement(By.linkText("Blouse")).click();
      driver.findElement(By.partialLinkText("Blouse"));
	}
	
	
}
