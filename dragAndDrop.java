import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/droppable");
		
		//switching to proper frame
		driver.switchTo().frame(0);
		
		//Creating Actions class object for doing drag and drop
		Actions a = new Actions(driver);
		
		//Creating web elements needed for draganddrop method of Actions class
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Using draganddrop method with Actions object to do drag and drop
		a.dragAndDrop(source, target).build().perform();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//go back to original website outside the frame
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
