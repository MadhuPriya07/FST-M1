package IBMFST_TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
  @Test(dataProvider="Authentication")
  public void testMethod(String username,String password) {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	  
	//Assert Message		
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
  }
  
  @DataProvider(name = "Authentication")
  public static Object[][] credentials() {
	  return new Object[][] {{"admin","password"}};	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
