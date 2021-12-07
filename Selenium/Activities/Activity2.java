package FST_Selenium.FST_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title= driver.getTitle();
		System.out.println(title);
		
		WebElement byId=driver.findElement(By.id("about-link"));
		System.out.println(byId.getText());
		
		WebElement byClass= driver.findElement(By.className("inverted"));
		System.out.println(byClass.getText());
		
		WebElement bylinkText= driver.findElement(By.linkText("About Us"));
		System.out.println(bylinkText.getText());
		
		WebElement byCSS= driver.findElement(By.cssSelector(".green"));
		System.out.println(byCSS.getText());
		
		driver.close();
		

	}

}
