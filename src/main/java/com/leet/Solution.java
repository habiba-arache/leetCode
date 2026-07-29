package com.leet;

public class Solution {
    public int maxArea(int[] height) {

        // find 2 max / calculate area , suppose it is the max then repeat till length/2
        int length = height.length, left = 0, right = 0, maxArea = 0,k=0;
        boolean done = false;
        if (length == 2)
            return height[0] > height[1] ? height[0] : height[1];

        while (done == false) {
            for (int i = 0; i < length / 2; i++) {
                if (height[i] > height[left]) {
                    left = i;
                }
            }
            for (int i = length / 2; i < length; i++) {
                if (height[i] > height[right]) {
                    right = i;
                }
            }
            int h = 0;
            if (height[right] == height[left]) {
                height[left] = 0;
                height[right] = 0;
                int nextMax = sorted[k++];
                // check where does the next max exist
                h = height[left];
                height[left] = nextMax;
                height[right] = nextMax;
            } else if (height[right] > height[left]) {
                h = height[left];
                height[right] = height[left];
            } else {
                h = height[right];
                height[left] = height[right];
            }
            int l = Math.abs(left - right);
            maxArea = maxArea > h * l ? maxArea : h * l;
            for (int i : height) {
                if (i != 0)
                    break;
                if (i == length - 1)
                    done = true;
            }
        }
        return maxArea;
    }
}