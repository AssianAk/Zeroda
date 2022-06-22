package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class Testlistener extends basetest implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"test has started");
	}
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.Takesnapshot(driver,result.getName());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSucess(ITestResult result) {
		System.out.println(result.getName()+"test is passed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"test is skipped");
	}
}
