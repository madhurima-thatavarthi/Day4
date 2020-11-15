package com.main;

/**
 * Create another class called Main. 
 * In the method, create instances of the above classes and test the above classes for circle,square,
 * rectangle
 * 
 * @author Kavya Madhurima
 * 
 */
import java.util.Scanner;

import com.pojo.Circle;
import com.pojo.Rectangle;

import com.pojo.Square;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();

		System.out.print("Enter shape name=");
		String str = sc.nextLine();
		if (str.equals("circle")) {
			System.out.print("Enter the radius=");
			int radius = sc.nextInt();
			circle.setRadius(radius);
			System.out.print("The area of circle is=" + circle.calculateArea());

		}
		if (str.equals("square")) {
			System.out.print("Enter the side=");
			int side = sc.nextInt();
			square.setSide(side);
			System.out.print("The area of Square is=" + square.calculateArea());

		}
		if (str.equals("rectangle")) {
			System.out.print("Enter the length=");
			int length = sc.nextInt();
			rectangle.setLength(length);
			System.out.print("Enter the breadth=");
			int breadth = sc.nextInt();
			rectangle.setBreadth(breadth);
			System.out.print("The area of Rectangle is=" + rectangle.calculateArea());

		}

		circle = null;
		square = null;
		rectangle = null;
		sc.close();
	}

}
