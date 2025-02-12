package com.sai;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
  @Test(dataProvider="sairam")
  public void test1(String s) {
	  
	  System.out.println(s);
  }
  
  
  
  
  @DataProvider(name="sairam")
  public Object[] tesw(){
	  
	  Object[] date=new Object[]
	  
	  {
		  
		"xyz",
		"der"
		
		  
	  };
	  
	  
	  
	return date;
	  
	  
	  
	  
  }
  
  
  
}
