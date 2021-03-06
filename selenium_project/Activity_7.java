
package selenium_project;




import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_7
{
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
	      driver =new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/lms/");
      Thread.sleep(10000);
	}
	@Test   
	public void exampleTest() throws InterruptedException 
	{
        WebElement AllCources=driver.findElement(By.xpath(("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")));
        AllCources.click();
        
        Thread.sleep(10000);
        
        for(int i=1;i>=3;i++)
        {
        	
        	WebElement training=driver.findElement(By.xpath("(.//*[@class='entry-title'])[" + i + "]"));
        	Dimension count =training.getSize();
        			System.out.println("Size of Training is"+  count);
              String heading =training.getText();
              
      		System.out.println("Training name is"+  heading);
        }
	}
        
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}




