package com.algorithm.solutions;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();

		int[] fibNumber = fib.getFibNumber(10);

		for (int i : fibNumber) {
		System.out.println(i);
		}
		 System.out.println(fib.fib(1));
		 
		 
		 System.out.println(fibonacci(10));

	}

	public int[] getFibNumber(int n) {
		int[] fibnumber = new int[n + 1];
		fibnumber[0] = 0;
		fibnumber[1] = 1;
		int index = 2;
		while (index <= n) {
			fibnumber[index] = fibnumber[index - 1] + fibnumber[index - 2];
			index++;
		}
		return fibnumber;
	}
	
	
public int fib(int n) {
	
	if(n<=0)
		return 0;
	if(n==1)
		return 1;
	
	
	int[] fibnumber = new int[n+1];
	fibnumber[0] = 0;
	fibnumber[1] = 1;
	int index = 2;
	while (index < n) {
		fibnumber[index] = fibnumber[index - 1] + fibnumber[index - 2];
		index++;
	}
	
	return (fibnumber[n-1] + fibnumber[n-2]);
	
	
	
	
	
        
    }

public static int fibonacci(int number)
{ 
	if(number == 1 || number == 2)
	{ 
		return 1;
	} 
	return fibonacci(number-1) + fibonacci(number -2); 
}

	
}
