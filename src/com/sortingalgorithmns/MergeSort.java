package com.sortingalgorithmns;

public class MergeSort {
	
	
	public static void main(String[] args) {
		int[] array = { 2, -1, -10, 3, 1, 90, -8, 34, -23, 0, -2, 83 };
		MergeSort sort = new MergeSort();
		sort.mergesort(array,0,array.length-1);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
	
	public void mergesort(int[] array, int low, int high) {
		  if(low < high) {
				System.out.println("called 0");

		    int middle = (low + high) / 2;
		    mergesort(array, low, middle);
		    mergesort(array, middle + 1, high);
		    merge(array, low, middle, high);
		    
		  }

}

	private void merge(int[] array, int low, int middle, int high) {
		
		int[] helper = new int[array.length];
		
		
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while (helperLeft <= middle && helperRight <=high) {
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
				
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current ++;		
		}
		
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current+i] = helper[helperLeft+ i];
		}
		
		
	}
}
