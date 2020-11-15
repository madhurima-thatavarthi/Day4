package com.pojo;

/**
 * Create a class named Rectangle . The class Rectangle is a derived class of
 * Shape. Include the following private attributes / member variables.
 * 
 * Integer length
 * 
 * Integer breadth
 * 
 * Include a 3-argument constructor. The order of the arguments is name, length,
 * breadth
 * 
 * Include getters and setters.
 * 
 * Override the abstract method calculateArea() defined in the Shape class. This
 * method returns the area of the rectangle.
 * 
 * @author Kavya Madhurima
 *
 */

public class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;

	}

	public Rectangle() {
		super();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {

		return (length * breadth);
	}
}
