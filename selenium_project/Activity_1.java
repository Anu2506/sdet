package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1

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
	String Title=driver.getTitle();
	System.out.println("Title of the page"+  Title);
	Assert.assertEquals("Alchemy LMS – An LMS Application", Title);
}

	
@AfterMethod
public void AfterMethod()
{
	driver.quit();
}

}
