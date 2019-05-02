package com.w3_resource.exercises.exercise_five;

import java.util.Scanner;

class Product {
    private int firstNum=0;
    private int secondNum=0;

    //SETTERS
    public void setFirstNum(int firstNum) { this.firstNum = firstNum; }
    public void setSecondNum(int secondNum) { this.secondNum = secondNum; }

    //GETTERS
    public int getFirstNum() { return firstNum; }
    public int getSecondNum() { return secondNum; }

    public int solveProblem() {
        int sum = firstNum * secondNum;

        System.out.println(sum);

        return sum;
    }
}

public class ExerFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Input first number: ");
        product.setFirstNum(scanner.nextInt());

        System.out.println("Input second number: ");
        product.setSecondNum(scanner.nextInt());

        product.solveProblem();
    }
}

//TODO:
//        Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
