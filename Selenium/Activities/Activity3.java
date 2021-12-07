package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to("https://training-support.net/selenium/simple-form");
		
		String titleOfPage= driver.getTitle();
		System.out.println(titleOfPage);
		
		driver.findElement(By.id("firstName")).sendKeys("Madhu");
		driver.findElement(By.id("lastName")).sendKeys("Priya");
		driver.findElement(By.id("email")).sendKeys("mpmadhupriya280@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9972510619");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		System.out.println(driver.findElement(By.id("firstName")).getText());
		
		driver.close();
	}

}
