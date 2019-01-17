package com.algorithm.solutions;

import java.util.HashSet;

public class RepeatedElementSize {

	public static void main(String[] args) {
		RepeatedElementSize element = new RepeatedElementSize();
		int[] A = { 1, 2, 3, 3 };
		System.out.println(element.repeatedNTimes(A));

	}

	public int repeatedNTimes(int[] A) {

		HashSet<Integer> value = new HashSet<Integer>();

		for (int val : A) {
			if (value.add(val) == false) {
				return val;
			}
		}

		return 0;
	}

}
