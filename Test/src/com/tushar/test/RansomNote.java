package com.tushar.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
	
	public static HashMap<String, Integer> canBuildNote(String[] magazineWord,String[] findNote) {
		HashMap<String,Integer> hm = new  HashMap<>();
		for(String word : magazineWord) {
			if(!hm.containsKey(word)) {
				hm.put(word, 0);
			}
			hm.put(word,hm.get(word)+1 );
		} 
		HashMap<String,Integer> hmF = new  HashMap<>();
		for(String word : findNote) {
			if(!hmF.containsKey(word)) {
				hmF.put(word, 0);
			}
			hmF.put(word,hmF.get(word)+1 );
		} 
		
		return hmF;
	}

	public static void main(String[] args) {
		
		String[] magazineWord = {"Hello","world","video","is","world"};
		String[] findNote = {"Hello","is"};
		System.out.println(canBuildNote(magazineWord,findNote));
	}

}
