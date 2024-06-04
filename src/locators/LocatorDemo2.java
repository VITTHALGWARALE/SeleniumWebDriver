package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {
	
      public static void main(String[] args) {
		
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
    	  
    	  WebDriver driver=new ChromeDriver();
    	  
    	  driver.get(" http://demo.automationtesting.in/Register.html");
    	  
    	  driver.manage().window().maximize();
    	  WebElement element=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    	element.sendKeys("vitthal");
    	WebElement element2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    	element2.sendKeys("warale");
	}

}