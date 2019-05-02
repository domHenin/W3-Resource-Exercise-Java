package com.w3_resource.exercises.exercise_seven;

import java.util.HashMap;
import java.util.Scanner;

public class ExerSeven {
    public static void main(String[] args) {
//      System.out.println("thank you YHVH for all you have done.");

        Scanner scanner = new Scanner(System.in);

        int number=0;
        int originNumber=1;

        System.out.println("Enter a Number: ");
        number= scanner.nextInt();

        for (int multiple = originNumber; multiple <=10; multiple += originNumber) {

            int solution = multiple* number;

            System.out.println(solution);
        }

    }
}

//    int originalNumber = 1;
//for (int multiple = originalNumber; multiple <= 10000; multiple += originalNumber) {
//        // Use multiple however you want to
//        }

//TODO:
//        Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80