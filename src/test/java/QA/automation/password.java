package QA.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://f5global.com/");
		driver.get("https://f5global.com/account/login");
		driver.findElement(By.xpath("//a[@class='static_anchor']")).click();
		driver.findElement(By.xpath("//input[@class='input_valid']")).sendKeys("Priyanka@yopmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		System.out.println("We've sent you an email with a link to update your password.");
		
		//click on breadcrumbs //
		
		driver.findElement(By.xpath("//a[@title ='Home']")).click();
	}

}
