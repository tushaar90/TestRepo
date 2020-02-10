package com.tushar.test;

import com.sun.xml.internal.ws.util.StringUtils;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "abc";
		
		String repeated = new String(new char[2]).replace("\0", name1);
		
		System.out.println(repeated);
		/*for(int i=0;i<name1.length();i++) {
			char c = name1.charAt(i);	
			String s = Character.toString(c);
			System.out.println(name1.concat(s));
		}*/
		
		
		

	}

}
