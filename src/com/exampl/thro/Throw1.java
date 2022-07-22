package com.exampl.thro;

import java.util.Scanner;

class Youngerage extends RuntimeException {
	Youngerage(String msg) {
		super(msg);
	}
}
public class Throw1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		int age = scan.nextInt();
		
		if (age < 18) {
			
			throw new Youngerage("your not eligible for vote");
			
		} else {
			System.out.println("your eligible for the vote:");
		}
		
	}
	}


