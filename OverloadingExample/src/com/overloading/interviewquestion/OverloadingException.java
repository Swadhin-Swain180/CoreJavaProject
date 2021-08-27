package com.overloading.interviewquestion;

import java.io.IOException;

public class OverloadingException {
	
	public String m1(Exception e) {
		return "Swadhin";
	}
	
	public String m1(IOException e) {
		return "KS";
	}

	public static void main(String[] args) {
		OverloadingException oe=new OverloadingException();
		String string = oe.m1(null);
		System.out.println(string);
	}

}
