package FST_Selenium.FST_SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement multi_select_element= driver.findElement(By.id("multi-value"));
		System.out.println(multi_select_element.getText());
		
		WebElement options = driver.findElement(By.xpath("//select[@id='multi-select']"));
		Select dropdown= new Select(options);
		
		if(dropdown.isMultiple()) {
			System.out.println("Its a multi-choice option");
			dropdown.selectByVisibleText("Javascript");
			dropdown.selectByValue("node");
            for(int i=4; i<=6; i++) {            	
            	dropdown.selectByIndex(i);	
            }
            dropdown.deselectByValue("node");
            dropdown.deselectByIndex(7);
            
            List<WebElement> alloptions= dropdown.getAllSelectedOptions();
            for(WebElement ele: alloptions) {
            	System.out.println("Selected Options: "+ele.getText());
            }
            dropdown.deselectAll();
            System.out.println(multi_select_element.getText());
			
		}
		
		driver.close();
		
		
	}

}
