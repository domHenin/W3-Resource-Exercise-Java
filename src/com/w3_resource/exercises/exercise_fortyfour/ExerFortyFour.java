package com.w3_resource.exercises.exercise_fortyfour;

import java.util.Scanner;

public class ExerFortyFour {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n=0;

        char s1, s2, s3;

        System.out.print("Enter Number: ");

        n = scanner.nextInt();

        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}

//TODO:
//    Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
//        Sample Output:
// ..
//        Input number: 5
//        5 + 55  + 555
