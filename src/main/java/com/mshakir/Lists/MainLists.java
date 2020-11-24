package com.mshakir.Lists;

import java.util.ArrayList;
import java.util.List;

public class MainLists {
	public static void main(String[] args) {

		Person p1 = new Person("Charles", "Dickens", 0);
		Person p2 = new Person("Lewis", "Arnold", 0);
		Person p3 = new Person("Mathew", "Sarah", 0);
		Person p4 = new Person("Shakir", "Munawar", 0);

		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);

		System.out.println("*****************");
		printAll(people);
		System.out.println("*****************");
		printFirstNameStartwithS(people);
		
		people.forEach(p -> System.out.println(p));
	}
	//	Using Lamba Expression
	
	private static void printFirstNameStartwithS(List<Person> people) {
		for (Person p : people) {
			if (p.getFirstName().startsWith("S")) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
