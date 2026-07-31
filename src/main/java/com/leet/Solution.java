package com.leet;

public class Solution {
    public int maxArea(int[] array) {
        int left = 0, right = array.length - 1, area = 0;
        while (left < right) {
            area = Math.max(((right - left) * Math.min(array[left], array[right])), area);

            if (array[left] < array[right])
                left++;
            else if (array[left] > array[right])
                right--;
            else if (array[left] == array[right]) {
                left++;
                right--;
            }
        }
        return area;
    }

}