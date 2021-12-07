package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("Madhu");
		driver.findElement(By.id("lastName")).sendKeys("Priya");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9972510619");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
