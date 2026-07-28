package com.leet;

public class Solution {
    public boolean isMatch(String s, String reg) {
        if (!reg.contains("*") && s.length() != reg.length())
            return false;
        int i = 0, j = 0;
        while (i < s.length() && j < reg.length()) {
            char regCharacter = reg.charAt(j);
            char character = s.charAt(i);
            if (regCharacter == character || regCharacter == '.') {
                // accept any char if .
                i++;
                j++;
            } else if (regCharacter == '*' && i >= 1 && j >= 1) {
                // loop
                char previousReg = reg.charAt(j - 1);
                if (previousReg != '.') {
                    char previous = s.charAt(i - 1);// a

                    while (i < s.length() && s.charAt(i) == previous)
                        i++;
                    j++;
                } else // .* in the word
                if (j < reg.length() - 2) {
                    j += 2;
                    while (s.charAt(i) != reg.charAt(j))
                        i++;
                } else
                    return true;

            } else if (regCharacter != character) {
                // "*" can cancel this char
                if (j < reg.length() - 1 && reg.charAt(j + 1) == '*') {
                    j += 2;
                } else // normal case
                    return false;

            }
        }
        if (j == reg.length() && i == s.length())
            return true;
        return false;
    }
}