package selenium_project;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_5
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
        WebElement myAccount=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
        myAccount.click();
        WebElement myAccountPage=driver.findElement(By.xpath("(.//*[@class='uagb-ifb-title-wrap'])[1]"));
		System.out.println("Text of second box"+  myAccountPage);
		myAccountPage.isDisplayed();
		
	}

		
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}



