package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static ExtentReports createReport() {
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentreport.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
		reports.setSystemInfo("Browser", "Google Chrome");
		return reports;
		
	}

}
