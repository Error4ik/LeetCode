package com.company.leetcode.guess_number_higher_or_lower;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (guess(middle) == 0) {
                return middle;
            }
            if (guess(middle) > 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return n;
    }
}
