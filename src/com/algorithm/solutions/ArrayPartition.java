package com.algorithm.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;



//Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//Example 1:
//
//Input: [1,4,3,2]
//
//Output: 4
//Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
//Note:
//
//n is a positive integer, which is in the range of [1, 10000].
//All the integers in the array will be in the range of [-10000, 10000].

public class ArrayPartition {
	
	public static void main(String[] args)
	{
		ArrayPartition partion = new ArrayPartition();
		
		int[] array = {1,4,3,2};
		System.out.println(partion.arrayPairSum(array));
	}
	
	
public int arrayPairSum(int[] array) {
	
	Arrays.sort(array);
	int max =0;	
	for (int s = 0; s < array.length; s=s+2) {		
		System.out.println(s);
		max = array[s]+max;
		
	}
	return max;
       
    }


	
	

}
