package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/ajax");
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
		driver.findElement(By.cssSelector(".ui.violet.button")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "This text is loaded using AJAX"));
		
		String str=driver.findElement(By.id("ajax-content")).getText();
		System.out.println(str);
		
		//wait for late text
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		String str2=driver.findElement(By.id("ajax-content")).getText();
		System.out.println("Later Text is: "+str2);
		
		driver.close();
		
	}

}
