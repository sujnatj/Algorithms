package com.algorithm.solutions;

public class DeleteColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "cba", "daf", "ghi" };

		minDeletionSize(array);

	}

	public static int minDeletionSize(String[] A) {

		String[] newarray = new String[A.length];
		int index = 0;
		for (String value : A) {
			StringBuilder sb = new StringBuilder(value);
			sb.deleteCharAt(0);
			newarray[index] = sb.toString();
			index++;
		}
		for (String str : newarray) {
			System.out.println(str + "");
		}
		return 0;
	}

}
