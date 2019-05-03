package com.w3_resource.exercises.exercise_two;

import java.util.Scanner;

public class ExerTwo {

    static final double finVal = 39.37;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("the Creator of everything i see is the GOD that i serve!");
        double ans=0;

//        double inch=0;
//        double meter=0;
//        inch = scanner.nextDouble();
//        ans = inch / 39.37;
//        System.out.printf("%.2f",ans);

        InchesToMeters inchesToMeters = new InchesToMeters();

        System.out.println("Enter inches:");
        inchesToMeters.setInch(scanner.nextDouble());

        ans = inchesToMeters.getInch() / finVal;

        System.out.printf("Meter:%.2f", ans);
    }
}

// Formula:: divide the length value by 39.37
//TODO:
//        Write a Java program that reads a number in inches, converts it to meters. Go to the editor
//        Note: One inch is 0.0254 meter.
//        Test Data
//        Input a value for inch: 1000
//        Expected Output :
//        1000.0 inch is 25.4 meters
