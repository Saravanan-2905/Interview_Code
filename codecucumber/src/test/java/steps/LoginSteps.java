package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Login']")));
//	    element.isDisplayed();
	}
	
	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element.sendKeys(password);
	}

	@Given("User enter the username as Admin")
	public void userEnterTheUsernameAsOrtoni() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

	@Given("User enter the password as admin123")
	public void userEnterThePasswordAsPass() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

	@When("User click the login button")
	public void userClickTheLoginPage() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		String text = driver.findElement(By.xpath("//img[@alt='profile picture']/following-sibling::p[1]")).getText();
		System.out.println(text);
		
		driver.quit();
	}
	
	@Given("User enter the username as Admins")
	public void userEnterTheUsernameAsAdmins() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

	@Given("User enter the password as admin1234")
	public void userEnterThePasswordAsAdmin() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1234");
	}

	@But("Login should be fail")
	public void loginShouldBeFail() {		
		String errorMsg = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText();
		Assert.assertEquals(errorMsg, "Invalid credentials");
		driver.quit();
	}


}
