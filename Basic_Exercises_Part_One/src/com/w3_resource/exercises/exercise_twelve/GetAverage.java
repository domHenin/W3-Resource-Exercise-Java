package com.w3_resource.exercises.exercise_twelve;

public class GetAverage extends GetNumbers {
    public GetAverage(int firNum, int secNum, int thirNum) {
        super(firNum, secNum, thirNum);
    }

    @Override
    public int getFirNum() {
        return super.getFirNum();
    }

    @Override
    public int getSecNum() {
        return super.getSecNum();
    }

    @Override
    public int getThirNum() {
        return super.getThirNum();
    }

    public int solveFor() {
        int average = (getFirNum() + getSecNum() + getThirNum()) / 3;

        System.out.println("The Average of those Numbers: "+average);

        return average;
    }
}
