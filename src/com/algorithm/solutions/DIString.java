package com.algorithm.solutions;

//Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
//
//Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
//
//If S[i] == "I", then A[i] < A[i+1]
//If S[i] == "D", then A[i] > A[i+1]

public class DIString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DIString diStr = new DIString();
		int[] newArray = diStr.diStringMatch("DDI");

		for (int i : newArray) {
			System.out.print(i + " ");
		}

	}

	public int[] diStringMatch(String S) {
		
		int lowNumber = 0;
		int highNumber = S.length();
        int[] values = new int[highNumber + 1];
		
		for (int i = 0; i < S.length(); ++i) {
			
			if(S.charAt(i) =='I')
				
			{
				values[i] = lowNumber++;
				
			}
			else
			{
				values[i] = highNumber--;
			}
		}
		values[S.length()] = lowNumber;
		
		return values;
		
		

		


	}

}
