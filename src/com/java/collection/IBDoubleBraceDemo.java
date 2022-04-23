package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class IBDoubleBraceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Set<String> stringSets = new HashSet<String>()
	       {
	           {
	               add("set1");
	               add("set2");
	               add("set3");
	           }
	       };
	 
	       doSomething(stringSets);
	   }
	 
	   private static void doSomething(Set<String> stringSets){
	       System.out.println(stringSets);
	   }

}
