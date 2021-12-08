package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.training-support.net/selenium/iframes");
		
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Details of the iFrames
		
		String iFrame1Title=driver.switchTo().frame(0).getTitle();
		System.out.println(iFrame1Title);
		
		WebElement iFrame1button= driver.findElement(By.xpath("//button[@id='actionButton']"));
		System.out.println(iFrame1button.getText());
		System.out.println(iFrame1button.getCssValue("background-color"));
		
		iFrame1button.click();
		System.out.println(iFrame1button.getText());
		System.out.println(iFrame1button.getCssValue("background-color"));
		
		driver.switchTo().parentFrame();
        //Switch to second iFrame on the page
		
        System.out.println(driver.switchTo().frame(1).getTitle());
        WebElement iFrame2button= driver.findElement(By.xpath("//button[@id='actionButton']"));
        System.out.println(iFrame2button.getText());
		System.out.println(iFrame2button.getCssValue("background-color"));
		
		iFrame2button.click();
		System.out.println(iFrame2button.getText());
		System.out.println(iFrame2button.getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		driver.close();
		
		

	}

}
