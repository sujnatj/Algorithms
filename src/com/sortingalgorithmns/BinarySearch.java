package com.sortingalgorithmns;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int searchItem = 2;
		int left = 0;
		int right = array.length - 1;
		BinarySearch search = new BinarySearch();
		System.out.println(search.getValue(array, searchItem, left, right));
	}

	public int getValue(int[] array, int searchItem, int left, int right) {
		if (right >= 1 && right < array.length && left < array.length) {
			int mid = (left + right) / 2;
			if (array[mid] == searchItem)
				return mid;
			if (array[mid] > searchItem) {
				return getValue(array, searchItem, left, mid - 1);
			}
			return getValue(array, searchItem, mid + 1, right);
		}

		return -1;

	}

}
