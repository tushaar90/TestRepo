package com.tushar.array;

import java.util.HashMap;
import java.util.Map;


public class Driver {
	// Person person ;

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for(int i=0;i<10;i++) {
			map.put(i, "tushar"+i);
		}
		//System.out.println("map"+map);
		for(Map.Entry<Integer, String> imap : map.entrySet()) {
			System.out.println(imap.getKey());
		}
		
	}

}
