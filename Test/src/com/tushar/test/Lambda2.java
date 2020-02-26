package com.tushar.test;

interface Interf1{
	public int getLength(String s);
}

public class Lambda2 {

	public static void main(String[] args) {
		Interf1 i = s->s.length();
		System.out.println(i.getLength("Tushar"));

	}

}
