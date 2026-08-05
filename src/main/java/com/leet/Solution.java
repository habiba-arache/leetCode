package com.leet;

import java.util.HashMap;

public class Solution {

    public int romanToInt(String string) {
        int i, number = 0, num;
        char[] str = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (i = 0; i < str.length - 1; i++) {
            num = map.get(str[i]);
            if (num < map.get(str[i + 1])) {
                number -= num;
            } else {
                number += num;
            }
        }
        number += map.get(str[str.length - 1]);//last one 
        return number;
    }
}
