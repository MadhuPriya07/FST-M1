package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/drag-drop");
		Actions actions = new Actions(driver);
		
		System.out.println(driver.getTitle());
		
        // Declare new WebDriverWait
		
        WebDriverWait wait = new WebDriverWait(driver, 10);        
		
		WebElement football= driver.findElement(By.xpath("//img[@id='draggable']"));
		WebElement dropZone1= driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement dropZone2= driver.findElement(By.xpath("//div[@id='dropzone2']"));
		
		//dragging it to dropZone1
		actions.dragAndDrop(football, dropZone1).build().perform();
		
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1, "background-color"));
         	
        System.out.println("ENTERED DROPZONE 1");
		
		actions.dragAndDrop(football, dropZone2);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2, "background-color"));
      	
	        System.out.println("ENTERED DROPZONE 2");
	}

}
