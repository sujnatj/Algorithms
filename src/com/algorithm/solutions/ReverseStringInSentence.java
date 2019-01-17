package com.algorithm.solutions;

public class ReverseStringInSentence {

	public String reverseWords(String s) {

		String reversedValue = "";

		String[] array = s.split(" ");

		for (int i = 0; i < array.length; i++) {
			int index = array[i].length() - 1;
			String reverseString = "";
			while (index >= 0) {

				reverseString = reverseString + array[i].charAt(index);
				index--;
			}

			if (i != array.length - 1) {
				reversedValue = reversedValue + reverseString + " ";
			} else {
				reversedValue = reversedValue + reverseString;

			}

		}
		return reversedValue;

	}

	public static void main(String[] args) {
		ReverseStringInSentence reverse = new ReverseStringInSentence();
		System.out.println(reverse.reverseWords("Let's take LeetCode contest"));

	}

}
