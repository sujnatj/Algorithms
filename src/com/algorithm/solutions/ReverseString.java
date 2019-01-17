package com.algorithm.solutions;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverse = new ReverseString();
		System.out
				.println(reverse.reverseString("Let's take LeetCode contest"));

	}

	public String reverseString(String s) {

		StringBuilder reversedString = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			reversedString.append(s.charAt(i));
		}

		return reversedString.toString();

	}

}
