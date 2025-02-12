package com.grup;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups= {"sanity"})
	  public void test4() {
		  
		  System.out.println("test4");
		  
		  
	  }
	  
	 @Test(groups={"Regression","functional"})
	 public void test5() {
		 
		 System.out.println("test5");
	 }
	 @Test
	 public void test6() {
		 
		 System.out.println("test6");
	 }
	  
	}


