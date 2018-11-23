import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bofalogin_hk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankofamerica.com/");
		driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys("hkapuj00125862");
		driver.findElement(By.cssSelector("input[name='passcode1']")).sendKeys("12345");
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
