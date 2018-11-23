import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo_ie {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
