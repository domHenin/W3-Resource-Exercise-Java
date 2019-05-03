package com.w3_resource.exercises.exercise_nine;

import java.util.Scanner;

public class ExerNineData {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Blessed be the name of JESUS, the name above all names.");

        System.out.println("input both values");
        AdditionIt additionIt = new AdditionIt(scanner.nextInt(), scanner.nextInt());
        SubtractIt subtractIt = new SubtractIt(scanner.nextInt(), scanner.nextInt());
        DivideIt divideIt = new DivideIt(scanner.nextInt(), scanner.nextInt());
        MultiplyIt multiplyIt = new MultiplyIt(scanner.nextInt(), scanner.nextInt());
        AverageIt averageIt = new AverageIt(scanner.nextInt(), scanner.nextInt());


        additionIt.solveFor();
        subtractIt.solveFor();
        divideIt.solveFor();
        multiplyIt.solveFor();
        averageIt.solveFor();



    }
}

//TODO:
// Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product,
// the average, the distance (the difference between integer), the maximum (the larger of the two integers),
// the minimum (smaller of the two integers). Go to the editor
// ..
// Test Data
// Input 1st integer: 25
// Input 2nd integer: 5
// Expected Output :
// Sum of two integers: 30
// Difference of two integers: 20
// Product of two integers: 125
// Average of two integers: 15.00
// Distance of two integers: 20
// Max integer: 25
// Min integer: 5
