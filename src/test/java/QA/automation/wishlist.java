package QA.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wishlist {
	
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://f5global.com/");
		
		driver.findElement(By.xpath("//button[@data-variant-id='44137964044457']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-variant-id='44137964044457']")));
		element.click();
		
		driver.findElement(By.xpath("//a[@href='/pages/swym-wishlist']")).click();
		
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='swym-custom-add-toCartBtn']")));
		element1.click();
		
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='checkout']")));
		element2.click();
		
	}

}
