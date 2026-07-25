package com.leet;

public class Solution {
    public int myAtoi(String src) {
        boolean isEmpty = true;
        int sign = 1, intResult = 0, digit = 0;

        for (char character : src.toCharArray()) {
            if (isEmpty && character == '+')
                isEmpty = false;
            else if (isEmpty && character == '-') {
                isEmpty = false;
                sign = -1;
            } else if (character >= '0' && character <= '9')// digit
            {
                digit = character - '0';
                if (intResult > (Integer.MAX_VALUE - digit) / 10)
                    return Integer.MAX_VALUE;

                if (intResult < (Integer.MIN_VALUE + digit) / 10)
                    return Integer.MIN_VALUE;
                intResult = (intResult * 10) + (sign * digit);
                isEmpty = false;
            } else if (character != ' ' || (character == ' ' && !isEmpty))
                break;
        }
        return intResult;
    }

}