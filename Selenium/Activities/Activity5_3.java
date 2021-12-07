package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement element=driver.findElement(By.xpath("//div[@id='dynamicText']"));
		if(element.isEnabled()) {
			System.out.println("Input field was already enabled");
		}
		
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		
		if(element.isEnabled()) {
			System.out.println("It got enabled just now");
		}
		
		driver.close();
	}

}
