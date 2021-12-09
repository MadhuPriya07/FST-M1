package IBMFST_TestNGActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Test Case Setup started |");
		driver.switchTo().defaultContent();		
	}
	@BeforeTest
	public void beforeTest() {
		driver= new FirefoxDriver();
		Reporter.log("Test Starts!!!");
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser |");	
        Reporter.log("Page title is " + driver.getTitle() + " |");
		
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	@Test
	public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |");
    	
        //Click the button to open a simple alert
	
        driver.findElement(By.id("simple")).click();
	
        Reporter.log("Simple Alert opened |");
	
 
	
        //Switch to alert window
	
        Alert simpleAlert = driver.switchTo().alert();
	
        Reporter.log("Switched foucs to alert |");
	
 
	
        //Get text in the alert box and print it
	
        String alertText = simpleAlert.getText();
	
        Reporter.log("Alert text is: " + alertText + " |");
	
        
	
        //Assertion
	
        Assert.assertEquals("This is a JavaScript Alert!", alertText);
	
 
	
        simpleAlert.accept();
	
        Reporter.log("Alert closed");
	
 
	
        Reporter.log("Test case ended |");
		
	}
	@Test
	public void confirmAlertTestCase() {
		Reporter.log("Logging for Confirmalert started");
		driver.findElement(By.xpath("//button[contains(@class,'blue')]")).click();
        Reporter.log("Confirm Alert opened |");
        //Switch to alert window
	
        Alert confirmAlert = driver.switchTo().alert();
	
        Reporter.log("Switched foucs to alert |");
        //Get text in the alert box and print it
	
        String alertText = confirmAlert.getText();
	
        Reporter.log("Alert text is: " + alertText + " |");
	
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
        confirmAlert.accept();
        Reporter.log("Alert closed |");	
        Reporter.log("Test case ended |");
	}
	@Test
	public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
    	
        //Click the button to open a simple alert
	
        driver.findElement(By.id("prompt")).click();
	
        Reporter.log("Prompt Alert opened |");
	
 
	
        //Switch to alert window
	
        Alert promptAlert = driver.switchTo().alert();
	
        Reporter.log("Switched foucs to alert |");
	
 
	
        //Get text in the alert box and print it
	
        String alertText = promptAlert.getText();
	
        Reporter.log("Alert text is: " + alertText + " |");
	
 
	
        promptAlert.sendKeys("Awesome!");
	
        Reporter.log("Text entered in prompt alert |");
	
        
	
        //Assertion
	
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);
	
 
	
        promptAlert.accept();
	
        Reporter.log("Alert closed |");
	
 
	
        Reporter.log("Test case ended |");
	}
}
