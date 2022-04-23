package com.java.misc;

import java.util.Scanner;

public class PalindromeStringType1 {

	public static void main(String[] args) {

		System.out.println("Please enter the String to check palindrome: ");
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();

		if(isPalindrome(str.toLowerCase())) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not palindrome String");
		}
		

}

	private static boolean isPalindrome(String str) {
		int length=str.length()-1;
		int i=0;
		
		while(i<length) {
			if(str.charAt(i)!=str.charAt(length)) {
				return false;
			}
			i++;length--;
		}
		return true;
	}
}