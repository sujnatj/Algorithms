package com.algorithm.solutions;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 3, 1, 2, 4 };

		sortArrayByParity(A);

	}

	public static int[] sortArrayByParity(int[] A) {

		for (int i = 0; i < A.length; i++) {
			for (int k = i + 1; k < A.length; k++) {
				if (A[i] % 2 != 0) {
					int temp = A[i];
					A[i] = A[k];
					A[k] = temp;
				}
			}

		}

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
		return A;

	}

}
