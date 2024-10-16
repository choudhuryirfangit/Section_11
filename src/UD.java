import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		//Download
		driver.findElement(By.cssSelector("#downloadButton")).click();
		//Upload
		WebElement upload=driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:\\Selenium_2024\\download.xlsx");
		
		//wait for popup message to disappear
		By toastLocator=By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText=driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.", toastText);
		w.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		
		
		}

	}

