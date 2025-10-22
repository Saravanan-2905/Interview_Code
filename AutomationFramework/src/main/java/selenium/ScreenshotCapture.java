package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotCapture {

	public static void main(String[] args) throws Exception {
			
		WebDriver driver = new ChromeDriver();
			
		
		screenshotCapture(driver, "https://www.amazon.com");
		
	}
	
	public static void screenshotCapture(WebDriver driver, String url) throws Exception
	{ 
		driver.get(url);
		
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File target = new File(".//screenshots//"+driver.getTitle()+ ".png");
		
		FileUtils.copyFile(src, target);
		
		driver.quit();
	}
	
	
	

}
