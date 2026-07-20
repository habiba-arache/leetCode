package com.leet;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev += s.charAt(s.length() - i - 1);
        }
        int[][] matrix = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < rev.length(); j++) {
                if (s.charAt(i) == rev.charAt(j))
                    if (i == 0 || j == 0)
                        matrix[i][j] = 1;
                    else
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                else
                    matrix[i][j] = 0;
            }
        }
        int max = -1;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = i;
                }
            }
        }
        if (index != -1 && max != -1)
            return s.substring(index - max + 1, index + 1);
        return s.charAt(0) + "";
    }
}