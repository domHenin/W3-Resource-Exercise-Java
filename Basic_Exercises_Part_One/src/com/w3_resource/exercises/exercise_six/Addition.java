package com.w3_resource.exercises.exercise_six;

class Addition extends GetNumbers {
    public Addition(int firNum, int secNum) {
        super(firNum, secNum);
    }

//    @Override
//    public int getFirNum() {
//        return super.getFirNum();
//    }
//    @Override
//    public int getSecNum() {
//        return super.getSecNum();
//    }

//    public Addition(int firNum, int secNum) {
//        super(firNum, secNum);
//    }
//
    public int solve() {
        int sum = firNum + secNum;
        System.out.println("Added Solution: "+sum);

        return sum;
    }
}


//BONEYARD::
//    private int firNum=0;
//    private int secNum=0;
//    public void setFirNum(int firNum) { this.firNum = firNum; }
//    public void setSecNum(int secNum) { this.secNum = secNum; }
//    public int getFirNum() { return firNum; }
//    public int getSecNum() { return secNum; }