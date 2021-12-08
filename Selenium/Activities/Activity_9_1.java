package FST_Selenium.FST_SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement chosen= driver.findElement(By.id("single-value"));
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='single-select']"));
		Select sel= new Select(dropdown);
		sel.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		
		sel.selectByIndex(3);
		System.out.println(chosen.getText());
		
		sel.selectByValue("4");
		System.out.println(chosen.getText());
		
		
        List<WebElement> options = sel.getOptions();
    	
        //Print them
	
        for(WebElement option : options) {
	
            System.out.println("Option: " + option.getText());
	
        }
		driver.close();
	}

}
