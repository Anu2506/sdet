package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_3 
{
  WebDriver driver;
  @BeforeTest
  public void beforemethod()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\seleniumDrivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }
  @Test
  public void logInTest()
  {
	  WebElement username=driver.findElement(By.id("username"));
	  WebElement password=driver.findElement(By.id("password"));
	  
	  username.sendKeys("admin");
	  password.sendKeys("password");
	  
	  WebElement login=driver.findElement(By.xpath(".//*[@onclick='signIn()']"));
	  login.click();
	  
	  String WelcomeMessage=driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals("Welcome Back, admin", WelcomeMessage);
	  
  }
  
  @AfterTest
  public void aftermethod()
  {
	  driver.quit();
  }
  
}
