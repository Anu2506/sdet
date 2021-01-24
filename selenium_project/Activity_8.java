
package selenium_project;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_8
{
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
	      driver =new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/lms");
      Thread.sleep(10000);
	}
	@Test   
	public void exampleTest() throws InterruptedException 
	{
        WebElement contact=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']"));
        contact.click();
        
        Thread.sleep(10000);
        WebElement FullName=driver.findElement(By.id("wpforms-8-field_0"));
        FullName.sendKeys("Anushri Choubey");
        WebElement Email=driver.findElement(By.id("wpforms-8-field_1"));
        Email.sendKeys("Anushri@gmail.com");
        WebElement subject=driver.findElement(By.id("wpforms-8-field_3"));
        subject.sendKeys("Good");
        WebElement Msg=driver.findElement(By.id("wpforms-8-field_2"));   
        Msg.sendKeys("test");
        
		
		WebElement Login=driver.findElement(By.id("wpforms-submit-8"));
		Login.click();
		
	
			WebElement SuccessMsg=driver.findElement(By.id("wpforms-confirmation-8"));
			
			SuccessMsg.isDisplayed();
			
		
	}

		
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}




