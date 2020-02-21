package com.tushar.test;

public class StaticTest{
	public static void check() {
		System.out.println("hello");
	}
	public void  check1() {
		System.out.println("hello");
	}
}

 class Statics extends StaticTest{
	public static void check() {
		System.out.println("world");
	}
}
 class Test1{
	 public static void main(String[] args) {
		  StaticTest.check();
		  StaticTest s = new StaticTest();
		  s.check1();
		 
	 }
 }
