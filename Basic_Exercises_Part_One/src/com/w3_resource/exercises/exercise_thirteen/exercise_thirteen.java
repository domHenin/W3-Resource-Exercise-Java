package com.w3_resource.exercises.exercise_thirteen;

public class exercise_thirteen {
    public static void main(String[] args) {
//        double width = 5.5;
//        double height = 8.5;
//        double answer = width * height;
//        System.out.println("Area Answer: "+answer);
//        double answerr = 2 * (width + height);
//        System.out.println("Perimeter Answer: "+answerr);

        //NEW CODE::

        AreaSolution areaSolution = new AreaSolution(5.6, 8.5);
        PerimeterSolution perimeterSolution = new PerimeterSolution(5.6, 8.5);

        areaSolution.solve();
        perimeterSolution.solve();
    }
}


//TODO:
//        Write a Java program to print the area and perimeter of a rectangle.
//        Go to the editor
//        Test Data:
//        Width = 5.6 Height = 8.5
// ..
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20

//    Rectangle	A=LW
//    Triangle	A=12bh

