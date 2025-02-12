import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsinfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

ExtentReports ec=new ExtentReports();
		
		File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		ec.attachReporter(sparkReporter);
		
		ec.createTest("Test1").log(Status.INFO,"<b>info</b>");
		ec.createTest("Test2").log(Status.INFO,"<b><i>sai</i></b>");
		
		List<Integer> list= new ArrayList<>();
		
		list.add(23);
		list.add(24);
		
		ec.createTest("list based test").info(MarkupHelper.createOrderedList(list));
		ec.createTest("list based test").info(MarkupHelper.createUnorderedList(list));
		
		ec.createTest("Highlight log test")
		.info(MarkupHelper.createLabel("This is a highlighted message",ExtentColor.RED));
		
		
		
		try {
			int i=5/0;
			
		}catch(Exception e) {
			
			ec.createTest("Exception Test1")
			.info(e);
			
		}
		
		Throwable t=new RuntimeException("This is custom experience");
		ec.createTest("Exception test2")
		.info(t);
		
		
		
		ec.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
	
		
		
	}

}
