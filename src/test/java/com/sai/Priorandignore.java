package com.sai;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priorandignore {
  @Test(priority=1)
  public void Ramya() {
	  
	  System.out.println("Ramya");
  }
   
@Ignore

@Test
public void chandu() {
	
	System.out.println("chandu");
	
}


@Test(priority=2)
public void search() {
	
	System.out.println("search");
}


}

