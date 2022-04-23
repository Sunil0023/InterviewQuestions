package com.java.misc;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 12321;
		int num =number;
		int revNo = 0;
		
		while(number>0) {
			revNo=revNo*10+number%10;
			number=number/10;
		}
		if(num==revNo) {
			System.out.println("Number palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
