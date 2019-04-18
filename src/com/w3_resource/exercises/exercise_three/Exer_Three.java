package com.w3_resource.exercises.exercise_three;

class Divide {
    private int a=0;
    private int b=0;

    public Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int quotient() {
        int sum = b / a;

        return sum;
    }
}


public class Exer_Three {
    public static void main(String[] args) {
        Divide divide = new Divide(3, 50);

        System.out.println(divide.quotient());
    }
}

//TODO:
//        Write a Java program to divide two numbers and print on the screen. Go to the editor
//        Test Data :
//        50/3
//        Expected Output :
//        16
