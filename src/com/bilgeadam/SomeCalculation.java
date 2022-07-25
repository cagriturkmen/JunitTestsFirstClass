package com.bilgeadam;

import java.util.StringTokenizer;

public class SomeCalculation {
	
public static int findMax(int arr[]) {
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

public static int cube(int n) {
	return n*n*n;
}
	
// My name is Cagri
// Ym eman si irgac
public static String reverseWord(String str) {
	
	StringTokenizer tokenizer = new StringTokenizer(str," ");
	StringBuilder result = new StringBuilder();
	
	while(tokenizer.hasMoreTokens()) {
		StringBuilder sB = new StringBuilder();
		sB.append(tokenizer.nextToken());
		sB.reverse();
		
		result.append(sB.toString());
		result.append(" ");
	}
	return result.toString().trim();
}

}
