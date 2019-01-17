package com.algorithm.solutions;

import java.util.HashSet;

public class MorseCode {

	static String[] moreseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.",
			"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
			".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--.." };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));

	}

	public static int uniqueMorseRepresentations(String[] words) {
		HashSet<String> uniQueCode = new HashSet<String>();
		for (String val : words) {
			String newVal = "";
			for (int i = 0; i < val.length(); i++) {
				if (val.charAt(i) <= 95) {
					newVal = newVal + moreseCodes[95 - val.charAt(i)];
				} else if (val.charAt(i) >= 97) {
					newVal = newVal + moreseCodes[val.charAt(i) - 97];
				}
			}
			uniQueCode.add(newVal);
		}
		return uniQueCode.size();
	}

}
