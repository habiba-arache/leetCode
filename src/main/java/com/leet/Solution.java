package com.leet;

public class Solution {
    public double sqrt(double x, double delta) {
        if (x == 0)
            return x;
        return findSqrt(0, x, x, delta);
    }

    private double findSqrt(double start, double end, double target, double delta) {
        double middle = (start + end) / 2;
        double square = (middle * middle);
        double absDiff = Math.abs(square - target);

        if (absDiff <= delta)
            return middle;
        else if (square > target)
            return findSqrt(start, middle, target, delta);
        else
            return findSqrt(middle, end, target, delta);
    };
}