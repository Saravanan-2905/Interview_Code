package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./Flipkart.png");
		
		FileUtils.copyFile(source, target);
		
	}


}
