package com.company.leetcode.haystack_and_needle;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty() || !haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }

        if (!haystack.contains(needle)) {
            return -1;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();
        int needleIndex;
        int haystackIndex;
        int firstOccurrence = -1;

        for (int i = 0; i < haystack.length(); i++) {
            haystackIndex = i;
            needleIndex = 0;
            if (haystack.charAt(i) == needle.charAt(needleIndex) && haystack.length() - i >= needle.length()) {
                while (haystackIndex < haystackLength && needleIndex < needleLength
                        && haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {

                    haystackIndex++;
                    needleIndex++;
                }
            }
            if (needleIndex == needleLength) {
                firstOccurrence = i;
                break;
            }
        }

        return firstOccurrence;
    }
}
