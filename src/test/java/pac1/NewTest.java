package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public static WebDriver driver;
		
  @Test
  public void fTest() {
	  

	  //for getting inner text from a input box we use getAttribute();
	  
	  //can we use getText() with respect to anything like, button, link, input box, drop down, logo and others - yes except input box, for input box 
	  //getAttribute();
	  
	  
	  
	 
	  
	  
	String name=  driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("name");
	System.out.println(name);
	
	
	
	String id=  driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("id");
	System.out.println(id);
	
	
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
  }
  
  
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
