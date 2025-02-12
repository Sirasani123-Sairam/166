package com.sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asse {

	
	WebDriver driver;
	@Test
	public void check() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		SoftAssert softassert=new SoftAssert();
		
		
		String actual= driver.getCurrentUrl();
		
		String expected="https://www.facebook1.com/";
		softassert.assertEquals(actual, expected);
		
		//driver.close();
		Thread.sleep(2000);
		//driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzM3NDMzMDY0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next");
		
		//border
		
		String actualborder=driver.findElement(By.xpath("//input[@id='email']")).getCssValue("border");
		
		String expectedborder="0.8px solid rgb(8, 102, 255)";
		
		softassert.assertEquals(actualborder,expectedborder);
		
		driver.quit();
		
		softassert.assertAll();
		
		
		
		
	}
	
	
}
