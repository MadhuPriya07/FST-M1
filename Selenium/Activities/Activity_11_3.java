package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert promptAlert= driver.switchTo().alert();
		promptAlert.sendKeys("Yes, you are!");
		promptAlert.accept();
		driver.close();
	}

}
