package com.sortingalgorithmns;

public class QuickSort {

	public static void main(String[] args) {
//		int[] array = { 2, -1, -10, 3, 1, 90, -8, 34, -23, 0, -2, 83 };
		QuickSort quick = new QuickSort();
		int[] array = { 3, 1, -100, 100, 23, 3, 2 };

		quick.quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	void quickSort(int[] array, int low, int high) {

		if (array == null || array.length == 0)
			return;

		if (low >= high) {
			return;
		}

		int pivot = array[(low + high) / 2];
		int lIndex = low, hIndex = high;

		while (lIndex <= hIndex) {

			while (array[lIndex] < pivot) {
				lIndex++;
			}

			while (array[hIndex] > pivot) {
				hIndex--;
			}

			if (lIndex <= hIndex) {
				int temp = array[lIndex];
				array[lIndex] = array[hIndex];
				array[hIndex] = temp;

				lIndex++;
				hIndex--;
			}
		}

		if (low < hIndex) {
			quickSort(array, low, hIndex);
		}

		if (high > lIndex) {
			quickSort(array, lIndex, high);
		}

	}
}
