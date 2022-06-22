package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void Takesnapshot(WebDriver driver,String name ) throws IOException {
		String D =Screenshot.date();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ghang\\OneDrive\\Pictures\\Screenshots"+name+D+".jpg");
		FileHandler.copy(source, destination);
	}
	public static String date() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MMM-DD HH-MM-SS");
		LocalDateTime currentTime =LocalDateTime.now() ;
		String D =dtf.format(currentTime);
		return D;
	}
	}
