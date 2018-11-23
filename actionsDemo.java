import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		
		WebElement nameBox = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-2']"));
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		a.moveToElement(nameBox).build().perform();
	
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("Mens Sandals").build().perform();
		


	}

}
