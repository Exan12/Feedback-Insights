package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeedbackInsightTest {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dev.survey.insightspulse.net/");
		
		// Login to the Application
		driver.findElement(By.id("mat-input-10")).sendKeys("manoj@webileapps.com");
		driver.findElement(By.id("mat-input-11")).sendKeys("admin1!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		// Click on Create Survey
		
	}

}
