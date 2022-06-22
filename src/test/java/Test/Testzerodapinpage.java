package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Zerodaloginpage;
import POM.Zerodapinpage;
import Utility.Parameter;

public class Testzerodapinpage {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver = Browser.Openbrowser();
	}
	@Test
	public void zerodapinpageTest() throws EncryptedDocumentException, IOException {
		Zerodaloginpage zerodaloginpage= new Zerodaloginpage(driver);
		String username = Parameter.parameterization(0, 1);
		String password =Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage = new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
	}

}
