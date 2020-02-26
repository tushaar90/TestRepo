package com.tushar.test;

interface Interf{
public void add(int a,int b);
}

public class Lambda {

	public static void main(String[] args) {
		Interf i = (a,b)->System.out.println("the sum is "+(a+b));
		i.add(10, 20);
	}

}
