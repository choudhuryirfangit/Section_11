import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
				
				System.out.println(driver.findElements(By.tagName("a")).size());
				WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
				System.out.println(footerDriver.findElements(By.tagName("a")).size());
				WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(columnDriver.findElements(By.tagName("a")).size());
				
				for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
					
					String clickOnElement=Keys.chord(Keys.CONTROL,Keys.ENTER);
					columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnElement);
//					driver.switchTo().window();
//					Thread.sleep(3000);
				}
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> at=windows.iterator();
//				at.next();
				while(at.hasNext()) {
			
					driver.switchTo().window(at.next());
					System.out.println(driver.getTitle());
				}

	}

}
