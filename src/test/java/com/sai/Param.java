package com.sai;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Param {
	
	WebDriver driver;
  @Test
  public void testurl() {
	  
	  driver.get("https://www.facebook.com/");

	  
	  
	  
	  
	  System.out.println("test method"); 
  }
  
  @Parameters("browsername")
  @BeforeMethod
  public void launchbrowser(@Optional("edge")String browsername) {
	  
	  switch(browsername) {
	  case "chrome":
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  break;
		  
		  
	  case "edge" :
		  
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  break;
		  
	  case  "firefox" :
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  break;
		  
		  default:
			  System.out.println("");
	  break;
		  
	  
	  
	  }
	  
	 // WebDriverManager.chromedriver().setup();
	 // driver.get("www.fb.com");
	  
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.get("https://www.facebook.com/");
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("before class");
  }
  
  @Parameters("url")
  @Test
 
  public void login(String url) {
	  
	  
	  //WebDriverManager.chromedriver().setup();
	 // driver
	  
	  
	  driver.get(url);
	  		
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
