package com.grup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	@Test(dataProvider="sai",dataProviderClass=ExcelProv.class)
	public void login(String name,String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	    
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("login successful");
		driver.close();
	}
}
