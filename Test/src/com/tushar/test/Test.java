package com.tushar.test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int a[] = {1,2,1,3,4,2,6,2};
		List<int[]> socksList = Arrays.asList(a);
		for(int i = 0; i< socksList.size();i++) {
			for(int j=i+1;j<socksList.size();j++) {
				count++;
			}
		}
		return count;
	}

}
