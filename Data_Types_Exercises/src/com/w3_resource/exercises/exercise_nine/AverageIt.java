package com.w3_resource.exercises.exercise_nine;

public class AverageIt extends AcceptNumbers {
    public AverageIt(int num1, int num2) {
        super(num1, num2);
    }

    public int solveFor() {
        int ans = getNum1() + getNum2() / 2;

        System.out.printf("Average of two integers:%.2f", ans);
        return ans;
    }
}
