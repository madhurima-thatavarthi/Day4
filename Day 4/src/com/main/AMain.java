package com.main;

import com.pojo.A;

public class AMain { 
	public static void main(String[] args) { 
		A objA = new A(); 
		System.out.println("in main(): "); 
		objA.a = 222; 
		System.out.println("objA.a = "+objA.a); 
			
		objA=null;
	}
}