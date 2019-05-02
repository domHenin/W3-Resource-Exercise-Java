package com.w3_resource.exercises.exercise_six;

import java.util.Scanner;

//class Multiplication {
//    private int firNum=0;
//    private int secNum=0;
//
//    public void setFirNum(int firNum) { this.firNum = firNum; }
//    public void setSecNum(int secNum) { this.secNum = secNum; }
//
//    public int getFirNum() { return firNum; }
//    public int getSecNum() { return secNum; }
//
//    public int solution() {
//        int product = firNum * secNum;
//        System.out.println("Multiplied Solution: "+product);
//
//        return product;
//    }
//}

//class Division {
//    private int firNum=0;
//    private int secNum=0;
//
//    public void setFirNum(int firNum) { this.firNum = firNum; }
//    public void setSecNum(int secNum) { this.secNum = secNum; }
//
//    public int getFirNum() { return firNum; }
//    public int getSecNum() { return secNum; }
//
//    public int solution() {
//        int quotient = firNum / secNum;
//        System.out.println("Divided Solution: "+quotient);
//
//        return quotient;
//    }
//}

public class ExerSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        GetNumbers getNumbers = new GetNumbers();
        Addition addition = new Addition(125,24);
        Subtraction subtraction = new Subtraction(125, 24);
        Multiplication multiplication = new Multiplication(125, 24);
        Division division = new Division(125, 24);



//  GET FIRST NUMBER.
//        System.out.println("Input first Number: ");
//        getNumbers.setFirNum(scanner.nextInt());

//  GET SECOND NUMBER.
//        System.out.println("Input second Number: ");
//        getNumbers.setFirNum(scanner.nextInt());

        addition.solve();
        subtraction.solve();
        multiplication.solve();
        division.solve();

    }
}


//TODO:
//        Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5