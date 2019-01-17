package com.algorithm.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumbersDisappearedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] main = {1,1};
		FindNumbersDisappearedInArray array = new FindNumbersDisappearedInArray();
		array.findDisappearedNumbers(main);

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> arrayList = new ArrayList<Integer>();
		Arrays.sort(nums);

		int numMissing = 1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == numMissing) {
				numMissing++;
			} else if (i>0 && nums[i] == nums[i - 1]) {
				continue;

			} else {

				arrayList.add(numMissing);
				numMissing++;
			}

		}
		
		if(nums.length>0 && arrayList.size()==0)
		{
			arrayList.add(nums.length);
		}

		for (Integer value : arrayList) {
			System.out.println(value);
		}
		return arrayList;

	}

}
