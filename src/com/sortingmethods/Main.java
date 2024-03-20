package com.sortingmethods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter size of array");
		Scanner scanner= new Scanner(System.in);
		int size= scanner.nextInt();
		int[] input =new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size; i++) {
			input[i]=scanner.nextInt();
		}
		scanner.close();
		BucketSort b = new BucketSort();
		b.bucketsort(input);
	}
}
