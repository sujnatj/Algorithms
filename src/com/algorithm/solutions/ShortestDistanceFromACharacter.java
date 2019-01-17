package com.algorithm.solutions;

public class ShortestDistanceFromACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String actual = "loveleetcode";
		ShortestDistanceFromACharacter distance = new ShortestDistanceFromACharacter();
		int[] distamce = distance.shortestToChar(actual, 'e');

		for (int i : distamce) {
			System.out.println(i);
		}

	}

	public int[] shortestToChar(String S, char C) {

		int[] shortestLength = new int[S.length()];

		for (int i = 0; i < S.length(); i++) {

			int startIndex = i;

			int counter = 1;

			while (counter >= 0 && counter < S.length())

			{
				if (S.charAt(startIndex) == C) {
					shortestLength[i] = startIndex - i;
					break;
				}

				else if ((startIndex + counter) < S.length()
						&& S.charAt(startIndex + counter) == C) {

					shortestLength[i] = (startIndex + counter) - i;
					break;
				} else if (startIndex - counter >= 0
						&& S.charAt(startIndex - counter) == C) {
					shortestLength[i] = i - (startIndex - counter);
					break;
				}
				counter++;

			}

		}

		return shortestLength;

	}

}
