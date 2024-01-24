package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage2 {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	WebElement signupLink;
	
	@FindBy(name = "userFirstName")
	WebElement firstName;
	
	@FindBy(name = "userEmail")
	WebElement emailID;
	
	@FindBy(name = "userPassword")
	WebElement password;
	
	@FindBy(name = "userConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id = "signUp")
	WebElement button;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement verifyYes;
	
	//@FindBy(name="xxxxx")
	//WebElement img;
	
	//@FindBy(tagName="a")
	//List<WebElement> links;
	
	SignupPage2(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void clickSignupLink() {
		signupLink.click();
	}
	
	public void giveFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void giveEmailId(String mailid) {
		emailID.sendKeys(mailid);
	}
	
	public void givePassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void givecnfPassword(String cnfpass) {
		confirmPassword.sendKeys(cnfpass);
	}
	
	public void submitButton() {
		button.click();
	}
	
	public void verifyEmailYes() {
		verifyYes.click();
	}
	
	//public boolean checkLogo() {
			//boolean status = img.isDisplayed();
			//return status;
		//}
		

}
