package com.algorithm.solutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FizzBuzz buzz = new FizzBuzz();
		List<String> returnediTem = buzz.fizzBuzz(15);
		for (String val : returnediTem) {
			System.out.println(val + ",");
		}

	}

	public List<String> fizzBuzz(int n) {

		List<String> addedItems = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				addedItems.add(i - 1, "FizzBuzz");
			} else if (i % 3 == 0) {
				addedItems.add(i - 1, "Fizz");
			} else if (i % 5 == 0) {
				addedItems.add(i - 1, "Buzz");
			} else {
				addedItems.add(i - 1, i + "");
			}

		}

		return addedItems;

	}

}
