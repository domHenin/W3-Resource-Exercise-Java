package com.w3_resource.exercises.exercise_two;

class Sum {
    private int a=0;
    private int b=0;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

//    public int getA() {
//        return a;
//    }
//    public int getB() {
//        return b;
//    }

    public int solution(){
        int sum = a + b;
        return sum;
    }
}

public class Exer_Two {
    public static void main(String[] args) {
        Sum sum = new Sum(74, 36);

        System.out.println(sum.solution());
    }
}


//TODO:
//        Write a Java program to print the sum of two numbers. Go to the editor
//        Test Data:
//        74 + 36
//        Expected Output :
//        110