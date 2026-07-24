package com.leet;

public class Solution {
    public int reverse(int x) {
        StringBuilder rev = new StringBuilder("0");
        boolean flag = x < 0;
        while (x != 0) {
            rev.append(Math.abs(x % 10));
            x = x / 10;
        }
        long l = Long.parseLong(rev.toString());

        if ((int) l != l)
            return 0;
        return flag ? Integer.parseInt("-" + rev) : Integer.parseInt(rev + "");
    }
}