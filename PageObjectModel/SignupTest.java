package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://sit.vriti.ai/");
	}
	
	
	
	/*
	 * @Test public void testLogo() { SignupPage spage = new SignupPage(driver);
	 * Assert.assertEquals(spage.checkLogo(), true); }
	 */
	

	@Test
	public void verifyCandSignup() throws InterruptedException {
		
		SignupPage spage = new SignupPage(driver);
		
		spage.clickSignupLink();
		spage.giveFirstName("Lucky");
		spage.giveEmailId("lucky08@yopmail.com");
		spage.givePassword("Pragna@123");
		spage.givecnfPassword("Pragna@123");
		spage.submitButton();
		spage.verifyEmailYes();
		Assert.assertEquals(driver.getTitle(), "Verify Email");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
}
