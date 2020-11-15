package com.pojo;

/**
 * 
 * Create a class named MembershipCard. The class MembershipCard is a derived
 * class of Card. Include the following private attributes / member variables.
 * 
 * Integer rating
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 4-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate, rating.
 * 
 * @author Kavya Madhurima
 *
 */
public class MemberShipCard extends Card {
	private int rating;

	public MemberShipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public MemberShipCard() {
		super();
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
