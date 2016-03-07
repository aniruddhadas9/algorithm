package com.aniruddh.algorithm;

import java.util.*;

/**
 * 
 * Tested: Yes
 * 
 * What is Anagrams: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman
 * Another example: eat is came from tea
 * 
 * 
 *
 */

public class Anagrams {
	
    final Map<String, List<String>> lookup = new HashMap<>();
    
    public Anagrams(final List<String> words) {
        for (final String word : words) {
            final String signature = alphabetize(word);
            if (lookup.containsKey(signature)) {
                lookup.get(signature).add(word);
            } else {
                final List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                lookup.put(signature, anagramList);
            }
        }
    }
    
    private String alphabetize(final String word) {
        final byte[] bytes = word.getBytes();
        Arrays.sort(bytes);
        return new String(bytes);
    }
    
    public List<String> getAnagrams(final String word) {
        final String signature = alphabetize(word);
        final List<String> anagrams = lookup.get(signature);
        return anagrams == null ? new ArrayList<String>() : anagrams;
    }
    
    
    public static void main(String[] args) {
    	
    	List<String> words = new ArrayList<String>();
    	words.add("tea");
    	words.add("eat");
    	words.add("cinema");
    	words.add("iceman");
    	words.add("tea");
    	
    	Anagrams a = new Anagrams(words);
    	System.out.println(a.getAnagrams("tea").toString());
    }
}