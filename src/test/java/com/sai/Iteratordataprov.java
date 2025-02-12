package com.sai;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Iteratordataprov {
  @Test(dataProvider="sai")
  public void test(String[] s) {
	  
	  System.out.println(s[0]+ ""+s[1]);
	  
	  
  }
  
  
  
  
  
  
  
 @DataProvider(name="sai") 
 public Iterator<String[]> tew() {
	 
	 Set<String[]> sw=new HashSet<>();
	 sw.add(new String[]{"sair","def"});
	 sw.add(new String[] {"der","sed"});
	 
	 
	return sw.iterator();
	 
	 
 }
  
  
}
