package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodaforgotpage {
	
	@FindBy(xpath="//input[@id='radio-30']") private WebElement rememberuserid;
	@FindBy(xpath="//input[@id='radio-31']") private WebElement forgotuserid;
	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement userid;
	@FindBy( xpath = "//input[@placeholder='PAN']") private WebElement Pan;
	@FindBy(xpath="//input[@id='radio-35']") private WebElement Email;
	@FindBy(xpath="//input[@id='radio-36']" ) private WebElement Sms;
	@FindBy (xpath="//input[@placeholder='E-mail (as on account)']") private WebElement Emailasacoount;
	@FindBy(xpath="//button[@type='submit']") private WebElement reset;
	@FindBy (xpath="(//a[@href=\"/\"])[2]") private WebElement backtologin;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	
	public Zerodaforgotpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonremberuserid() {
		rememberuserid.click();
	}
	public void clickonforgotuserid() {
		forgotuserid.click();
	}
	public void enteruserid(String username) {
		userid.sendKeys(username);
	}
	public void entepanno(String panno) {
		Pan.sendKeys(panno);
	}
	public void clickonemail() {
		Email.click();
	}
	public void clickonsms() {
		Sms.click();
	}
	public void Enteremailid(String Email) {
		Emailasacoount.sendKeys(Email);
	}
	public void clickonreset() {
		reset.click();
	}
	public void clickonbacktologin() {
		backtologin.click();
	}
	public void clickonsignup() {
		signup.click();
	}
	
	
	
	
	
	
	
	
}
