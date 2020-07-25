package com.epam.task;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strings {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of list");
			int num = sc.nextInt();
			System.out.println("Enter the elements in list");
			List<String> strings  = new ArrayList<String>();
			for(int i = 0; i < num; i++) {
				strings.add(sc.next());
			}
			List<String> resStrings  = search(strings); 
			System.out.println("Strings starting with letter 'a' and size of string is 3" + resStrings);
		}
		public static List<String> search(List<String> list) {
				return list.stream()
						.filter(s -> s.startsWith("a"))
						.filter(s -> s.length() == 3)
						.collect(Collectors.toList());
}
}

