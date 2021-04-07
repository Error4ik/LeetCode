package com.company.leetcode.maximum_product_of_word_lengths;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProduct(String[] words) {
        Map<String, int[]> stringMap = new HashMap<>();
        for (String word : words) {
            int[] chars = new int[26];
            for (char c : word.toCharArray()) {
                chars[c - 'a']++;
                stringMap.put(word, chars);
            }
        }

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!isMatchInt(stringMap.get(words[i]), stringMap.get(words[j]))) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }

    private boolean isMatchInt(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0 && arr2[i] != 0) {
                return true;
            }
        }
        return false;
    }
}
