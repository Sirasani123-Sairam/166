package com.sai;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {
  @Test(dataProvider="tre",dataProviderClass=Datasupplier.class)
  public void f(String s) {
	  
	  
	  System.out.println(s);
  }
  
  
  
  
  
    
  }

