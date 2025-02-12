package com.grup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvpara {
  @Test(dataProvider="tw")
  public void f(String name,String password) throws InterruptedException {
	  
	  
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
  
  
  
  
  
@DataProvider(parallel=true)  
public String[][] tw(){
	
	String[][] data=new String[2][2];
	
	
	data[0][0]="Admin";
	data[0][1]="admin123";
	
	
	
	data[1][0]="Admin";
	data[1][1]="admin123";
	
	
	
	
	return data;
	
	
	
	
	
}
  
  
  
  
}
