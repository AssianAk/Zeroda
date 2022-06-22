package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import POJO.Browser;

public class Zerodapinpage {
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot 2FA?']") private WebElement forgotpin;
	@FindBy(xpath="//a[@class=\"text-light\"]") private WebElement signup;
	
	public Zerodapinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void Enterpin(String pinnumber,WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));//total wait time
		wait.pollingEvery(Duration.ofMillis(50));//rechecking time
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(pin));
	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(5000));//Explicit wait 
	//wait.until(ExpectedConditions.visibilityOf(pin));//will recheck the element 500ms
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
	pin.sendKeys(pinnumber);
	}
	public void clickonsubmit() {
		submit.click();
	}
	public void clickonforgotpin() {
		forgotpin.click();
	}
	public void clickonsignup() {
		signup.click();
	}
}
