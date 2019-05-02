package com.w3_resource.exercises.exercise_eleven;

public class ExerEleven {
    public static void main(String[] args) {
        SolveArea solveArea = new SolveArea(7.5);
        SolvePerimeter solvePerimeter = new SolvePerimeter(7.5);

        solveArea.solveFor();
        solvePerimeter.solveFor();
    }
}

// Solve for area: A = pi*r^2
// Solve for perimeter: C = 2*pi*r

//TODO:
//    Write a Java program to print the area and perimeter of a circle. Go to the editor
//    Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586