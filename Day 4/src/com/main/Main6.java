package com.main;

import com.pojo.A1;
import com.pojo.B1;
import com.pojo.C1;

public class Main6 {
	static int a = 555;

	public static void main(String[] args) {
		A1 objA = new A1();
		B1 objB1 = new B1();
		A1 objB2 = new B1();
		C1 objC1 = new C1();
		B1 objC2 = new C1();
		A1 objC3 = new C1();
		objA.display();
		objB1.display();
		objB2.display();
		objC1.display();
		objC2.display();
		objC3.display();
	}
}
