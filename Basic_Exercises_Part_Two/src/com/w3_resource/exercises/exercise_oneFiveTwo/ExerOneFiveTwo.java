package com.w3_resource.exercises.exercise_oneFiveTwo;

import java.util.Scanner;

public class ExerOneFiveTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("to the CREATOR all glory and honor!");

//        int numOne, numTwo, numThree, numFour;

        GetNumbers getNumbers = new GetNumbers();

        System.out.println("Enter First Number:");
        getNumbers.setNumOne(scanner.nextInt());

        System.out.println("Enter Second Number:");
        getNumbers.setNumTwo(scanner.nextInt());

        System.out.println("Enter Third Number:");
        getNumbers.setNumThree(scanner.nextInt());

        System.out.println("Enter Fourth Number:");
        getNumbers.setNumFour(scanner.nextInt());

        if (getNumbers.getNumOne() == getNumbers.getNumTwo() && getNumbers.getNumTwo() == getNumbers.getNumThree() && getNumbers.getNumThree() == getNumbers.getNumFour()) {
            System.out.println("Numbers are Equal!");
        } else {
            System.out.println("Numbers are NOT Equal!");
        }
    }
}


//TODO:
// Write a Java program that accepts four integer from the user and prints equal if all four are equal,
// and not equal otherwise. Go to the editor
// ..
// Sample Output:
// Input first number: 25
// Input second number: 37
// Input third number: 45
// Input fourth number: 23
// Numbers are not equal!