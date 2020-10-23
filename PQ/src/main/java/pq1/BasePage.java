package pq1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {

	static WebDriver driver;
	static WebDriverWait wait;
	static LandingPage LP;
	
	@BeforeTest
	public static void initConfiguration() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://dotnetfiddle.net/");
		
		wait=new WebDriverWait(driver, 5);
		LP = PageFactory.initElements(driver, LandingPage.class);
	}
	
	
	
	@AfterTest
	public static void tearDown() {
		
		driver.quit();
	}
	
	
}
