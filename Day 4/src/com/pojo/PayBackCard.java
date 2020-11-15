package com.pojo;

/**
 * Create a class named PaybackCard. The class PaybackCard is a derived class of
 * Card. Include the following private attributes / member variables.
 * 
 * Integer pointsEarned;
 * 
 * Double totalAmount;
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 5-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate, pointsEarned,
 * totalAmount.
 * 
 * @author Kavya Madhurima
 *
 */
public class PayBackCard extends Card {
	private int pointsEarned;

	private double totalAmount;

	public PayBackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public PayBackCard() {
		super();
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
