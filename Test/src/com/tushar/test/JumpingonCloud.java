package com.tushar.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JumpingonCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int[] a = {0 ,0, 0, 0, 1, 0};
		List<Integer> list = new LinkedList<>();
		for(Integer s:a) {
			list.add(s);
		}
	//System.out.println(list.indexOf(0));
		for(int i =0;i<list.size();i++) {
			if(list.indexOf(i)== (list.indexOf(i+1))) {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
