package com.leet;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        int index, length;
        String res;
        res = strs[0];// init
        for (String str : strs) {
            index = 0;
            length = res.length() < str.length() ? res.length() : str.length();
            while (index < length && res.charAt(index) == str.charAt(index)) {
                index++;
            }
            res = res.substring(0, index);
        }
        return res;
    }
}
