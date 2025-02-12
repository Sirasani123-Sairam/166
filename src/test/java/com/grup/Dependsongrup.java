package com.grup;

import org.testng.annotations.Test;

public class Dependsongrup {
  @Test(groups= {"smoke"})
  public void test1() {
	  System.out.println("smoke");
	  
	  
  }
  @Test(groups= {"sanity"})
  public void test2() {
	  
	  System.out.println(5/0);
  }
  
  
 @Test(groups= {"functional"})
 public void test3() {
	 
	 System.out.println("test3");
 }
 
 
 @Test(dependsOnGroups= {"smoke"},alwaysRun=true )
 public void test0() {
	 
	 System.out.println("main method");
 }
  
  
}
