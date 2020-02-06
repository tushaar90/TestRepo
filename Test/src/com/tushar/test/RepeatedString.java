package com.tushar.test;

import com.sun.xml.internal.ws.util.StringUtils;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "abc";
		int l = 10-(name1.length());
		String repeated = new String(new char[l]).replace("\0", name1);
		System.out.println(repeated);
		System.out.println(l);

	}

}
