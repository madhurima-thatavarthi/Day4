package com.pojo;

/**
 * Create a class named Square . The class Square is a derived class of Shape.
 * Include the following private attributes / member variables.
 * 
 * Integer side
 * 
 * Include a 2-argument constructor. The order of the arguments is name, side.
 * 
 * Include getters and setters.
 * 
 * Override the abstract method calculateArea() defined in the Shape class. This
 * method returns the area of the square.
 * 
 * @author Kavya Madhurima
 *
 */

public class Square extends Shape {
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;

	}

	public Square() {
		super();
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {

		return (side * side);
	}

}
