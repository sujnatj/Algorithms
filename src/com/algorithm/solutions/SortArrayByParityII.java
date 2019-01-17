package com.algorithm.solutions;

//Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
//
//Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
//
//You may return any answer array that satisfies this condition.

public class SortArrayByParityII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArrayByParityII sort = new SortArrayByParityII();

		int[] array = { 3, 4, 11, 18 };

		sort.sortArrayByParityII(array);

		// for(int i:array)
		// {
		// System.out.print(i +" ");
		// }
		//
		//

	}

	public int[] sortArrayByParityII(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int index = i;
			if ((i % 2 == 0 && array[i] % 2 != 0)
					|| (i % 2 != 0 && array[i] % 2 == 0)) {

				while (index < array.length) {
					if (array[i] % 2 == 0
							&& (index % 2 == 0 && array[index] % 2 != 0))

					{
						int temp = array[i];
						array[i] = array[index];
						array[index] = temp;

						break;
					} else if (array[i] % 2 != 0
							&& (index % 2 != 0 && array[index] % 2 == 0)) {
						int temp = array[i];
						array[i] = array[index];
						array[index] = temp;
						break;
					}
					index++;
				}

			}

		}

		return array;
	}

}
