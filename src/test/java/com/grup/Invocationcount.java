package com.grup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocationcount {
  @Test(invocationCount=3,threadPoolSize=2)
  public void test2() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();	
		
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
    
	
	driver.get("https://randomuser.me/");
	Thread.sleep(2000);
	
	WebElement email=driver.findElement(By.xpath("//[@data-label='email']"));
	
	System.out.println(email);
	
	driver.quit();
	
	System.out.println("brahmankji");
	
	
	
	  
	  
  }
}
