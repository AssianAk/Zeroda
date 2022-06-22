package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Zerodaloginpage;
import POM.Zerodasignuppage;
import Utility.Parameter;

public class Testzerodasignuppage {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver = Browser.Openbrowser();
	}
	@Test
	public void zerodasignuppagelinkTest() throws EncryptedDocumentException, IOException {
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		zerodaloginpage.clicksignup();
		Set<String> adress=driver.getWindowHandles();
		Iterator<String> Adress= adress.iterator();
		while(Adress.hasNext()) {
			String name= Adress.next();
			driver.switchTo().window(name);
			String title=driver.getCurrentUrl();
		if(title.equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account")){
			String mobno=Parameter.parameterization(3, 1);
			Zerodasignuppage zerodasignuppage=new Zerodasignuppage(driver);
			zerodasignuppage.entermobilenumber(mobno, driver);
			zerodasignuppage.clickonsubmit();
		}
		}
	}
	@Test
	public void wanttoopennriaccountlinkTest() {
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		zerodaloginpage.clicksignup();
		Set<String> adress=driver.getWindowHandles();
		Iterator<String> Adress =adress.iterator();
		while(Adress.hasNext()) {
			String Akash = Adress.next();
			driver.switchTo().window(Akash);
			String url =driver.getCurrentUrl();
		if(url.equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account")) {
		Zerodasignuppage  zerodasignuppage = new Zerodasignuppage(driver);
		zerodasignuppage.clickonwanttoopennriaccount();
		}
	}
	}
}
