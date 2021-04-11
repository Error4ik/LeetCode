package com.company.leetcode.reverse_vowels_of_a_string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        char[] chars = s.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        for (; i < j; i++) {
            if (vowels.contains(chars[i])) {
                for (; j > i ; j--) {
                    if (vowels.contains(chars[j])) {
                        char tmp = chars[i];
                        chars[i] = chars[j];
                        chars[j--] = tmp;
                        break;
                    }
                }
            }
        }

        return String.valueOf(chars);
    }
}
