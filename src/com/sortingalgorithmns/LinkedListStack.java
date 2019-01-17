package com.sortingalgorithmns;

public class LinkedListStack {

	private Node head;

	private class Node {
		Node next;
		int value;
	}

	LinkedListStack() {
		head = null;
	}

	public void push(int data) {
		Node oldHead = head;
		head = new Node();
		head.value = data;
		head.next = oldHead;
	}

	public int pop() {

		if (head == null) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int value = head.value;
		head = head.next;
		return value;

	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int peek() {
		return head.value;
	}

	public static void main(String args[]) {

		LinkedListStack lls = new LinkedListStack();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		System.out.println(lls.pop());

		System.out.println(lls.pop());

		System.out.println(lls.isEmpty());

		System.out.println(lls.peek());

	}

}
