package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println(driver.getTitle());
		Actions builder=new Actions(driver);
		
		WebElement cube= driver.findElement(By.id("wrapD3Cube"));
		//Left click
		builder.click(cube);
		WebElement activeElement=driver.findElement(By.className("active"));
		System.out.println(activeElement.getText());
		
		//doubleClick 
		builder.doubleClick(cube).perform();
		activeElement=driver.findElement(By.className("active"));
		System.out.println(activeElement.getText()+" post double click");
		
		//rightClick
		builder.contextClick(cube).perform();
		activeElement=driver.findElement(By.className("active"));
		System.out.println(activeElement.getText()+" post right click");
		
		driver.close();
	}

}
