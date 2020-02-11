package com.tushar.test;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = "world";
		
		Set<Character> set1 = new HashSet();
		Set<Character> set2 = new HashSet();
		
		for(char c :s1.toCharArray()) {
			set1.add(c);
		}
		for(char c :s2.toCharArray()) {
			set2.add(c);
		}
		set1.retainAll(set2);
		/*if(set1.size()>0) {
			return "Yes";
		}
		return "No";*/

	}

}
