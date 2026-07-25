package com.leet;

public class Solution {
    public boolean isPalindrome(int x) {
        int length = 0, a = x, j;
        if (a < 0)
            return false;
        if (a < 10)
            return true;
        while (a > 0) {
            length++;
            a /= 10;
        }
        j = (int) Math.pow(10, length - 1);
        while (length >= 1) {
            if (x % 10 != x / j)
                return false;
            x = x % j;
            x /= 10;
            length -= 2;
            j /= 100;
        }
        return true;
    }
}