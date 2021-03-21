package com.company.leetcode.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);

        int sum = 0;

        while (n != 1) {
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n = n / 10;
            }
            n = sum;
            sum = 0;
            if (!set.add(n)) {
                return false;
            }
        }
        return true;
    }
}
