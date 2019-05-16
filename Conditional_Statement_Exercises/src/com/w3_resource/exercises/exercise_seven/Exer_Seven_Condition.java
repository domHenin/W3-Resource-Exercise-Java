package com.w3_resource.exercises.exercise_seven;

import com.w3_resource.exercises.exercise_thirty_one.GetNumbers;

import java.util.Scanner;

public class Exer_Seven_Condition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("to the CREATOR all glory and honor!");

        GetMonth getMonth = new GetMonth();

//        int num_days_InMonth=0;
//        String MonthOfName = "Unknown";
//
        System.out.println("Input a month number:");
        getMonth.setMonth(scanner.nextInt());

        System.out.println("Input a year:");
        getMonth.setYear(scanner.nextInt());

        getMonth.makeCase();
    }
}
//HINT:: use switch statement for month
//TODO:
//        Write a Java program to find the number of days in a month. Go to the editor
//
//        Test Data
//        Input a month number: 2
//        Input a year: 2016
//        Expected Output :
//        February 2016 has 29 days