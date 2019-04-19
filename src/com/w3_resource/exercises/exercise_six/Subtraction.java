package com.w3_resource.exercises.exercise_six;

class Subtraction extends GetNumbers {
    public Subtraction(int firNum, int secNum) { super(firNum, secNum); }

    public int solve() {
        int difference = firNum - secNum;

        System.out.println("Subtracted Solution: "+difference);

        return difference;
    }
}
