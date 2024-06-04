
  package org.exceptionhandling;
  
  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
  public class LunchBrowser {
  
  public static void main(String[] args) throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\LearnException\\Drivers\\chromedriver.exe"); 
  WebDriver driver =new ChromeDriver();
  
  driver.get("https://www.amazon.in/"); driver.manage().window().maximize();
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop"); 

  Thread.sleep(2000); // driver.quit(); }
  
 }
}