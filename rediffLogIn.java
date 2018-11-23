import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("jilf");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		//driver.findElement(By.cssSelector("input[title='Sign in']")).click();
		//driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div[style*='float:']")).getText());
		//driver.close();
		
	}

}
