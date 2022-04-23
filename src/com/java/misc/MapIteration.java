package com.java.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {

		String str1="sunilsanu";
		
		Map<Character, Integer> map= new HashMap<>();
		
		char[] ch1=str1.toCharArray();
		
		for(char ch : ch1) {
			if(map.get(ch)!=null) { 
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println("Map1: "+map);

		//Traditional way
		System.out.println("Iterate Map Using traditional way: ");
		for(Map.Entry m: map.entrySet()) {
			System.out.println("Key: "+m.getKey()+ " Value: "+m.getValue());
		}
		
		//Traditional way using iterator()
		System.out.println("Iterate Map Using iterator() way: ");
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry=(Entry) itr.next();
			System.out.println("Key: "+entry.getKey()+ " , Value: "+entry.getValue());
		}

		//lambda forEach
		System.out.println("Iterate Map Using lambda forEach: ");
		map.forEach((k,v)->System.out.println("Key: "+k+" ; Value: "+v));

		//Stream lambda exp.
		System.out.println("Iterate Map Using Stream lambda exp.: ");
		map.entrySet().forEach(entry -> System.out.println("Key: "+entry.getKey()+ " ; Value: "+entry.getValue()));

		//Stream method reference
		System.out.println("Iterate Map Using Stream Method reference: ");
		map.entrySet().stream().forEach(System.out::print);

	}

}
