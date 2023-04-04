package com.greatlearning.currencycounter;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyCoutner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		int currency_values[];
		int currencyCounter[];
		int amount;
		int sum = 0;

		// Accepting Currency denominations from user

		System.out.println("Enter the Size of Currency Denominations");
		size = sc.nextInt();

		currency_values = new int[size];
		currencyCounter = new int[size];
		;
		System.out.println("Enter the currencey denomination values");
		for (int i = 0; i < size; i++)
			currency_values[i] = sc.nextInt();

		// sorting currency denominations in descending order
		CurrencySort cs = new CurrencySort();
		cs.sort(currency_values, 0, size - 1);

		System.out.println("currency denominations in order : " + Arrays.toString(currency_values));

		// accepting the amount to be paid from user
		System.out.println("Enter the amount to be paid");
		amount = sc.nextInt();
		int actual_amount = amount;

		// counting minimum number of currency notes can be given for amount to be paid
		for (int i = 0; i < size; i++) {
			if (amount >= currency_values[i]) {
				currencyCounter[i] = amount / currency_values[i];
				amount = amount % currency_values[i];
			}
		}

		// Displaying the no.of currency notes according to the currency denominations

		System.out.println("Your payment approch in order to give minimum no.of notes is ");
		for (int i = 0; i < size; i++) {
			if (currencyCounter[i] != 0) {
				sum = sum + (currency_values[i] * currencyCounter[i]);
				System.out.println(currency_values[i] + " ---> " + currencyCounter[i]);
			}
		}
		if (sum != actual_amount) {
			System.out.println("Note: " + (actual_amount - sum) + "rs amount is still to be given");

		}

		sc.close();
	}

}
