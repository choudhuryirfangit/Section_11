import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> num=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int ts=0;
		for(int i=0;i<num.size();i++) {
			int s=Integer.parseInt(num.get(i).getText());
			ts=ts+s;
		
		}
		System.out.println(ts);
		String totalAmount=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		int trimmedtotal= Integer.parseInt(totalAmount.split(":")[1].trim());
		System.out.println(trimmedtotal);
		Assert.assertEquals(trimmedtotal, ts);
//		driver.quit();
		
		List<WebElement> num2=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int ts2=0;
		for(int i=0;i<num2.size();i++) {
			int s2=Integer.parseInt(num2.get(i).getText());
			ts2=ts2+s2;
		}
		System.out.println(ts2);
		driver.quit();

	}

}
