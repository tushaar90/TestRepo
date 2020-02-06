package com.tushar.test;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Solution {

	    // Complete the sockMerchant function below.
	    static int sockMerchant(int n, int[] ar) {
			// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			int count = 0;
			int freq = 0;
			
			int[] a = {1,2,1,3,4,2,6,2,2};
			List<int[]> socksList =Arrays.asList(a);
			List<Integer> socksLisst = new ArrayList();
			for(Integer i :a) {
				socksLisst.add(i);
				System.out.println(i+":"+Collections.frequency(socksLisst, i));
				 freq = Collections.frequency(socksLisst, i);
				 if(freq %2 == 0) {
					// int t = freq/2;
					 count = count+1;
				 }
			}
			return count;
			
			 }
	      

	       
	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	


}
