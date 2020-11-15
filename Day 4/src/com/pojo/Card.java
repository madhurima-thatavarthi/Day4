package com.pojo;

/**
 * Create an abstract class named Card with the following protected attributes /
 * member variables.
 * 
 * String holderName;
 * 
 * String cardNumber;
 * 
 * String expiryDate;
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 3-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate.
 * 
 * @author Kavya Madhurima
 *
 */
public class Card {
	private String holderName;
	private String cardNumber;
	private String expiryDate;

	public Card(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	public Card() {
		super();
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
