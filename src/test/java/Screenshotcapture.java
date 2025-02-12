import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotcapture {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ExtentReports ec=new ExtentReports();

		
File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		ec.attachReporter(sparkReporter);
		
		
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String base64code=capture();
		String path=captureScreenshot("Google.jpg");
		
		
		
		ec.createTest("This is test1","Attached screenshot").info("screenshot")
		.addScreenCaptureFromBase64String(base64code);
		
		ec.createTest("This is test2","Attached screenshot").info("screenshot")
		.addScreenCaptureFromBase64String(base64code,"This is a google homepage");
		
		ec.createTest("This is test3","Attached screenshot").info("screenshot")
		.addScreenCaptureFromPath(path,"This is google homepage");
		
		
		ec.createTest("This is test4","Attached screenshot").info("This is failed screenshot")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build());
		
		ec.createTest("This is test5","Attached screenshot").info("This is failed screenshot")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path,"This is google homepage").build());
		
		
ec.flush();
driver.quit();
Desktop.getDesktop().browse(new File("report.html").toURI());



	}
	
	
	
	
public static String capture() {
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		//File destFile = new File(".screenshots/"+fileName);
System.out.println("Screenshot saved successfully");
		return base64code;
	}
	
	public static String captureScreenshot(String fileName) {
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".screenshots/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return destFile.getAbsolutePath();
	}
	
	
	

}
