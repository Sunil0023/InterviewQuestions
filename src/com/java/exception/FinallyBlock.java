package com.java.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			System.out.println("Sunil");
			System.out.println(10/0);
			System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}
}
