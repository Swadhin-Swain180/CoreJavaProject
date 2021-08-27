package com.overloading.interviewquestion;

public class OverloadingTest1 {

	public void m1(String s) {
		System.out.println("OverloadingTest1:m1 of String");
	}

	public void m1(StringBuffer sb) {
		System.out.println("OverloadingTest1:m1 of StringBuffer");

	}

	public static void main(String[] args) {
		
		OverloadingTest1 ot=new OverloadingTest1();
		//ot.m1(null); // Compile time error: The method m1(String) is ambiguous for the type OverloadingTest1

	}

}
