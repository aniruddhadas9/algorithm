package com.candifood.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInStringEbay {

    public static void main(String a[]) {
        DuplicateCharInStringEbay dcs = new DuplicateCharInStringEbay();
        dcs.findDuplicateChars("Java2Novice and can be tested");
    }

    public void findDuplicateChars(String str) {

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for (Character ch : chrs) {
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }

        Set<Character> keys = dupMap.keySet();
        for (Character ch : keys) {
            if (dupMap.get(ch) > 1) {
                System.out.println(ch + "--->" + dupMap.get(ch));
            }
        }
    }

}
