
package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

	WebDriver driver;

	By signupLink = By.xpath("//button[text()='Sign Up']");
	By firstName = By.name("userFirstName");
	By emailID = By.name("userEmail");
	By password = By.name("userPassword");
	By confirmPassword = By.name("userConfirmPassword");
	By button = By.id("signUp");
	By verifyYes = By.xpath("//button[text()='Yes']");
	By title = By.xpath("//h3[text()='Verify Email']");
	
	//By img = By.xpath("xxxxx");   to validate the presence of logo

	SignupPage(WebDriver d) {
		driver = d;
	}

	public void clickSignupLink() {
		driver.findElement(signupLink).click();
	}

	public void giveFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void giveEmailId(String mailid) {
		driver.findElement(emailID).sendKeys(mailid);
	}

	public void givePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void givecnfPassword(String cnfpass) {
		driver.findElement(confirmPassword).sendKeys(cnfpass);
	}

	public void submitButton() {
		driver.findElement(button).click();

	}

	public void verifyEmailYes() {
		driver.findElement(verifyYes).click();

	}
	
	public void verifyTitle() {
		driver.findElement(title).isDisplayed();
	}
	
	//public boolean checkLogo() {
		//boolean status = driver.findElement(img).isDisplayed();
		//return status;
	//}
	

}
