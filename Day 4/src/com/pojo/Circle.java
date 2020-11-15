package com.pojo;

/**
 * Create a class named Circle . The class Circle is a derived class of Shape.
 * Include the following private attributes / member variables.
 * 
 * Integer radius
 * 
 * Include a 2-argument constructor. The order of the arguments is name, radius.
 * 
 * Include getters and setters.
 * 
 * Override the abstract method calculateArea() defined in the Shape class. This
 * method returns the area of the circle
 * 
 * @author Kavya Madhurima
 *
 */

public class Circle extends Shape {

	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;

	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {

		return (float) (3.14 * radius * radius);
	}

}
