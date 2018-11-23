import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.linkText("Privacy")).click();
		
		//Get windows handles - do this only after opening child window
		Set<String> ids = driver.getWindowHandles();
		
		//Create iterator object to iterate through various windows
		Iterator<String> it = ids.iterator();
		
		//Get ids of various windows - first id is always parent window
		String parent = it.next();
		String childWindow1 = it.next();
		
		//Go to parent window
		driver.switchTo().window(parent);
		System.out.println("Parent window");
		System.out.println(driver.getTitle());
		
		//Go to child window
		driver.switchTo().window(childWindow1);
		System.out.println("child window");
		System.out.println(driver.getTitle());
		driver.close();
		
		//Go back to parent window
		driver.switchTo().window(parent);
		System.out.println("Back to Parent window");
		System.out.println(driver.getTitle());
		
		driver.close();	
	}

}
