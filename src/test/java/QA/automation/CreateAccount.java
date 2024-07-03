package QA.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://f5global.com/");
	driver.get("https://f5global.com/account/login");
	driver.get("https://f5global.com/account/register");
	driver.findElement(By.id("RegisterForm-FirstName")).sendKeys("priyanka");
	driver.findElement(By.id("RegisterForm-LastName")).sendKeys("priyanka");
	driver.findElement(By.id("RegisterForm-email")).sendKeys("priyanka@yopmail.com");
	driver.findElement(By.id("RegisterForm-password")).sendKeys("Password@123");
	driver.findElement(By.id("RegisterForm-confirmPassword")).sendKeys("Password@123");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("return window.getComputedStyle(document.querySelector('.checkbox-div'),'::after').getPropertyValue('content')");
	
	}
}
