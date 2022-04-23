package com.java.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramUsingMap {

	public static void main(String[] args) {

		String str1="sunilsanu";
		String str2="susuannil";

		Map<Character, Integer> map1= new HashMap<>();
		Map<Character, Integer> map2= new HashMap<>();

		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();

		for(char ch : ch1) {
			if(map1.get(ch)!=null) { 
				map1.put(ch, map1.get(ch)+1);
			}else {
				map1.put(ch, 1);
			}
		}
		System.out.println("Map1: "+map1);

		for(char ch : ch2) {
			if(map2.get(ch)!=null) { 
				map2.put(ch, map2.get(ch)+1);
			}else {
				map2.put(ch, 1);
			}
		}
		System.out.println("Map2: "+map2);

		if(map1.entrySet().equals(map2.entrySet())) {
			System.out.println("Both Strings are anagram");
		}else {
			System.out.println("Not anagram!");
		}
	}

// Iterating a String from larger String	
//	String str="Sunil Sanu is my name";
//	String[] arrayString=str.split(" ");
//
//	for(String s: arrayString) {
//		System.out.println("strings: "+s);
//	}

}
