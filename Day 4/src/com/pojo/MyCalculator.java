package com.pojo;

/**
 * 
 * divisorSum function just takes an integer as input and return the sum of all
 * its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum
 * should return 12. The value of n will be at most 1000.
 * 
 * @author Kavya Madhurima
 *
 */
public class MyCalculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;

			}
		}
		return sum;
	}
}