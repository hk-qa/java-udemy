import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame(2);
	
		//go to this website for details on locator used (CSS selector) as chropath can't find this locator - https://www.swtestacademy.com/selenium-webdriver-frames/
		System.out.println(driver.findElement(By.cssSelector("html>body>h2")).getText());
		
		driver.close();

	}

}
