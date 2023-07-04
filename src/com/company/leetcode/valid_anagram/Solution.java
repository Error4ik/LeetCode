package com.company.leetcode.valid_anagram;

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
    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }

//        char[] first = s.toCharArray();
//        char[] second = t.toCharArray();
//        Arrays.sort(first);
//        Arrays.sort(second);
//        return Arrays.equals(first, second);
//    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }

//        int[] charCounter = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            charCounter[s.charAt(i) - 'a']++;
//            charCounter[t.charAt(i) - 'a']--;
//        }
//        for (int counter : charCounter) {
//            if (counter != 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> sCounterMap = new HashMap<>();
//        Map<Character, Integer> tCounterMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            int sCharCounter = sCounterMap.getOrDefault(s.charAt(i), 0);
//            sCounterMap.put(s.charAt(i), ++sCharCounter);
//            int tCharCounter = tCounterMap.getOrDefault(t.charAt(i), 0);
//            tCounterMap.put(t.charAt(i), ++tCharCounter);
//        }
//
//        return sCounterMap.equals(tCounterMap);
//    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Long> sCounterMap = s.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        Map<Character, Long> tCounterMap = t.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        return sCounterMap.equals(tCounterMap);
//    }
}
