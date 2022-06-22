package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

	public class Zerodahomepage {
	@FindBy(xpath="//input[@type='text']") private WebElement searchbar;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]") private WebElement trading;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[11]") private WebElement longterm;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]") private WebElement mis;
	@FindBy(xpath="(//input[@type=\"number\"])[1]") private WebElement quantity;
	@FindBy(xpath="(//input[@type=\"number\"])[2]") private WebElement price;
	@FindBy(xpath="(//input[@type=\"number\"])[3]") private WebElement triggerprice;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[12]") private WebElement market;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[13]") private WebElement limit;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[14]") private WebElement stoploss;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[15]") private WebElement marketstoploss;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy(xpath="(//button[@type=\"button\"])[1]") private WebElement buy;
	@FindBy(xpath="(//button[@type=\"button\"])[2]") private WebElement sell;
	@FindBy(xpath="(//span[@class=\"icon icon-trending-up\"])[1]") private WebElement chart;
	@FindBy(xpath="//span[@class='icon icon-align-center']") private WebElement depth;
	@FindBy(xpath="//span[@class=\"icon icon-plus\"]") private WebElement add;
	@FindBy(xpath="(//span[@class=\"symbol\"])[1]") private WebElement Wipro;
	@FindBy(xpath="//span[@data-balloon=\"Buy (B)\"]") private WebElement buyw;
	@FindBy(xpath="//span[@data-balloon=\"Sell (S)\"]") private WebElement sellw;
	@FindBy(xpath="(//button[@class=\"button-blue\"])[1]") private WebElement buyt;
	@FindBy(xpath="//span[@class='symbol']") private List<WebElement> specificshare;
	@FindBy(xpath="//button[@type='submit']") private WebElement buys;
	@FindBy(xpath="((//div[@class=\"info\"])[5]") private WebElement delete;
	@FindBy(xpath="//button[@class='button-outline button-blue']") private WebElement mdassert;
	@FindBy(xpath="(//div[@class=\"label\"])[1]") private WebElement ocassert;
	@FindBy(xpath="//span[text()='Orders']") private WebElement order;
	@FindBy(xpath="//div[@class='message']") private WebElement msg;
	@FindBy(xpath="//li[@class=\"search-result-item\"]") private List<WebElement> share;
	public Zerodahomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void entersearchtext(String share,WebDriver driver) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(10000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(searchbar));
		searchbar.sendKeys(share);
		

	}
	public void clickonbuy(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(trading);
		a.perform();
		buy.click();	
	}
	public void clickonmis() {
		mis.click();
	}
	public void clickonlongterm() {
		longterm.click();
	}
	public void clickonmarket() {
		market.click();
	}
	public void clickonstoploss() {
		stoploss.click();
	}
	public void Enterquantity() {
		quantity.clear();
		quantity.sendKeys("1");
	}
	public void setprice() {
		price.sendKeys("69928");
	}
	public void settriggerprice() {
		triggerprice.sendKeys("69920");
	}
	public void clickonsubmit() {
		submit.click();
	}
	public void clickonsell(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(trading);
		a.perform();
		sell.click();
	}
	public void clickonchart(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(trading);
		a.perform();
		chart.click();
	}
	public void clickondepth(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(trading);
		a.perform();
		depth.click();
	}
	public void clickonadd(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(trading);
		a.perform();
		add.click();
	}
	public void clickonbuywipro(WebDriver driver) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(50000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(Wipro));
		Actions c =new Actions(driver);
		c.moveToElement(Wipro);
		c.perform();
		buyw.click();
	}
	public void clickonsellwipro(WebDriver driver) {
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(50000));
		wait.pollingEvery(Duration.ofMillis(50));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(Wipro));
		Actions c =new Actions(driver);
		c.moveToElement(Wipro);
		c.perform();
		sellw.click();
		
	}
	public  void specificshare(WebDriver driver) {
		int num=specificshare.size();
		System.out.println(num);
		for(int k=0;k<=num-1;k++) {
			WebElement c=specificshare.get(k);
			 String share=c.getText();
			 if(share.equalsIgnoreCase("WIPRO")) {
				 Actions act= new Actions(driver);
				 act.moveToElement(c);
				 act.perform();
				 buy.click();
				 buys.click();
			 }
		}
	}
	
	public void deletestock(WebDriver driver) {
		int number = specificshare.size();
		for(int z=0;z<number-1;z++){
			WebElement d=specificshare.get(z);
			String stock=d.getText();
			if(stock.equalsIgnoreCase("LT")) {
				Actions act= new Actions(driver);
				act.moveToElement(d);
				act.perform();
				delete.click();
			}
		}	
	}
	public String assertformarketdepth(WebDriver driver) {
		Actions act= new Actions(driver);
		act.moveToElement(mdassert);
		act.perform();
		String Text=mdassert.getText();
		return Text;
	}
	public boolean assertforopenchart(WebDriver driver) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(20000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(ocassert));
		Actions act= new Actions(driver);
		act.moveToElement(ocassert);
		act.perform();
		boolean result=ocassert.isDisplayed();
		return result;
	}
	public boolean asserforbuysharesearchtext(WebDriver driver) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(20000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(msg));
		Actions act= new Actions(driver);
		act.moveToElement(msg);
		Boolean value=msg.isDisplayed();
		return value;
	}
	public void buysharespecificfromsearchtext(WebDriver driver) {
		for(int i=0;i<share.size();i++) {
			WebElement k=share.get(i);
			String d=k.getText();
			if(d.equalsIgnoreCase("TATAMOTORS JUN 310 CE")) {
				Actions act= new Actions(driver);
				act.moveToElement(k);
				act.moveToElement(buyt);
				act.click();
				act.perform();
				
			}
			
		}
	}
	
	
	
	
}
