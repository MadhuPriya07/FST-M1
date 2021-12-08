package IBMFST_TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	@BeforeMethod
	public void inititeDriver() {
		 driver= new FirefoxDriver();
		driver.get("https://www.training-support.net");	  
	}
	@Test
	public void test1() {
		System.out.println(driver.getTitle());
		Assert.assertEquals("Training Support",driver.getTitle());
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		System.out.println("New title of the page is :"+ driver.getTitle());
		
	}
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
