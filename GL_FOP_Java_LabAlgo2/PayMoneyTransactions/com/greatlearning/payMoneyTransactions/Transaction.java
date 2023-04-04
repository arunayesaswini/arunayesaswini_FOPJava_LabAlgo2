package com.greatlearning.payMoneyTransactions;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Transaction Array");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		int flag = 0;
		int target;

		// Storing all transactions in an array

		System.out.println("Enter values in array");

		for (int i = 0; i < size; i++) {
			System.out.print("Transaction " + (i + 1) + ": ");
			transactions[i] = sc.nextInt();
		}
		System.out.println();
		// inputing the required daily targets
		System.out.println("Enter total number of targets that to be achieved ");
		int targets = sc.nextInt();

		// checking targets can be achieved at which transaction
		while (targets > 0) {
			System.out.println("Enter value of target");
			target = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < transactions.length; j++) {
				flag = 0;
				sum += transactions[j];
				if (sum >= target) {
					flag = 1;
					System.out.println("Traget achieved after " + (j + 1) + " Transactions");
					break;
				}
			}
			if (flag == 0)
				System.out.println("Target cannot be achieved");
			targets--;

		}

		sc.close();
	}
}
