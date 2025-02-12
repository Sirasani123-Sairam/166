import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	
	public static void main(String args[]) throws IOException {
		ExtentReports ec=new ExtentReports();
		
		File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		ec.attachReporter(sparkReporter);
		
		ExtentTest test1=ec.createTest("Test1");
		
		test1.pass("This is passed");
		
		
		
ExtentTest test2=ec.createTest("Test2");
		
		test1.log( Status.FAIL,"This is failed");
	
		
		ec.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
	}
	
	
}
