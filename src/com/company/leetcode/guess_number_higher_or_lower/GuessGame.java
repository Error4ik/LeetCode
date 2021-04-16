package com.company.leetcode.guess_number_higher_or_lower;


public class GuessGame {

    private int myNumber = 6;

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */
    public int guess(int num) {
        return Integer.compare(myNumber, num);
    }
}
