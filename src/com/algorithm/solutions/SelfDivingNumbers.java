package com.algorithm.solutions;

import java.util.ArrayList;
import java.util.List;

public class SelfDivingNumbers {

	public static void main(String[] args) {
		SelfDivingNumbers divingNumber = new SelfDivingNumbers();
		List<Integer> selfDivingNumbers = divingNumber.selfDividingNumbers(1,
				22);

		for (Integer i : selfDivingNumbers) {
			System.out.println(i);
		}
	}

	public List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> selfDivingNumbers = new ArrayList<Integer>();

		for (int k = left; k <= right; k++) {
			boolean nope = true;			
			String newStr = k + "";
			for (int s = 0; s < newStr.length(); s++) {
				int a = Character.getNumericValue(newStr.charAt(s));
				System.out.println(a);
				if (a == 0 || k % a != 0) {
					nope = false;
					break;
				}
			}

			if (nope) {
				selfDivingNumbers.add(k);
			}

		}

		return selfDivingNumbers;

	}
	
	

}
