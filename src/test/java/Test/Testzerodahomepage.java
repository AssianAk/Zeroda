package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.Zerodahomepage;
import POM.Zerodaloginpage;
import POM.Zerodapinpage;
import Utility.Parameter;
import Utility.Report;
@Listeners(Testlistener.class)
public class Testzerodahomepage extends basetest {
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void extentReports() {
		reports=Report.createReport();
	}
	@BeforeMethod
	public void browser() {
		driver = Browser.Openbrowser();
	}
	@Test
	public void addsharetowathchlistTest() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("addsharetowatchlist");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Tatamotors", driver);
		zerodahomepage.clickonadd(driver);	
	}
	@Test
	public void openmarketdepthTest() throws EncryptedDocumentException, IOException {
		test= reports.createTest("openmarketdepth");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Wipro", driver);
		zerodahomepage.clickondepth(driver);
		String actualtext=zerodahomepage.assertformarketdepth(driver);
		String Expectedtext="Create GTT";
		Assert.assertEquals(actualtext,Expectedtext);
	}
	@Test
	public void openchartTest() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("openchartTest");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Wipro", driver);
		zerodahomepage.clickonchart(driver);
		boolean actual=zerodahomepage.assertforopenchart(driver);
		Assert.assertEquals(actual, true);
		
	}
	@Test
	public void buysharebyusingsearchTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("buyshareusingsearchtext");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Acc", driver);
		zerodahomepage.clickonbuy(driver);
		zerodahomepage.clickonmis();
		zerodahomepage.clickonmarket();
		zerodahomepage.clickonsubmit();
		boolean d=zerodahomepage.asserforbuysharesearchtext(driver);
		Assert.assertEquals(d, true);
	}
	@Test
	public void sellshareusingsearchTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("sellshareusingsearchtext")
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Acc", driver);
		zerodahomepage.clickonsell(driver);
		zerodahomepage.clickonmis();
		zerodahomepage.clickonstoploss();
		zerodahomepage.clickonsubmit();
		boolean d=zerodahomepage.asserforbuysharesearchtext(driver);
		Assert.assertEquals(d, true);
	}
	@Test
	public void buyshrefromwatchlistTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("buysharefromwatchlist")
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.clickonbuywipro(driver);
		zerodahomepage.clickonmis();
		zerodahomepage.clickonstoploss();
		zerodahomepage.clickonsubmit();	
		boolean d=zerodahomepage.asserforbuysharesearchtext(driver);
		Assert.assertEquals(d, true);
	}
	@Test
	public void sellsharefromwatchlist() throws EncryptedDocumentException, IOException {
		test=reports.createTest("sellsharefromwatchlist");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.clickonsellwipro(driver);
		zerodahomepage.clickonmis();
		zerodahomepage.clickonstoploss();
		zerodahomepage.clickonsubmit();	
		boolean d=zerodahomepage.asserforbuysharesearchtext(driver);
		Assert.assertEquals(d,true);
		
	}
	@Test
	public void buyspecificsharefromwatchlist() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("buyspecificsharefromwatchlist");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		Thread.sleep(10000);
		zerodahomepage.specificshare(driver);
		boolean d=zerodahomepage.asserforbuysharesearchtext(driver);
		Assert.assertEquals(d, true);
	}
	@Test
	public void deletespecifsharefromwatchlist() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("deletespecificsharefromwatchlist");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		Thread.sleep(10000);
		zerodahomepage.deletestock(driver);
	}
	@Test
	public void specificsharefromwatchlist() throws EncryptedDocumentException, IOException {
		test=reports.createTest("sellspecificsharefromwatchlist");
		Zerodaloginpage zerodaloginpage = new Zerodaloginpage(driver);
		String username =Parameter.parameterization(0, 1);
		String password = Parameter.parameterization(1, 1);
		String pin = Parameter.parameterization(2, 1);
		zerodaloginpage.Enterusername(username);
		zerodaloginpage.Enterpass(password);
		zerodaloginpage.clicklogin();
		Zerodapinpage zerodapinpage =new Zerodapinpage(driver);
		zerodapinpage.Enterpin(pin, driver);
		zerodapinpage.clickonsubmit();
		Zerodahomepage zerodahomepage = new Zerodahomepage(driver);
		zerodahomepage.entersearchtext("Tatamotors", driver);
		zerodahomepage.buysharespecificfromsearchtext(driver);
	}
	@AfterMethod
	public void logic(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else 
			if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
			}
		    else {
			test.log(Status.SKIP, result.getName());
		    }
	}
	@AfterTest
	public void flushresult() {
		reports.flush();
	}
	
}
