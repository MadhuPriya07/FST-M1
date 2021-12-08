package FST_Selenium.FST_SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
		
		System.out.println("Number of Rows is: "+rows);
		System.out.println("Number of colomns is: "+cols);
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement row:thirdRow) {
			System.out.println("Cell Value: " + row.getText());
		}
		
        //Cell value of second row, second column
		
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
	
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
	
	
        driver.close();
	}

}
