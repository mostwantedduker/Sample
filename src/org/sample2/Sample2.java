package org.sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO PC\\eclipse-workspace\\sample2\\driver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	
	WebElement txtusername = driver.findElement(By.id ("email"));
	txtusername.sendKeys("Vignesh");
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("1234456");
	
	driver.quit();
	
}
}
