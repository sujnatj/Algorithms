package com.algorithm.solutions;

public class HammingDistance {

	public static void main(String[] args) {

		HammingDistance hamming = new HammingDistance();
		
		
		
		
		System.out.println(hamming.hammingDistance(297630147, 147274294));
		// TODO Auto-generated method stub

	}

	public int hammingDistance(int x, int y) {
		
		
		return Integer.bitCount(x ^ y);

//		String firstVal = Integer.toString( x,2);
//		String secondVal = Integer.toString(y,2);
//		
//
//		
//		System.out.println(firstVal);
//		System.out.println(secondVal);
//
//		int diff = 0;
//		for (int i = 0; i < firstVal.length(); i++) {
//			if (firstVal.charAt(i) != secondVal.charAt(i)) {
//				diff++;
//			}
//		}
//
//		return diff;

	}

}
