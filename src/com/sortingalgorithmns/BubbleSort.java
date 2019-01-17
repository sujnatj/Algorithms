package com.sortingalgorithmns;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 2, -1, -10, 3, 1, 90, -8, 34, -23, 0, -2, 83 };
		bubbleSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		return array;

	}

}
