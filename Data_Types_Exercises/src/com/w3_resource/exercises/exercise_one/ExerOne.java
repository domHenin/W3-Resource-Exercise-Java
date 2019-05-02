package com.w3_resource.exercises.exercise_one;

import java.util.Scanner;

public class ExerOne {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("thank you JESUS, for loving me first!");

        Fahrenheit_Celsius fahrenheit_celsius = new Fahrenheit_Celsius();

        System.out.println("Enter temperature in Fahrenheit:");
        fahrenheit_celsius.setFahrenheit(scanner.nextDouble());

        fahrenheit_celsius.calculate();


//        double celsius, fahrenheit;
//        fahrenheit = scanner.nextDouble();
//        celsius = (fahrenheit-32)*(0.5556);
//        System.out.printf("Temperature in Celcius: %.2f",celsius);

    }
}

//FORMULA::celsius = (fahrenheit-32)*(0.5556);
//Fahrenheit_Celsius

//TODO:
// Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
// Test Data
// Input a degree in Fahrenheit: 212
// Expected Output:
// 212.0 degree Fahrenheit is equal to 100.0 in Celsius