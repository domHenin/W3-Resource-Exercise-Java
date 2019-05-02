package com.w3_resource.exercises.exercise_twelve;

import java.util.Scanner;

public class ExerTwelve {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Three Numbers to get the Average..");

        GetAverage getAverage = new GetAverage(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        getAverage.solveFor();
    }
}

//TODO:
//        Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
