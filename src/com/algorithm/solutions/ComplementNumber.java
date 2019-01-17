package com.algorithm.solutions;

public class ComplementNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complementNumber(5);

	}

	public static int complementNumber(int number) {
		String binString = Integer.toString(number, 2);
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < binString.length(); i++) {
			if (binString.charAt(i) == '1') {
				build.append('0');
			} else {
				build.append('1');
			}
		}
		return Integer.parseInt(build.toString(), 2);
	}
}
