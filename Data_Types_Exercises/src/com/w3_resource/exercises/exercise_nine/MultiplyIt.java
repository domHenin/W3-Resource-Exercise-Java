package com.w3_resource.exercises.exercise_nine;

public class MultiplyIt extends AcceptNumbers {
    public MultiplyIt(int num1, int num2) {
        super(num1, num2);
    }

    public int solveFor() {
        int ans = getNum1() * getNum2();

        System.out.printf("Product of two integers: ", ans);
        return ans;
    }
}
