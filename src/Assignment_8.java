import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		
//		Done by Raul Shetty
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).getAttribute("value");
		
		
		
//		Done By Me
//		List<WebElement> options= driver.findElements(By.cssSelector(".ui-menu-item div"));
//		
//		for(WebElement option:options) {
//			if(option.getText().equalsIgnoreCase("India")) {
////				option.click();
//				String v=option.getText();
//				Actions a=new Actions(driver);
//				a.moveToElement(option).build().perform();
//				
//				break;
//			}
//		
//		}
		driver.quit();

	}

}
