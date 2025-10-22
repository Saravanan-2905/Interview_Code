package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		dropdown(driver, "https://www.globalsqa.com/demo-site/select-dropdown-menu/", "//select", "India");
		

	}
	
	public static void dropdown(WebDriver driver, String url, String locator,  String selectValue)
	{
		driver.get(url);
		
		WebElement element = driver.findElement(By.xpath(locator));
		
		Select select = new Select(element);
		
		List<WebElement> optList = select.getOptions();
		
		System.out.println(optList.size());
		
		for(WebElement e : optList)
		{
			String text = e.getText();
			
			System.out.println(text);
			
			if(text.equals(selectValue))
			{
				e.click();
				break;
			}
		}
		
		driver.quit();
		}

}
