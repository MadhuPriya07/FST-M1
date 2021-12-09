package IBMFST_TestNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Activity5 {
	
	WebDriver driver;
	 @Test (groups = {"HeaderTests", "ButtonTests"})
  public void pageTitleTest() {
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Target Practice");
  }
	 @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
  public void testThirdHeader() {
	  WebElement ele= driver.findElement(By.xpath("//h3[@id='third-header']"));
	  Assert.assertEquals(ele.getText(), "Third header");	  
  }
  
	 @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
  public void testFifthHeader() {
	  WebElement ele= driver.findElement(By.xpath("//h5[contains(@class,'green')]"));
	  Assert.assertEquals(ele.getCssValue("background-color"), "rgba(0, 0, 0, 0)");	  
  }
	 @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void OliveButton() {
	  WebElement ele= driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
	  Assert.assertEquals(ele.getText(), "Olive");
  }
	 @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
  public void thirdRowButton() {
      WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
      Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
  }
  @BeforeMethod
  public void beforeClass() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }
  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
