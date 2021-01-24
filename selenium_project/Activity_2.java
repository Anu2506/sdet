package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_2 
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
        WebElement ele=driver.findElement(By.xpath("(.//*[@class='uagb-ifb-title-wrap'])[h1]"));
        String heading =ele.getText();
		System.out.println("Title of the page"+  heading);
		Assert.assertEquals("Learn from Industry Experts", heading);
	}

		
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}


