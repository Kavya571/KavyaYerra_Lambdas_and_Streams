package com.epam.task;

import java.util.*;
import java.util.function.Predicate;

class CheckPalindrome {
	 public static boolean isPalindrome(String originalString) {
	        String reversedString = new StringBuilder(originalString).reverse().toString();
	        return originalString.equals(reversedString);
	 
	    }
}
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int num = sc.nextInt();
		System.out.println("Enter the list of strings:");
		List<String> list = new ArrayList<String>();
		sc.nextLine();
		for(int i=0;i<num;i++) {
			String str = sc.nextLine();
			list.add(str);
		}
		List<String> palindrome = PalindromeString.filtercheckString(list, CheckPalindrome::isPalindrome);
		System.out.println("Palindrome strings are : " + palindrome);	
	}

	public static List<String> filtercheckString(List<String> strings, Predicate<String> palinP) {
		List<String> list = new ArrayList<String>();
		for(String str:strings) {
			if(palinP.test(str)) {
				list.add(str);
			}
		} return list;
	}
}