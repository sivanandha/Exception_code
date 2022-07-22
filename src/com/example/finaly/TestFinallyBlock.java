package com.example.finaly;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
		}
		// catch won't be executed
		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("hello");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of phe code...");

	}

}
