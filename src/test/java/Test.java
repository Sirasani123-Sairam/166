import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		Capabilities	c=((RemoteWebDriver) driver).getCapabilities();
		
		System.out.println(c.getBrowserName());
		System.out.println(System.getProperties());
		//System.getProperty("javaversion",)
	

	}

}
