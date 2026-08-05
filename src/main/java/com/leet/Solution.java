package com.leet;

public class Solution {

    public String intToRoman(int number) {
        int i = number, num, k = 0, start = 1;
        while (i > 0) {
            k++;
            i /= 10;
        }
        k--;
        StringBuilder s = new StringBuilder();
        double pow = Math.pow(10, k);

        while (k >= 0) {
            num = (int) (number / pow);
            number %= pow;

            switch (k) {
                case 0: // ones
                    if (num == 4) {
                        s.append("IV");
                    } else if (num == 9) {
                        s.append("IX");
                    } else {
                        if (num >= 5) {
                            s.append("V");
                            start = 6;
                        }
                        for (i = start; i <= num; i++) {
                            s.append("I");
                        }
                    }
                    break;

                case 1: // tens
                    if (num == 4) {
                        s.append("XL");
                    } else if (num == 9) {
                        s.append("XC");
                    } else {
                        if (num >= 5) {
                            s.append("L");
                            start = 6;
                        }
                        for (i = start; i <= num; i++) {
                            s.append("X");
                        }
                    }
                    break;

                case 2: // hundreds
                    if (num == 4) {
                        s.append("CD");
                    } else if (num == 9) {
                        s.append("CM");
                    } else {
                        if (num >= 5) {
                            s.append("D");
                            start = 6;
                        }
                        for (i = start; i <= num; i++) {
                            s.append("C");
                        }
                    }
                    break;

                default: // thousands
                    for (i = 1; i <= num; i++) {
                        s.append("M");
                    }
                    break;
            }

            pow /= 10;
            start = 1;
            k--;
        }
        return s.toString();
    }
}
