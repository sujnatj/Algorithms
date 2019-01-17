package com.sortingalgorithmns;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 2, -1, -10, 3, 1, 90, -8, 34, -23, 0, -2, 83 };
		insertionSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	private static void insertionSort(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<array.length;i++)
		{
			int k=i;
			while(k>0 && array[k] < array[k-1])
			{
				int temp = array[k];
				array[k] = array[k-1];
				array[k-1] = temp;
				k--;
				
			}
			
		}
		
	}

}
