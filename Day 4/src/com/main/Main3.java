package com.main;

/**
 * Create another class called Main. 
 * In the method, create instances of the payback ,membership cards. 
 * The card details are entered separated by a ‘|’.
 * 
 * @author Kavya Madhurima
 */

import java.util.Scanner;

import com.pojo.MemberShipCard;
import com.pojo.PayBackCard;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MemberShipCard memberShipCard = new MemberShipCard();
		PayBackCard payBackCard = new PayBackCard();
		System.out.println("Select the card=");
		System.out.println("1.Payback card");
		System.out.println("2.Membership card");
		System.out.println();
		int n = sc.nextInt();

		if (n == 1) {
			System.out.print("Enter the card details=");
			String str1 = sc.nextLine();
			payBackCard.setHolderName(str1);
			System.out.print("|");
			String str2 = sc.nextLine();
			payBackCard.setCardNumber(str2);
			System.out.print("|");
			String str3 = sc.nextLine();
			payBackCard.setExpiryDate(str3);
			System.out.print("Enter points in card=");
			int num1 = sc.nextInt();
			payBackCard.setPointsEarned(num1);
			System.out.print("Total amount=");
			int num2 = sc.nextInt();
			payBackCard.setTotalAmount(num2);
			System.out.println();

			System.out.print("Card number=" + payBackCard.getCardNumber() + "\n");
			System.out.println("points earned=" + payBackCard.getPointsEarned());
			System.out.println("Total Amount=" + payBackCard.getTotalAmount());
		}

		if (n == 2) {
			System.out.print("Enter the card details=");
			String str1 = sc.nextLine();
			memberShipCard.setHolderName(str1);
			System.out.print("|");
			String str2 = sc.nextLine();
			memberShipCard.setCardNumber(str2);
			System.out.print("|");
			String str3 = sc.nextLine();
			memberShipCard.setExpiryDate(str3);
			System.out.print("Enter rating=");
			int num1 = sc.nextInt();
			memberShipCard.setRating(num1);
			System.out.println();

			System.out.print("Card number=" + memberShipCard.getCardNumber() + "\n");
			System.out.println("Rating=" + memberShipCard.getRating());

		}

		memberShipCard = null;
		payBackCard = null;

		sc.close();
	}
}
