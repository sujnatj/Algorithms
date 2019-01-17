package com.algorithm.solutions;

public class FlipImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 },
				{ 1, 0, 1, 0 } };
			
			
//			{ { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 },
//				{ 1, 0, 1, 0 } };
			
			
			//
			
			
			
			
//			{ { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 },
//			{ 1, 0, 1, 0 } };
			
			
			//
			
//			{ { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 },
//				{ 1, 0, 1, 0 } };
//		
		
		

		FlipImage flipImage = new FlipImage();

		A = flipImage.flipAndInvertImage(A);

	}

	public int[][] flipAndInvertImage(int[][] A) {
		
		
		

		
		
		for (int i = 0; i < A.length; i++) {
			
			
			for (int k = 0; k < (A.length+1)/2; k++) {			
				System.out.println(k);				
				int temp =  1-A[i][k];
				A[i][k] =  1-A[i][A[i].length-1-k];
				A[i][A[i].length - 1 - k] = temp;

			}
			

		}

		for (int[] k : A) {
			for (int val : k) {
				System.out.print(val);
			}

		}

		return A;

	}

}
