package com.leet;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < array.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j])
                    array[k++] = nums1[i++];
                else
                    array[k++] = nums2[j++];
            } else if (i < nums1.length)
                array[k++] = nums1[i++];
            else
                array[k++] = nums2[j++];

        }
        double med;
        if (array.length % 2 == 0)
            med = (array[array.length / 2] + array[(array.length / 2) - 1]) / 2.0000;
        else
            med = array[array.length / 2];
        return med;
    }
}