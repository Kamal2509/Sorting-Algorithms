package com.sortingmethods;

import java.util.Arrays;

public class InsertionSort {
 public void insertionsort(int[] arr) {
	 for(int i=0; i<arr.length;i++) {
		int temp=arr[i]; int j=i;
		
		while(j>0 && arr[j-1]>temp){
			arr[j]=arr[j-1];
			j--;			
		}
		arr[j]=temp;   
		System.out.println(Arrays.toString(arr));
	 }
	 
 }
}
