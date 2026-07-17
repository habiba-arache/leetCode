package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        List<Character> res = new ArrayList<>();
        for (char i : s.toCharArray()) {
            if (res.contains(i)) {
                max = Math.max(max, res.size());
                res = res.subList(res.indexOf(i) + 1, res.size());
            }
            res.add(i);
        }
        return Math.max(max, res.size());
    }
}