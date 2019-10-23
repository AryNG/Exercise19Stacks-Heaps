package com.exercise19StacksHeaps.app;
import java.util.Stack;
public class StacksAndHeaps {

	public static void main(String[] args) {
		
//Variables-----------------------------------
		String cad = "The Square component renders A single and the Board renders 9 squAres. The Game component renders a board with placeholder vAlues which we’ll modify later. There Are currently no interactive components.";
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();

		for (Character c: lettersArray) {
			if (Character.toUpperCase(c) == 'A') {
				letters.push(c);
			}
		}
		while (!letters.isEmpty()) {
			System.out.print(letters.pop());
		}
	}

}
