package com.company.leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Character, Integer> characterIntegerMap = new HashMap<>();

    public Solution() {
        this.fillingMap();
    }

    public int romanToInt(String s) {
        int value = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I' && i + 1 < chars.length) {
                if (chars[i + 1] == 'V') {
                    value += 4;
                    i++;
                    continue;
                } else if (chars[i + 1] == 'X') {
                    value += 9;
                    i++;
                    continue;
                }
            }
            if (chars[i] == 'X' && i + 1 < chars.length) {
                if (chars[i + 1] == 'L') {
                    value += 40;
                    i++;
                    continue;
                }
                if (chars[i + 1] == 'C') {
                    value += 90;
                    i++;
                    continue;
                }
            }
            if (chars[i] == 'C' && i + 1 < chars.length) {
                if (chars[i + 1] == 'D') {
                    value += 400;
                    i++;
                    continue;
                }
                if (chars[i + 1] == 'M') {
                    value += 900;
                    i++;
                    continue;
                }
            }
            value += this.characterIntegerMap.get(chars[i]);
        }
        return value;
    }

    private void fillingMap() {
        this.characterIntegerMap.put('I', 1);
        this.characterIntegerMap.put('V', 5);
        this.characterIntegerMap.put('X', 10);
        this.characterIntegerMap.put('L', 50);
        this.characterIntegerMap.put('C', 100);
        this.characterIntegerMap.put('D', 500);
        this.characterIntegerMap.put('M', 1000);
    }

    //s.replace("IV", "4");
    //s.replace("IX", "9");
}
