package com.company.leetcode.length_of_longest_substring;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

//    Given a string, find the length of the longest substring without repeating characters.
//
//    Example 1:
//
//    Input: "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//    Example 2:
//
//    Input: "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.
//    Example 3:
//
//    Input: "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int current = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    count = Math.max(count, current);
                    map.clear();
                    current = 0;
                    break;
                }
                map.put(s.charAt(j), j);
                current++;
                count = Math.max(count, current);
            }
        }
        return count;


//        //Из ответов.
//        int n = s.length();
//        int ans = 0;
//        int[] index = new int[128]; // current index of character
//        // try to extend the range [i, j]
//        for (int j = 0, i = 0; j < n; j++) {
//            int symbol = s.charAt(j);
//            int a = index[symbol];
//            i = Math.max(a, i);
//            ans = Math.max(ans, (j - i + 1));
//            index[s.charAt(j)] = j + 1;
//        }
//        return ans;
    }
}
