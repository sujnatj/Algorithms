package com.algorithm.solutions;

import java.util.HashSet;
//Approach 1: Canonical Form
//
//Intuition and Algorithm
//
//For each email address, convert it to the canonical address that actually receives the mail. This involves a few steps:
//
//Separate the email address into a local part and the rest of the address.
//
//If the local part has a '+' character, remove it and everything beyond it from the local part.
//
//Remove all the zeros from the local part.
//
//The canonical address is local + rest.
//
//After, we can count the number of unique canonical addresses with a Set structure
public class UniqueEmailAddress929 {

	public static void main(String[] args) {

		// . will be ingored
		// '+' everything after first +is ignored
		String[] emails = { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		System.out.println(numUniqueEmails(emails));

	}

	public static int numUniqueEmails(String[] emails) {

		HashSet<String> email_ids = new HashSet<String>();

		for (String str : emails) {
			String localname = str.split("@")[0];
			if (localname.contains(".")) {
				localname = localname.replace(".", "");
			}
			if (localname.contains("+")) {
				localname = localname.split("\\+")[0];
			}
			email_ids.add(localname + "@" + str.split("@")[1]);
		}

		return email_ids.size();

	}

}
