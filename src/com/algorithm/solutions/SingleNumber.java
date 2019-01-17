package com.algorithm.solutions;



//iven a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleNumber single = new SingleNumber();
		int[] newNumber = {4,1,2,1,2};
		single.singleNumber(newNumber);
		
		
		
		

	}
	
public int singleNumber(int[] nums) {
	
	int value = 0;
    for(int num: nums) {
    	value ^= num;
       
    }
    return value;
	
	
	
}
	
	

	
	


	

}
