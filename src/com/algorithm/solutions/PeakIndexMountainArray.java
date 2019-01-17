package com.algorithm.solutions;

public class PeakIndexMountainArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {0,2,1,0 };
		PeakIndexMountainArray peak = new PeakIndexMountainArray();
		System.out.println(peak.peakIndex(A));;

	}
	
	
	public int peakIndex(int[] array)
	{
		int peakIndexValue= array[0];
		int peakIndex =0;
	
		for(int i=1;i<(array.length+1)/2;i++)
		{
			if(peakIndexValue < array[i])
			{
				peakIndexValue = array[i];
				peakIndex = i;
			}
		}
		
		
		return peakIndex;
		
		
//		int i = 0;
//        while (array[i] < array[i+1]) i++;
//        return i;
		
	}

}
