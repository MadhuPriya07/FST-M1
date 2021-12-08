package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		System.out.println("Title of the page is :"+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Alert confirmAlert= driver.switchTo().alert();
		System.out.println("Text on Alert is :"+confirmAlert.getText());
		
		confirmAlert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		confirmAlert= driver.switchTo().alert();
		System.out.println("Dismissing the alert");
		confirmAlert.dismiss();
		
		driver.close();
		

	}

}
