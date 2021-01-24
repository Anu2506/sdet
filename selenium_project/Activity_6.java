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

public class Activity_6
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
	public void exampleTest() 
	{
        WebElement myAccount=driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
        myAccount.click();
        
        //Thread.sleep(10000);
        WebElement myAccountPage=driver.findElement(By.xpath("(.//*[@class='uagb-ifb-title-wrap'])[1]"));
		System.out.println("my account page "+  myAccountPage);
		myAccountPage.isDisplayed();
		WebElement Login=driver.findElement(By.xpath(("//a[@href='#login']")));
		Login.click();
		
		WebElement username=driver.findElement(By.id("user_login"));
		  WebElement password=driver.findElement(By.id("user_pass"));
		  
		  username.sendKeys("root"); 
		  password.sendKeys("pa$$w0rd");
		  
		  WebElement login=driver.findElement(By.id("wp-submit"));
			login.click();
			
			 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Actions action = new Actions(driver);
			WebElement loggedIn = driver
					.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/wp-admin/profile.php']"));
			action.moveToElement(loggedIn).build().perform();
			WebElement logout=driver.findElement(By.xpath("(.//*[@class='ab-item'])[1]"));
			
			logout.isDisplayed();
			
		
	}

		
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	}




