package QA.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pdpnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://f5global.com/");
		
		WebElement pro=driver.findElement(By.xpath("//h3[@id='title-template--17169778475177__featured_collection_xkEmjW-8086808264873']"));
		pro.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
                                                         //label[@for='template--17169778704553__main-2-3']
		WebElement size=driver.findElement(By.xpath("//a[@class='link']"));
		size.click();
		System.out.print("vivek");
		

	}

}
