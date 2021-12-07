package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
	
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println(driver.getTitle());
		
		//filling signup-
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Madhu");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("December07");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("December07");
		driver.findElement(By.xpath("//label[text()='Email']/following::input[1]")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
    	
        System.out.println("Login message: " + loginMessage);
	
        driver.close();
		
	}

}
