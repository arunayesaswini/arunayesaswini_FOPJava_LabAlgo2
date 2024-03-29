package com.greatlearning.currencycounter;

public class CurrencySort {
	public void sort(int[] currency_values, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(currency_values, 0, mid);
			sort(currency_values, mid + 1, right);
			merge(currency_values, left, mid, right);

		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int brr[] = new int[right + 1];
		while (i <= mid && j <= right) {
			if (arr[i] >= arr[j]) {
				brr[k++] = arr[i++];
			} else {
				brr[k++] = arr[j++];
			}

		}
		if (i > mid) {
			while (j <= right) {
				brr[k++] = arr[j++];
			}
		} else {
			while (i <= mid) {
				brr[k++] = arr[i++];
			}
		}
		for (int z = left; z <= right; z++)
			arr[z] = brr[z];

	}

}
