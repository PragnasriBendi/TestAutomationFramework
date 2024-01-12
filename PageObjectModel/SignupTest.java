package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupTest {

	@Test
	public void verifyCandSignup() throws InterruptedException {
		ChromeOptions ChromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver(ChromeOpt);

		driver.manage().window().maximize();
		
		SignupPage2 spage = new SignupPage2(driver);
		driver.get("https://sit.vriti.ai/");
		
		spage.clickSignupLink();
		Thread.sleep(3000);
		spage.giveFirstName("Lucky");
		spage.giveEmailId("lucky04@yopmail.com");
		spage.givePassword("Pragna@123");
		spage.givecnfPassword("Pragna@123");
		
		spage.submitButton();
		Thread.sleep(3000);
		spage.verifyEmailYes();
	}
}
