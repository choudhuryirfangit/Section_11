import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEstInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://shop.advanceautoparts.com/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());		
		;
	}

}
