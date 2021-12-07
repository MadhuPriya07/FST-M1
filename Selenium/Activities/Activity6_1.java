package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver,0);
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement element=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		element.click();
		WebElement checkbox=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		element.click();
		
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
		System.out.println("Checkbox clicked succesfully");
		
		driver.close();

	}

}
