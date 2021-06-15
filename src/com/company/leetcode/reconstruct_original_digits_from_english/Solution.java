package com.company.leetcode.reconstruct_original_digits_from_english;

public class Solution {
    public String originalDigits(String s) {
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        int[] nums = new int[10];

        nums[0] = letters['z' - 'a']; // zero, only for 0
        nums[2] = letters['w' - 'a']; // two, only for 2
        nums[4] = letters['u' - 'a']; // four, only for 4
        nums[6] = letters['x' - 'a']; // six, only for 6
        nums[8] = letters['g' - 'a']; // eight, only for 8

        //remaining
        nums[1] = letters['o' - 'a'] - nums[0] - nums[2] - nums[4]; //for one, common eo in 0, o in 2 & 4
        nums[5] = letters['f' - 'a'] - nums[4]; //for five, f occurs in 4
        nums[3] = letters['t' - 'a'] - nums[2] - nums[8]; //for three, common e in 2 & 8
        nums[7] = letters['s' - 'a'] - nums[6]; // for seven, common s in 6
        nums[9] = letters['i' - 'a'] - nums[5] - nums[6] - nums[8]; //nine, i in 5,6,8

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++)
            sb.append(String.valueOf(i).repeat(Math.max(0, nums[i])));
        return sb.toString();
    }
}
