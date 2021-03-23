package com.company.leetcode.valid_anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        for (char c : first) {
            if (characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            } else {
                characterIntegerMap.put(c, 0);
            }
        }

        for (char c : second) {
            if (characterIntegerMap.containsKey(c)) {
                if (characterIntegerMap.get(c) > 0) {
                    characterIntegerMap.put(c, characterIntegerMap.get(c) - 1);
                } else {
                    characterIntegerMap.remove(c);
                }
            }
        }

        return characterIntegerMap.isEmpty();

//        char[] first = s.toCharArray();
//        char[] second = t.toCharArray();
//        Arrays.sort(first);
//        Arrays.sort(second);
//        return Arrays.equals(first, second);
    }
}
