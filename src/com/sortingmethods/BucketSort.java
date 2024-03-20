package com.sortingmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
	public void bucketsort(int[] arr) {
		int numberofbucket = (int) Math.ceil(Math.sqrt(arr.length));
//	System.out.println(numberofbucket);
		int maxvalue = Integer.MIN_VALUE;
		for (int value : arr) {
			if (value > maxvalue) {
				maxvalue = value;
			}
		}
		ArrayList<Integer>[] buckets = new ArrayList[numberofbucket];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		for (int value : arr) {
			int bucketnumber = (int) Math.ceil(((float) value * numberofbucket) / (float) maxvalue);
//			System.out.println("bucketnumber"+bucketnumber);
			buckets[bucketnumber - 1].add(value);
		}
		for (ArrayList<Integer> bucket : buckets) {
			Collections.sort(bucket);
//			System.out.println("bucket"+bucket);
		}
		// merge buckets
		int index = 0;
		for (ArrayList<Integer> bucket : buckets) {
			for (int value : bucket) {
				arr[index] = value;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}	
}
