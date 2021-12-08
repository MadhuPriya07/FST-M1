package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);    	
        Actions builder = new Actions(driver);
		driver.navigate().to("https://www.training-support.net/selenium/popups");
		System.out.println(driver.getTitle());
		
		WebElement signOnButton=driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
		builder.moveToElement(signOnButton);
		System.out.println("Tooltip text: "+signOnButton.getAttribute("data-tooltip"));
		
		signOnButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        //Find username and pasword and fill in the details
		
        driver.findElement(By.id("username")).sendKeys("admin");
	
        driver.findElement(By.id("password")).sendKeys("password");
	
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Read the login message
    	
        String message = driver.findElement(By.id("action-confirmation")).getText();
	
        System.out.println(message);
	
        driver.close();
	}

}
