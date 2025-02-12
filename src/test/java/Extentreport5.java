import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreport5  {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
ExtentReports ec=new ExtentReports();
		
		File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		sparkReporter.viewConfigurer().viewOrder().as(new ViewName[] {
				
				ViewName.DASHBOARD,
				ViewName.TEST,
				ViewName.EXCEPTION,
				ViewName.CATEGORY,
				ViewName.DEVICE
				
				
				
				
				
		}).apply();
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		Capabilities	c=((RemoteWebDriver) driver).getCapabilities();
		
		System.out.println(c.getBrowserName());
		
		
		ec.setSystemInfo("os",System.getProperty("os.name"));
		ec.setSystemInfo("java version",System.getProperty("java.version"));
		//ec.setSystemInfo("Browser",System.getProperty("Browser.name"));
		ec.setSystemInfo("os",c.getBrowserName() + c.getBrowserVersion());
		
		
		
		ec.attachReporter(sparkReporter);
		
		
		
		ec.createTest("Test1").assignAuthor("sai").
		assignCategory("smoke").assignDevice("chrome99");
		
		
		Throwable t=new RuntimeException("This is custom experience");
		ec.createTest("Exception test2")
		.info(t);
		
		
		ec.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());


	}

}
