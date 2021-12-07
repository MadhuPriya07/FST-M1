package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println(driver.getTitle());
		
		//Find the third header on the page.
		String text_3header=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println(text_3header);
		
		System.out.println("Fifth header color css value "+driver.findElement(By.xpath("//h5")).getCssValue("color"));
		
		String violetClassAttributeValue=driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
		System.out.println(violetClassAttributeValue);
		
		
		
	}
}
