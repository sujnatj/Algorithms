package com.algorithm.solutions;

public class RobotOrigin {

	private int orRight;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotOrigin orgin = new RobotOrigin();
		System.out.println(orgin.judgeCircle("LD"));

	}

	public boolean judgeCircle(String moves) {

		int moveLeftRight = 0;
		int moveUpDown = 0;

		for (int i = 0; i < moves.length(); i++) {
			
			if (moves.charAt(i) == 'L')
				moveLeftRight++;
			else if(moves.charAt(i) == 'R')
				moveLeftRight--;
			else if(moves.charAt(i) == 'U')
				moveUpDown--;
			else
				moveUpDown++;
				
	
		

	}
		return (moveLeftRight == 0 && moveUpDown==0);
	}
}
