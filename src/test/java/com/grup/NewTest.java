package com.grup;

import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test(groups= {"smoke"})
  public void test1() {
	  
	  System.out.println("test1");
	  
	  
  }
  
 @Test(groups= {"sanity","functional"})
 public void test2() {
	 
	 System.out.println("test2");
 }
 @Test
 public void test3() {
	 
	 System.out.println("test3");
 }
  
}
