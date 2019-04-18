package com.w3_resource.exercises.exercise_six;

public class Addition extends GetNumbers {
    @Override
    public int getFirNum() {
        return super.getFirNum();
    }

    @Override
    public int getSecNum() {
        return super.getSecNum();
    }
    //    private int firNum=0;
//    private int secNum=0;

//    public void setFirNum(int firNum) { this.firNum = firNum; }
//    public void setSecNum(int secNum) { this.secNum = secNum; }
//
//    public int getFirNum() { return firNum; }
//    public int getSecNum() { return secNum; }

    public int solve() {
        int sum = firNum + secNum;
        System.out.println("Added Solution: "+sum);

        return sum;
    }
}
