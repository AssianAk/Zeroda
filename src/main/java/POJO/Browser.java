package POJO;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Browser {
	public static WebDriver Openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
		
	}
	public static  void fluentwait(WebDriver driver,int a,int b,WebElement Element) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(a));
		wait.pollingEvery(Duration.ofMillis(b));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(Element));

	}
	
		
	

}
