import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th")).size());
		
		List<WebElement> thirdRow= driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for(int i=0;i<thirdRow.size();i++) {
			String element=thirdRow.get(i).getText();
			System.out.println(element);
		}
		
		driver.quit();

	}

}
