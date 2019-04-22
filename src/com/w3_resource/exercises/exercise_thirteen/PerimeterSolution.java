package com.w3_resource.exercises.exercise_thirteen;

public class PerimeterSolution extends GivenNumber {
    public PerimeterSolution(double width, double height) {
        super(width, height);
    }

    public double solve() {
        double solution = 2 * (getWidth() + getHeight());

        System.out.printf("Perimeter Solution: %.2f", solution);

        return solution;
    }
}
