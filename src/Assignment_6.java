import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


//import dev.failsafe.internal.util.Assert;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//Checking the Checkbox
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]/input")).click();
		String name=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText());
		
		//Select picklist value
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(name);
		System.out.println(s.getFirstSelectedOption().getText());
		
		//Entering text
		driver.findElement(By.id("name")).sendKeys(name);
		
		//Alert
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		String a=alertText.split(" ")[1].trim().split(",")[0].trim();
		System.out.println(a);
		Assert.assertEquals(a, name);
		driver.quit();
		
		

		

	}

}
