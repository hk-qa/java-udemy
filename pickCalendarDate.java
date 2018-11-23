import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pickCalendarDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		
		String currentMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText().contains(currentMonth)) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		//String currentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default ui-state-active']")).getText();
		
		String currentDate = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[1]/table/tbody/tr[2]/td[3]/a)")).getText();
		
		System.out.println("Current Date is: " + currentDate);
		
		int count1=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).size();
		 System.out.println(count1);
		 
		 for(int i=0;i<count1;i++) {
			 String s1=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).get(i).getText();
			  System.out.println(s1);
			  
			  if(s1.equalsIgnoreCase(currentDate)) {
				  driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).get(i).click();
				  break;

			  }

		 }


	}

}
