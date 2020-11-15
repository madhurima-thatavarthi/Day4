package com.pojo;

/**
 * Create an abstract class named Shape with the following protected attributes
 * / member variables.
 * 
 * String name
 * 
 * Include a 1-argument constructor.
 * 
 * Include getters and setters.
 * 
 * Include an abstract method named calculateArea() . This method returns a
 * Float value.
 * 
 * @author Kavya Madhurima
 *
 */
public abstract class Shape {
	public abstract float calculateArea();;

	protected static String name;

	public Shape(String name) {
		super();
		Shape.name = name;
	}

	public Shape() {

	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Shape.name = name;
	}

}
