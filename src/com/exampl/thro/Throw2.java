package com.exampl.thro;

import java.util.Scanner;

class Youngeragee extends RuntimeException {
	Youngeragee(String msg) {
		super(msg);
	}
}
public class Throw2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		int age = scan.nextInt();
		
		if (age < 18) {
			try {
			throw new Youngeragee("your not eligible for vote");
			}
			catch(Youngeragee y)
			{
				System.out.println(y.getMessage());
			}
		} else {
			System.out.println("your eligible for the vote:");
		}
		
	}
	}


