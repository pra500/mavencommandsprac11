package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FromCityTest {
		
	
	 public static WebDriver driver;
	 
  @Test
  public void fTest() {
	  
	  
	  if(randompo())
	  {
		  
		  driver.switchTo().alert();
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
		  
	  }
	  
	  
	  String fromcity=driver.findElement(By.xpath("//label//span[text()='From']//following-sibling::input")).getText();
	  System.out.println(fromcity);
	
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	  driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
  }

  
  
  public static boolean randompo()
  {
	  
	try
	{
		 driver.switchTo().alert();	
		 return true;
	}
	
	catch(Exception e)
	{	
		return false;
		
	}
  }

  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
