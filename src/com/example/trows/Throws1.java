package com.example.trows;

import java.util.Scanner;

class Youngerage extends RuntimeException {
	Youngerage(String msg) {
		super(msg);
	}
}

public class Throws1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the age:");
		int age=scan.nextInt();
		if(age<18)
		{
			try
			{
			throw new Youngerage(" you are not eligible for vote");
			}
			catch(Youngerage ex)
			{
				System.out.println(ex.getMessage());
			}
			
		
		}else
		{
			System.out.println("you are eligible for vote");
		}

	}

}
