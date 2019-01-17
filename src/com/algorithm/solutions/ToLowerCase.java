package com.algorithm.solutions;

public class ToLowerCase {

	public static void main(String[] args) {
		System.out.println(toLowerCase("AZSujnaz343434"));

	}

	// A - Z 65 to 90, a - z , 97 - 122

	public static String toLowerCase(String capLetter) {

		for (int i = 0; i < capLetter.length(); i++) {
			if (capLetter.charAt(i) >= 65 && capLetter.charAt(i) <= 90) {
				int ch = capLetter.charAt(i) - 65 + 97;
				capLetter = capLetter.replace(capLetter.charAt(i), (char) ch);
				System.out.println((char) ch);

			}
		}

		return capLetter;

	}

}
