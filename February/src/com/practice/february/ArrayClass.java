package com.practice.february;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10]; 
		Arrays.fill(arr, 3);
		System.out.println(arr.toString());

		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
