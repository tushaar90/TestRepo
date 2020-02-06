package com.tushar.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Valley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String s = "UDDDUDUUDD";
		String word = "UDU";
		String words = "UUDD";
		Pattern p = Pattern.compile(word);
		Pattern p1 = Pattern.compile(words);
		Matcher ms = p1.matcher(s);
		Matcher m = p.matcher(s);
		while(m.find() || ms.find()) {
			count++;
		}
		System.out.println(count);
	}
		
	
	}

