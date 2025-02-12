package com.sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	//public static void main(String args[]) {

	WebDriver driver;
	@Test
	public void testgoogle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
	      driver.close();
	      
	      
	
	}
	
	
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	    
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("login successful");
		driver.close();
	}
	

public static void main(String args[]) {
	
}
}
