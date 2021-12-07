package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		
		System.out.println("Title of the Page is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@class,username)]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,password)]")).sendKeys("password");
		
		driver.findElement(By.cssSelector(".ui.button")).click();
		
		
	}
}
