package com.algorithm.solutions;

//You're given strings J representing the types of stones that are jewels, and
//S representing the stones you have.  Each character in S is a type of stone you have.  
//You want to know how many of the stones you have are also jewels.
//The letters in J are guaranteed distinct, and all characters in J and S are letters.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class JewelsAndStones771 {

	public static void main(String[] args) {
		JewelsAndStones771 js = new JewelsAndStones771();
		System.out.println("Number of jewels found in stone :"
				+ js.getJewells("aA", "aAAbbbb"));
		;

	}

	// My solution
	private int getJewells(String jewels, String stone) {
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stone.length(); j++) {
				if (jewels.charAt(i) == stone.charAt(j)) {
					count = count + 1;
				}

			}
		}

		return count;
		// Optimized code
		// return stone.replaceAll("[^" + jewels + "]", "").length();
	}
}
