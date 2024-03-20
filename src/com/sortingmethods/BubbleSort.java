package com.sortingmethods;

import java.util.Arrays;

public class BubbleSort {
public void bubblesort(int[] arr) {
	for(int i=0; i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j+1]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
