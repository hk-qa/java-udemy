
//package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

public static void main(String[] args) {

// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HITESH KAPUR\\Desktop\\drivers\\chromedriver.exe");

WebDriver driver=new FirefoxDriver();

driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

System.out.println(driver.switchTo().alert().getText()); // to get text from alert box

//driver.switchTo().alert().sendKeys("fesfe"); // to send text to alert box

driver.switchTo().alert().accept(); //Accept = ok done yes

//driver.switchTo().alert().dismiss(); // to cancel

}

}
