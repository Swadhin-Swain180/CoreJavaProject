package com.overloading.interviewquestion;

public class OverloadingTest {
	
	public void calculate(Integer i) {
		System.out.println("OverloadingTest:calculate of Integer");
	}
	
	public void calculate(String s) {
		System.out.println("OverloadingTest:calculate of String");
	}

	public static void main(String[] args) {
		
		OverloadingTest olt=new OverloadingTest();
		
		//olt.calculate(null); //compile time error: The method calculate(Integer) is ambiguous for the type OverloadingTest
		
		olt.calculate(10);

	}

}
