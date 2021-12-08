package IBMFST_TestNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
  @Test
  public void test1() {
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Target Practice");
  }
  @Test
  public void test2() {
	  WebElement ele=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
	  Assert.assertTrue(ele.isDisplayed());
	  Assert.assertEquals(ele.getText(), "black");
  }
  @Test(enabled=false)
  public void test3() {
	  
  }
  @Test 
  public void test4() {
	  throw new SkipException("Skipping test case");   
  }
  @BeforeClass
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
