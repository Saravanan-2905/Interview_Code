package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[normalize-space(text())='Open Multiple Windows']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(d -> d.getWindowHandles().size() == 3);
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String window : allWindow)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				System.out.println("Child title: " + driver.getTitle());
				driver.manage().window().maximize();		
				break;
			}
		}
		
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@align='center']"))).getText();
		
		System.out.println(text);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.quit();	
	}

}
