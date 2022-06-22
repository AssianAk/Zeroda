package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser;
import POM.Zerodaloginpage;
import Utility.Parameter;

public class TestZerodaloginpage {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser.Openbrowser();
	}
	@Test(dataProvider="logindat")
	public Object[][] data() {
		return new Object[] [] {{"velociy","Katraj"}};
	}
	@Test
	public void loginwithcredentialTest() throws EncryptedDocumentException, IOException {
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username = Parameter.parameterization(0, 1);
		String password =Parameter.parameterization(1, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
	}
	@Test
	public void forgotpasswordlinkTest() {
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		zerodaloginpage.clickforgotpassword();
	}
	@Test
	public void signuplinkTest() {
		Zerodaloginpage zerodaloginpage=new Zerodaloginpage(driver);
		zerodaloginpage.clicksignup();
	}
	@Test
	public void loginwithoutcredential() {
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		zerodaloginpage.clicklogin();
		String Error=zerodaloginpage.geterror();
		String Expectedtext ="User ID should be minimum 6 characters";
		//Assert.assertEquals(Error, Expectedtext);
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(Error, Expectedtext);
	}

}
	


