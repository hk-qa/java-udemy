import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnTabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Define the webelement footerdriver that will be used to narrow the focus to footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		//This should only print out the # of links in the footer section
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Define the webelement column driver which will only focus on content in that column of the footer
		WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		//This should only print out links in the column targeted
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//Use for loop to open all the tabs
		for(int i = 0; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			
			//Store the simultaneous key press of Control and Enter keys in clickOnLink var
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			//Open various links in separate browser tabs one by one by simulating pressing of Control and Enter keys simultaneously
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
			Thread.sleep(5000L);
		}
		
		//Do the following two steps to get info about the # of tabs and link them to an iterator 
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		//Use while loop to go to all the opened tabs and print the title of each tab
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.close();

	}

}
