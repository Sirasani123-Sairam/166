package com.grup;

import org.testng.annotations.Test;

public class Depends {
	
	static String tracknumber=null;
	
	
	
  @Test(priority=1 ,enabled=false)
  public void createtrack() {
	  
	//  System.out.println(5/0);
	  
	  System.out.println("createtrack");
	  
	  tracknumber="abcd43";
	  
	  
  }
  
  @Test(dependsOnMethods= {"createtrack"})
  public void tracking() throws Exception {
	  
	  if(tracknumber!=null) {
		  
		  System.out.println("tracknumber");
	  }
		  else {
			  throw new Exception("Invalid tracknumber");
		  }
	  }
  
  
  @Test(dependsOnMethods= {"createtrack"})
  public void cancel() throws Exception {
	  
	  
if(tracknumber!=null) {
		  
		  System.out.println("tracknumber");
	  }
		  else {
			  throw new Exception("Invalid tracknumber");
		  }

	  
	  
  }
  
  
  
  }
  
  

