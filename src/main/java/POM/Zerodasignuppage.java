package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Zerodasignuppage {
	@FindBy(xpath="//input[@id='user_mobile']") private WebElement mobno;
	@FindBy(xpath="//button[@id='open_account_proceed_form']") private WebElement submit;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']") private WebElement wanttoopennriaccount;
	
	public Zerodasignuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void entermobilenumber(String mobileno,WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(10000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(mobno));
		mobno.sendKeys(mobileno);
	}
	public void clickonsubmit() {
		submit.click();
	}
	public void clickonwanttoopennriaccount() {
		wanttoopennriaccount.click();
	}

}
