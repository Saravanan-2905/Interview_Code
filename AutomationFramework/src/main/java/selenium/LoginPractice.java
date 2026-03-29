package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		
		WebElement username1 = driver.findElement(By.xpath("//input[@name='username']"));
		
		username1.sendKeys("Admin");
			
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
		
		

	}

}
