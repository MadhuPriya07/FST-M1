package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement ele1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(ele1.isDisplayed()) {
			System.out.println("Check box is displayed");
		}
		driver.findElement(By.xpath("//button[text()='Remove checkbox']")).click();
		
		if(ele1.isDisplayed()) {
			System.out.println("Check box still displayed");
		}
		
		driver.close();

	}

}
