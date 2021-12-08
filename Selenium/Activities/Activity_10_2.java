package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		
		System.out.println(driver.getTitle());
		
		Actions action = new Actions(driver);
		
		action.sendKeys("M").build().perform();
		System.out.println(pressedKey.getText());
		
        Action actionSequence2 = action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
	
        actionSequence2.perform();
	    System.out.println("Pressed key is: " + pressedKey.getText());
	    
	    driver.close();
		
	}

}
