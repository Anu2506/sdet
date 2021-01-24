
package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_3 
{
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
	      driver =new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/lms/");

	}
	@Test
	public void exampleTest()
	{
        WebElement box=driver.findElement(By.xpath("(.//*[@class='uagb-ifb-title'])[2]"));
        String heading =box.getText();
		System.out.println("first box is"+  heading);
		Assert.assertEquals("Actionable Training", heading);
	}

		
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}


