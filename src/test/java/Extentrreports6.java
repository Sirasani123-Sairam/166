import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrreports6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
ExtentReports ec=new ExtentReports();
		
		//File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("Allreport.html");
		ExtentSparkReporter sparkReporter2=new ExtentSparkReporter("Allfail.html");
		ExtentSparkReporter sparkReporter3=new ExtentSparkReporter("Allskipandwarn.html");
		sparkReporter2.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		
		sparkReporter3.filter().statusFilter().as(new Status[] {
				
				Status.SKIP,
				Status.WARNING
				
		
		}).apply();
		
		ec.attachReporter(sparkReporter,sparkReporter2,sparkReporter3);
ExtentTest test1=ec.createTest("Test1");
		
		test1.pass("This is passed");
		
		
		
ExtentTest test2=ec.createTest("Test2");
		
		test2.log( Status.FAIL,"This is failed");
		
ExtentTest test3=ec.createTest("Test3");
		
		test3.log( Status.SKIP,"This is failed");
		
ExtentTest test4=ec.createTest("Test4");
		
		test4.log( Status.WARNING,"This is failed");
		
		ec.flush();
		Desktop.getDesktop().browse(new File("Allreport.html").toURI());
		Desktop.getDesktop().browse(new File("Allfail.html").toURI());
		Desktop.getDesktop().browse(new File("Allskipandwarn.html").toURI());
	}

}
