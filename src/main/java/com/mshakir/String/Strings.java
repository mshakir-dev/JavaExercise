package com.mshakir.String;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String[] words = { "Muhammad", "Shakir", "Munawar", "Bhilia" };
		System.out.println(Arrays.toString(words));
		for (String word : words) {
			if (word.startsWith("M")) {
				System.out.println("Words start with M: " + word);
			}
		}
		for (String word : words) {
			if (word.endsWith("r")) {
				System.out.println("Ends with : " + word);
			}
		}

	}

}
