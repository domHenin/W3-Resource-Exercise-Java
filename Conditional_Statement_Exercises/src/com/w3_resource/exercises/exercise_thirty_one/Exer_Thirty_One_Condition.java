package com.w3_resource.exercises.exercise_thirty_one;

import java.util.Scanner;

public class Exer_Thirty_One_Condition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("thank you YHVH for your son JESUS CHRIST");

        GetNumbers getNumbers = new GetNumbers();

        System.out.println("Input first number:");
        getNumbers.setFirNum(scanner.nextInt());

        System.out.println("Input second number:");
        getNumbers.setSecNum(scanner.nextInt());

        System.out.println("Input third number:");
        getNumbers.setThirdNum(scanner.nextInt());

// Conditional Statement
        if (getNumbers.getFirNum() > getNumbers.getSecNum() && getNumbers.getSecNum() > getNumbers.getThirdNum()) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Increasing order");
        }
    }
}

//TODO:
// Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing
// order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
// Go to the editor
// ..
//        Test Data
//        Input first number: 1524
//        Input second number: 2345
//        Input third number: 3321
//        Expected Output :
// ..
//        Increasing order
