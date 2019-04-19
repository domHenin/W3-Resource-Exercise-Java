package com.w3_resource.exercises.exercise_six;

class Multiplication extends GetNumbers {
    public Multiplication(int firNum, int secNum) {
        super(firNum, secNum);
    }

    public int solve() {
        int product = firNum * secNum;
        System.out.println("Multiplied Solution: "+product);

        return product;
    }
}