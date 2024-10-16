import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthNumber="6";
		String date="15";
		String year="2027";
		String[] expectedValues= {monthNumber,date,year};
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
//		driver.findElement(By.cssSelector(".react-date-picker__inputGroup"));
		List<WebElement> values= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getAttribute("value"));
			Assert.assertEquals(values.get(i).getAttribute("value"), expectedValues[i]);
			
		}
		driver.quit();

		

	}

}
