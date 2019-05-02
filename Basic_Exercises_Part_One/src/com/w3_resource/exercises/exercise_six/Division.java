package com.w3_resource.exercises.exercise_six;

class Division extends GetNumbers {
    public Division(int firNum, int secNum) {
        super(firNum, secNum);
    }

    public int solve() {
        int quotient = firNum / secNum;

        System.out.println("Divided Solution: "+quotient);

        return quotient;
    }
}