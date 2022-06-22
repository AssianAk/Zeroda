package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodaloginpage {
	@FindBy (xpath="//input[@id='userid']") private WebElement userid;
	@FindBy (xpath="//input[@id='password']") private WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	@FindBy (xpath="//span[text()=\"User ID should be minimum 6 characters.\"]") private WebElement error;
	
	
	public Zerodaloginpage (WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void Enterusername(String Username) {
		userid.sendKeys(Username);
	}
	public void Enterpass(String Password) {
		pass.sendKeys(Password);
	}
	public void clicklogin() {
		login.click();
	}
	public void clickforgotpassword() {
		forgot.click();
	}
	public void clicksignup() {
		signup.click();
	}
	public String geterror() {
		String text=error.getText();
		return  text;
		
	}


}
