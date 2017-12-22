package methods;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Question No: 20 " + getLastFiveCharList("Moniruzzaman"));

		System.out.println("Question No: 21 " + getFirstFiveChar("Moniruzzaman"));

	}

	/*
	 * Exercise: 21 
	 * Write a method that take one string input and return a list
	 * of first five character. 
	 * Parameter: String text 
	 * Return type: ArrayList<String> 
	 * Serving Container/Bucket: List
	 */

	public static ArrayList<Character> getFirstFiveChar(String text) {
		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i <= 4; i++) {

			charList.add(text.charAt(i));
		}

		return charList;
	}

	/**
	 * Exercise: 20 
	 * Write a method that take one String input and return a List
	 * of last five character. 
	 * Parameter: String text 
	 * Return type: ArrayList<Character> 
	 * Serving Bucket: List
	 */

	public static ArrayList<Character> getLastFiveCharList(String text) {
		ArrayList<Character> charList = new ArrayList<Character>();

		int starting = text.length() - 5;
		int ending = text.length() - 1;

		for (int i = starting; i <= ending; i++) {

			charList.add(text.charAt(i));
		}

		return charList;
	}

}
