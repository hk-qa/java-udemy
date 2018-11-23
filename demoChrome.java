import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("div.global-nav-login-flydown.global-login")).click();
		System.out.println("The title at the login page is: " + driver.getTitle());
		//String imgName = driver.findElement(By.cssSelector("img#logo.standard_logo")).getText();
		//System.out.println("Image name is: " + imgName);
		driver.findElement(By.id("username")).sendKeys("HK");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		String errorMsg = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println("The error message is: " + errorMsg);
		driver.close();
	}

}
