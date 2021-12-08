package FST_Selenium.FST_SeleniumProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,0);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Title of the browser is :"+driver.getTitle());
		String parentWindow= driver.getWindowHandle();
		System.out.println("Window handle is :"+parentWindow);
		
		driver.findElement(By.xpath("//a[@id='launcher']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> allwindow= driver.getWindowHandles();
		for(String window:allwindow) {
			driver.switchTo().window(window);  
			System.out.println(driver.getTitle());
			System.out.println(window);
		}
		
		driver.quit();

	}

}
