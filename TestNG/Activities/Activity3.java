package IBMFST_TestNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	  
	  WebElement confirm= driver.findElement(By.xpath("//div[contains(text(),'Welcome Back, admin')]"));
	  Assert.assertEquals(confirm.getText(), "Welcome Back, admin");
  }
  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
