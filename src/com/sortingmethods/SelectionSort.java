package com.sortingmethods;

import java.util.Arrays;

public class SelectionSort {
	public void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int indexmin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indexmin]) {
					indexmin = j;
				}
			}
			if (indexmin != i) {
				int temp = arr[i];
				arr[i] = arr[indexmin];
				arr[indexmin] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
