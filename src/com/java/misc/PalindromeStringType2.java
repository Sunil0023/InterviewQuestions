package com.java.misc;

import java.util.Scanner;

public class PalindromeStringType2 {

	public static void main(String[] args) {

		System.out.println("Please Enter the String to check palindrome: ");
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String reverseString = "";
		int lenght =str.length();

		for(int i=lenght-1; i>=0; i--) {
			reverseString = reverseString + str.charAt(i);
		}

		if(str.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
