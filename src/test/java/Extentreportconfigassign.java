import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportconfigassign {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
ExtentReports ec=new ExtentReports();
		
		File file=new File("report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		ec.attachReporter(sparkReporter);
		
		//sparkReporter.config().setTheme(Theme.DARK);
		
		//sparkReporter.config().setReportName("sairam");
		
		//sparkReporter.config().setDocumentTitle("screenshot dirty");
		
		//sparkReporter.config().setCss(".badge-primary {background-color: #fd3259}");
		
		//sparkReporter.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		
		sparkReporter.loadJSONConfig(new File("C:\\Users\\siras\\eclipse-workspace\\Practicefortesng\\src\\test\\resources\\extenreports.json"));
		
		
		
		ec.createTest("Test1").assignAuthor("sai").
		assignCategory("smoke").assignDevice("chrome99");
		
		
		
		
		
		ec.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
