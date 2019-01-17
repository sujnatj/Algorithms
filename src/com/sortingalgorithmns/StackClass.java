package com.sortingalgorithmns;

public class StackClass {

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(1);
		stack.push(20);
		stack.push(3);
		stack.push(80);
		stack.push(800);
		System.out.println(stack.peep());
		System.out.println(stack.maxValue());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.maxValue());
		System.out.println(stack.isEmpty());

	}

}

class Stack {

	int[] maxArray = new int[1000];
	int top;

	Stack() {
		top = -1;

	}

	public void push(int value) {

		maxArray[++top] = value;
	}

	public int pop() {

		if (top > 0) {

			int popValue = maxArray[top--];
			return popValue;
		} else {
			throw new StackOverflowError();
		}

	}

	public int peep() {
		if (top > 0) {

			return maxArray[top];
		} else {
			throw new StackOverflowError();
		}
	}

	boolean isEmpty() {
		return (top == -1);
	}

	public int maxValue() {

		int max = 0;
		for (int i = 0; i < top; i++) {
			if (maxArray[i] > max) {
				max = maxArray[i];
			}
		}

		return max;

	}

}
