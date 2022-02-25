package com.fileread;

import java.util.Scanner;

public class Rough {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int array[]=new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
				}		
			}
		}
	}
}
