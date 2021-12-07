package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		
		WebElement ele1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(ele1.isSelected()) {
			System.out.println("Check box is selected already");
		}
		ele1.click();
		
		if(ele1.isSelected()) {
			System.out.println("I selected check box just now");
		}
		
		driver.close();

	}

}
